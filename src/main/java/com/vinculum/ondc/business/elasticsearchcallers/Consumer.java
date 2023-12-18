package com.vinculum.ondc.business.elasticsearchcallers;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.StatusLine;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.SearchException;
import com.vinculum.ondc.objects.sku.Product;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;

public class Consumer {
    // Logger for this class
    public static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
    
    // Instance variables
    final String route;
    final String dbId;
    final MetaData metaData;
    private Object data;

    public Consumer(final String route, final String dbId, MetaData metaData, Object data) {
        this.route = route;
        this.dbId = dbId;
        this.metaData = metaData;
        this.data = data;
    }

    public Consumer() {
        this.route = null;
        this.dbId = null;
        this.metaData = null;
    }

    public void init(final SearchResponse<Product> response, final Throwable exception) {
        MDC.put(Constants.UNIQUE, dbId + Constants.F_SLASH + Constants.EVENTS + Constants.F_SLASH + route);

        if (null != exception) {
            onThrowable(exception);
            return;
        }

        if (null != response) {
            LOGGER.info("Get the Body");
            List<Product> list = null;
            final HitsMetadata<Product> meta = response.hits();

            if (null == meta) {
                onThrowable(new SearchException(1300, Constants.RETRIEVE_RESPONSE_META_NULL));
            }

            final List<Hit<Product>> hits = meta.hits();

            if (null == hits) {
                onThrowable(new SearchException(1300, Constants.RETRIEVE_RESPONSE_HITS_NULL));
            }

            list = new ArrayList<>();

            for (final Hit<Product> hit : hits) {
                final Product product = hit.source();
                list.add(product);
                LOGGER.info("Added: " + product.getSku());
            }

            System.out.println(this.route);

            if (Constants.SEARCH.equalsIgnoreCase(this.route)) {
                new ConsumerHelper().processSearch(data, list, dbId);
            }
            if (Constants.SELECT.equalsIgnoreCase(this.route)) {
                new ConsumerHelper().processSelect(data, list, dbId);
            }
        }

        MDC.remove(Constants.UNIQUE);
    }

    private void onThrowable(final Throwable exception) {
        String overridenMessage = exception.getMessage();
        int overridenCode = 9999;

        if (null != exception) {
            if (exception instanceof SearchException) {
                LOGGER.info(Constants.CROSS);
                final SearchException excp = (SearchException) exception;
                LOGGER.info(String.format("This is Custom Exception with Error Code %s and ErrorDescription %s",
                        excp.getCode(), StringUtils.left(excp.getMessage(), 300)));
                overridenMessage = excp.getMessage();
                overridenCode = excp.getCode();
                LOGGER.info(Constants.CROSS);
            } else if (exception instanceof ElasticsearchException) {
                LOGGER.info(Constants.CROSS);
                LOGGER.info("This is ElasticSearchException");
                ElasticsearchException exp = (ElasticsearchException) exception;
                ErrorResponse errorResponse = exp.response();
                ErrorCause cause = errorResponse.error();
                overridenCode = errorResponse.status();
                overridenMessage = cause.reason();
                LOGGER.info(Constants.CROSS);
            } else if (exception instanceof ResponseException) {
                LOGGER.info(Constants.CROSS);
                LOGGER.info("This is ResponseException");
                final ResponseException respException = (ResponseException) exception;
                final Response response = respException.getResponse();
                final StatusLine sline = response.getStatusLine();

                if (null != sline) {
                    final int code = sline.getStatusCode();
                    final String phrase = sline.getReasonPhrase();
                    overridenCode = code;
                    overridenMessage = phrase;
                }
                LOGGER.info(Constants.CROSS);
            } else if (exception instanceof ConnectException) {
                LOGGER.info(Constants.CROSS);
                LOGGER.info("This is ConnectionException");
                final ConnectException connectException = (ConnectException) exception;
                overridenMessage = connectException.getMessage();
                overridenCode = 408;
                LOGGER.info(Constants.CROSS);
            } else {
                LOGGER.info("This is Some Other Exception");
            }

            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
            LOGGER.info(overridenMessage);
            LOGGER.info(String.format("Code %s ", overridenCode));
        }
    }

    
   /*	private Response error(final Requestor requester) {
   		Response response;
   		//Initialize the new Response
   		response = new Response();
   		//Set the success to false
   		response.setSuccess(false);

   		//Create Error Details
   		final ErrorDetails error = new ErrorDetails();
   		//Set the error message
   		error.setError_message(requester.getErrorMessage());

   		//Create the list
   		final List<ErrorDetails> errors = new ArrayList<>();
   		//Add
   		errors.add(error);

   		//Set to response
   		response.setErrors(errors);
   		return response;
   	}*/
   	
   	
    public void onInit(BulkResponse bulkResponse, final Throwable exception) {
        new ConsumerHelper().processOnInit(bulkResponse, dbId);
    }

    public void onConfirm(Object data) {
        new ConsumerHelper(metaData).processOnConfirm(data, dbId);
    }

    public void onCancel(Object data) {
        new ConsumerHelper().processOnCancel(data, dbId);
    }
}

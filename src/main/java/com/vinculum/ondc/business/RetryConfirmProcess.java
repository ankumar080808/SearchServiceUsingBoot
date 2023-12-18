package com.vinculum.ondc.business;

import java.util.List;
import java.util.concurrent.Callable;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.business.elasticsearchcallers.SyncElasticSearch;
import com.vinculum.ondc.business.http.Requestor;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;
import com.vinculum.ondc.objects.response.eretail.EretailResponse;
import com.vinculum.ondc.objects.sku.Confirm;

public class RetryConfirmProcess implements Callable<String> {

	/**
	 * LOGGER for this class
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcSkuProcess.class);
	/**
	 * Declare the MDC Type for logging
	 */
	private String mdcType;
	/**
	 * Inject the process metadata from the spring
	 */
	protected final MetaData metadata;
	/**
	 * Construct the DB ID
	 */
	protected final String dbId;
	/**
	 * Construct the HTTP Client
	 */
	protected final CloseableHttpClient client;

	/**
	 * Create the default constructor for this class
	 * 
	 * @param metadata
	 * @param dbId
	 * @param client
	 */

	public RetryConfirmProcess(MetaData metadata, String dbId, final CloseableHttpClient client, final String mdcType) {
		// Assign the metadata
		this.metadata = metadata;
		// Assign the database id
		this.dbId = dbId;
		// Assign the client
		this.client = client;
		// Assign
		this.mdcType = mdcType;
	}	

	
	public void process() {

		@SuppressWarnings("unused")
		final ResponseStatus response = new ResponseStatus();
		ObjectMapper objectMapper = new ObjectMapper();
		String eretailjson = null;
		@SuppressWarnings("unused")
		EretailResponse responses = null;
		
		try
		{

		    final SyncElasticSearch operation = new SyncElasticSearch(metadata, Constants.CONFIRM);
			
		    List<Confirm>  list= operation.getRecordsWithStatusZero();

			for (Confirm confirm : list) {

				int status = confirm.getStatus();

				if (status == 0) {

					CloseableHttpClient client = HttpClientBuilder.create().build();
					Requestor requestor = new Requestor();
					responses = requestor. fireEretailOrderCreate(EretailResponse.class, eretailjson, client,
							Constants.ONDC_ON_CONFIRM_ENDPOINT, objectMapper, null, Constants.POST, null);

					// int statusCode = responses.getStatusLine().getStatusCode();
					int statusCode = (int) responses.getResponseCode();

					// if (statusCode == HttpStatus.SC_OK) {
					if (statusCode == 0) {

						System.out.println("Response is valid. HTTP status code: " + statusCode);
					} else {
						System.out.println("Response is not OK. HTTP status code: " + statusCode);
					}

				}

			}
		} catch (final Exception exception) {
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}
	}


	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		/*process(final List<com.vinculum.ondc.objects.sku.Confirm> confirms,authHeader, dbId);*/
		
		return null;
	}


	/*@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return process();
	}*/

}

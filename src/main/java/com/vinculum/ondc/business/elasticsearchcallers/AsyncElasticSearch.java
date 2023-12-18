package com.vinculum.ondc.business.elasticsearchcallers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.http.HttpHost;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
//import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.business.iface.QueryBuilder;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.sku.Product;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.SearchResponse;

/*
 * This class represents an Asynchronous Elastic search caller that facilitates retrieving
 * data from a database based on search queries. It utilizes the ElasticsearchAsyncClient
 * for making API calls.
 * 
 * The retrieve() method handles the retrieval process and creates a search request based on the provided query. 
 * The build() method constructs the query based on different search criteria. 
 * 
 * The class demonstrates flexibility by accommodating various types of searches, including SKU, category, and fulfillment. 
 * Overall, it provides a reliable and efficient way to interact with ElasticSearch for data retrieval. 
 */


public class AsyncElasticSearch {

	public static final Logger LOGGER = LoggerFactory.getLogger(AsyncElasticSearch.class);
	@SuppressWarnings("unused")
	private static final int TDocument = 0;
	/**
	 * The Client to Call APIs 
	 **/	
	
	private MetaData metaData;
	
	
	/**
	 * The Index Name
	 **/
	@SuppressWarnings("unused")
	private final String indexName;
	
	private final QueryBuilder queryBuilder;
	@SuppressWarnings("unused")
	private CompletableFuture<SearchResponse<Product>> futureResponse=null;

	public AsyncElasticSearch(final MetaData metaData, final String indexName, final QueryBuilder queryBuilder) {
        this.metaData = metaData;
        this.indexName = indexName;
        this.queryBuilder = queryBuilder;
    }


	/** This Method is Used to Retrieve Data from the Database on the Basis of a Search Query
	 * @param query
	 * @param route 
	 * @param type
	 * @return
	 * @throws Exception
	 */	
	public String retrieve(final Object data, final String route, final String dbId) throws Exception {	
		String status=null;
		final List<Query> queries;  // Don't initialize here

		//Handle Exceptions Here
		try {

		    if (Constants.SEARCH.equalsIgnoreCase(route)) {
		        SearchQueryBuilder searchQueryBuilder = new SearchQueryBuilder(); 
		        queries = searchQueryBuilder.buildSearchQuery(data);
		    } else if (Constants.SELECT.equalsIgnoreCase(route)) {
		        SelectQueryBuilder selectQueryBuilder = new SelectQueryBuilder(); 
		        queries = selectQueryBuilder.buildSearchQuery(data);
		    } else {
		        // Handle the case when neither condition is true  
		        queries = new ArrayList<>();  
		    }

		    //Create Consumer
		    final Consumer consumer = new Consumer(route, dbId, metaData, data);
		         
		    futureResponse = metaData.getElasticAsyncClient().search(
		        searchReq -> searchReq.index("products").query(
		            queryBuilder -> queryBuilder.bool(
		                boolBuilder -> boolBuilder.must(queries)
		            )
		        ),
		        Product.class
		    ).whenCompleteAsync(consumer::init);
		   
		    
		   
		   	
		} catch (final Exception exception) {
			//Throw
			throw exception;
		} 		
		return status;
	}
	
	
	
	 public String save(final Object data, final String route, final String dbId) throws Exception {
		 
		 AtomicReference<String> status = new AtomicReference<>(Constants.ACKNOWLEDGE_FALIURE); // Default to failure
     	
	        try {
	        	
	            @SuppressWarnings("unused")
				final IndexRequest indexRequest = queryBuilder.buildSaveQuery(data);
	            
	            RestHighLevelClient client = new RestHighLevelClient(
	                    RestClient.builder(new HttpHost("localhost", 9200, "http")));

	        
	            IndexRequest request = new IndexRequest("orders");
	            ObjectMapper objectMapper = new ObjectMapper();
	           
	            // populate your object
	            String jsonString = objectMapper.writeValueAsString(data);
	            request.source(jsonString, XContentType.JSON);
	            
	         // Asynchronous Indexing
	            client.indexAsync(request, RequestOptions.DEFAULT, new ActionListener<IndexResponse>() {
	                @Override
	                public void onResponse(IndexResponse indexResponse) {
	                    // Successful response. Handle it here.
	                    System.out.println("Indexing successful. ID: " + indexResponse.getId());
	                    status.set(Constants.ACKNOWLEDGE_SUCCESS);
	                }

	                @Override
	                public void onFailure(Exception e) {
	                    // Failure. Handle exception here.
	                    e.printStackTrace();
	                }
	            });

             
	        } catch (Exception e) {
	            LOGGER.error("Error: ", e);
	            throw e;
	     
	        }
	        return status.get();
	    }
	

}
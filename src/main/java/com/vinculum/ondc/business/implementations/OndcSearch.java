package com.vinculum.ondc.business.implementations;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.business.elasticsearchcallers.AsyncElasticSearch;
import com.vinculum.ondc.business.elasticsearchcallers.SearchQueryBuilder;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;


public class OndcSearch implements OndcProcess{
	
	/**		
	 * Declare The Logger
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcElasticSearch.class);
	/**
	 * This is the Meta Data	
	 */
	private MetaData metaData;
	/**	
	 * Declare the Db ID	
	 */	
	protected String dbId;
	

	@Override	
	public void process(final Object data, final String route)throws  Exception {
		
		 // Create a SearchQueryBuilder instance
        SearchQueryBuilder searchQueryBuilder = new SearchQueryBuilder();
        metaData.getContext().put("callType", "search");
        
        // Create an instance of AsyncElasticSearch for the search API
        final AsyncElasticSearch operation = new AsyncElasticSearch(metaData, Constants.PRODUCTS, searchQueryBuilder);
     // When initiating the search call
       
		//Create Response
		final ResponseStatus response = new ResponseStatus();
		//Handle Here
		try {
			//Get Data
			String status=operation.retrieve(data, route, dbId);
			//Set the response code to success code	
			response.setResponseCode(Constants.SUCCESS_CODE);
			//Set the response message to success message
			//response.setResponseMessage(Constants.PROCESSING);
			response.setResponseMessage(status);
			
		}catch(final Exception exception) {
			//Set the response code to fail code	
			response.setResponseCode(Constants.FAILURE_CODE);
			//Set the response message to fail message
			response.setResponseMessage(StringUtils.left(exception.getMessage(), 200));
			//Log
			LOGGER.info(exception.getMessage(), exception.fillInStackTrace());
		}
		//Return
		//return response;
	}


	public MetaData getMetaData() {
		return metaData;
	}


	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}


	public String getDbId() {
		return dbId;
	}


	public void setDbId(String dbId) {
		this.dbId = dbId;
	}	
	
	
	
	
}

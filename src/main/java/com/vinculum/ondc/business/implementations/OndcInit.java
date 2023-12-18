package com.vinculum.ondc.business.implementations;


import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.PlatformTransactionManager;

import com.vinculum.ondc.business.elasticsearchcallers.SyncElasticSearch;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;

public class OndcInit implements OndcProcess{
	
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
	
	/**
	 * Declare the SQL Session
	 */
	protected SqlSessionTemplate session;
	
	
	/**
	 * Declare the platform transaction Manager
	 */
	protected PlatformTransactionManager manager;
	
	

	@Override	
	public void process(final Object data, final String route)throws  Exception {
		
		
		  // Create an instance of SyncElasticSearch for the init API
	      
		final SyncElasticSearch operation = new SyncElasticSearch(metaData, Constants.ORDERS);
		
       //Create Response
      		final ResponseStatus response = new ResponseStatus();
      		//Handle Here
      		try {
      			
      			//Get Data
      			//String status=operation.bulkUpsert(data);
      			operation.bulkUpsert(data);
      			
      			//Set the response code to success code	
      			//response.setResponseCode(Constants.SUCCESS_CODE);
      			//Set the response message to success message
      			//response.setResponseMessage(Constants.PROCESSING);
      			//response.setResponseMessage(status);
      			
      		}catch(final Exception exception) {
      			//Set the response code to fail code	
      			//response.setResponseCode(Constants.FAILURE_CODE);
      			//Set the response message to fail message
      			//response.setResponseMessage(StringUtils.left(exception.getMessage(), 200));
      			//Log
      			LOGGER.info(exception.getMessage(), exception.fillInStackTrace());
      		}
      		
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

package com.vinculum.ondc.business.implementations;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.business.elasticsearchcallers.SyncElasticSearch;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.SearchException;
import com.vinculum.ondc.objects.response.ResponseStatus;

import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;	

public class OndcCreateIndices implements OndcProcess {

	/**		
	 * Declare The Logger
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcCreateIndices.class);
	/**
	 * This is the Meta Data
	 */
	private MetaData metaData;
	/**
	 * Declare the Db ID	
	 */	
	protected String dbId;

	/**
	 * This method is responsible for Getting Data
	 * @param route 
	 * @param request
	 * @param intCode
	 * @return
	 * @throws Exception 
	 */
	@Override
	public void process(final Object createRequest, final String route)throws Exception{
		//Create the new Response Status To Be Returned
		ResponseStatus response = new ResponseStatus();	
		//Handle Exception
		try {
			String index_type = route.substring(route.lastIndexOf("_") + 1);

			//Create Operation
			final SyncElasticSearch operation = new SyncElasticSearch(metaData, index_type);
			//Retreive
			final CreateIndexResponse resp = operation.createIndice((String)createRequest);
			//Check
			if(null != resp) {
				//Check
				if(resp.acknowledged()) {
					//Set the response code to success code
					response.setResponseCode(Constants.SUCCESS_CODE);
					//Set the response message to success message
					response.setResponseMessage(Constants.SUCCESS_MESSAGE);
				}else {
					//Set the response code to success code
					response.setResponseCode(Constants.FAILURE_CODE);
					//Set the response message to success message
					response.setResponseMessage(Constants.ERR_002);
				}
			}
		}catch (final SearchException exception) {
			//Set the response code to success code
			response.setResponseCode(exception.getCode());
			//Set the response message to success message
			response.setResponseMessage(exception.getMessage());
			//Log The Exception
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}catch (final Exception exception) {
			//Set the response code to success code
			response.setResponseCode(9999);
			//Set the response message to success message
			response.setResponseMessage(Constants.ERR_002);
			//Check
			if(StringUtils.isNotBlank(exception.getMessage())) {
				//Set
				response.setResponseMessage(StringUtils.left(exception.getMessage(), 255));
			}
			//Log The Exception
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}
		//Return the response
		//return response;
	}

	public String getDbId() {
		return dbId;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public MetaData getMetaData() {
		return metaData;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}



}

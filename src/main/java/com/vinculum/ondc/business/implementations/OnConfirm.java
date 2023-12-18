package com.vinculum.ondc.business.implementations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;


public class OnConfirm implements OndcProcess{
	
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
		
		//Return
		//return null;
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

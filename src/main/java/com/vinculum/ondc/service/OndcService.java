package com.vinculum.ondc.service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinculum.ondc.business.implementations.OndcCancel;
import com.vinculum.ondc.business.implementations.OndcConfirm;
import com.vinculum.ondc.business.implementations.OndcCreateIndices;
import com.vinculum.ondc.business.implementations.OndcProcess;
import com.vinculum.ondc.business.implementations.OndcSearch;
import com.vinculum.ondc.business.implementations.OndcElasticSearch;
import com.vinculum.ondc.business.implementations.OndcInit;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.response.ResponseStatus;
import com.vinculum.ondc.business.implementations.OndcSelect;

@Service
public class OndcService {

	/**
	 * Logger For this class
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcService.class);
	/**
	 * This is the Meta Data
	 */
	@Autowired 
	private MetaData metaData;



	public  void process(final Object request, final String route, final String dbId) throws Exception {
		
		//Initialize with null
		OndcProcess business = null;
		//Check Condition
		if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_GET_SKUS)) {
			//Create the new instance
			business =  new OndcElasticSearch();
		}
		else if (StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_CREATE_PRODUCTS_INDEX)) {
		    // Create the new instance for creating products index
		    business = new OndcCreateIndices();
		}
		else if (StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_CREATE_ORDER_INDEX)) {
		    // Create the new instance for creating orders index
		    business = new OndcCreateIndices();
		}
		else if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_SEARCH)) {
			//Create the new instance
			business =  new OndcSearch();
		}
		
		else if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_SELECT)) {
			//Create the new instance
			business =  new OndcSelect();
		}
		else if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_INIT)) {
			//Create the new instance
			business =  new OndcInit();
		}
		else if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_CONFIRM)) {
			//Create the new instance
			business =  new OndcConfirm();
		}
		else if(StringUtils.equalsIgnoreCase(route, Constants.REQ_TYPE_CANCEL)) {
			//Create the new instance
			business =  new OndcCancel();
		}
		
		
		//Set the transaction manager
		business.setMetaData(metaData);
		//Set
		business.setDbId(dbId);
		//Process the response
		business.process(request, route);
	}

	public MetaData getMetaData() {
		return metaData;
	}


	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}


}

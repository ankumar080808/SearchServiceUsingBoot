package com.vinculum.ondc.business;


import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.vinculum.ondc.business.elasticsearchcallers.SyncElasticSearch;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.datasource.CustomerContextHolder;
import com.vinculum.ondc.dao.objects.Sku;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.SearchException;
import com.vinculum.ondc.objects.sku.Product;
import com.vinculum.ondc.operation.OndcOperation;
import com.vinculum.ondc.utils.Util;	

public class OndcSkuProcess implements Callable<String> {
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
	 * @param metadata
	 * @param dbId	
	 * @param client
	 */
	public OndcSkuProcess(MetaData metadata, String dbId,  final CloseableHttpClient client, final String mdcType) {
		//Assign the metadata
		this.metadata = metadata;
		//Assign the database id
		this.dbId = dbId;
		//Assign the client
		this.client=client;
		//Assign
		this.mdcType = mdcType;
	}

	/**
	 * The process method is what is going to be called from the call method of the
	 * executor framework and will process the SKU
	 * @return
	 */
	private String process() {
		
		//Set the customer context
		CustomerContextHolder.setCustomerType("50");
		
		//Set the MDC for logging to a file
		MDC.put(Constants.UNIQUE,dbId +Constants.F_SLASH + Constants.SCHEDULERS +Constants.F_SLASH +String.format(Constants.SKU_MDC,mdcType));
		//Log
		final String startDate = Util.now();
		//Log
		LOGGER.info(Constants.GOLA);
		//Log
		LOGGER.info(String.format(Constants.LOG_START, dbId, startDate));
		//Log
		LOGGER.info(Constants.GOLA);
		//Create the operation
		final OndcOperation operation = new OndcOperation(metadata.getSession(), metadata.getManager());
		//Handle exception
		try {
			//Create the last transmit date
			final Timestamp lastTransmitDate = operation.getLastTransmitDate("002", Constants.ELASTIC_SEARCH_SKU_PROCESS_INTCODE);
			//lastTransmitDate="2022-10-19 12:40:315";
			//Get the SKU List
			final Map<String,List<Sku>> map = operation.getSkus("002", lastTransmitDate);
			//Check
			if(null != map && !map.isEmpty()) {
				//Get 
				final List<Sku> upsertList =map.get(Constants.TO_UPSERT);
				//Check
				if (upsertList != null && !upsertList.isEmpty()) {
					//Log
					LOGGER.info(String.format(Constants.TOTAL_UPSERT, upsertList.size()));
					//Call
					process(upsertList,1);
				} else {
					//Log the information
					LOGGER.info(String.format(Constants.NO_DATA, Constants.TO_UPSERT, dbId));
				}
				//Get the Be Deleted
				final List<Sku> deleteList =map.get(Constants.TO_DELETE);
				//Check
				if (deleteList != null && !deleteList.isEmpty()) {
					//Log
					LOGGER.info(String.format(Constants.TOTAL_DELETE, deleteList.size()));
					//Call
					process(deleteList,2);
				} else {
					//Log the information
					LOGGER.info(String.format(Constants.NO_DATA, Constants.TO_DELETE, dbId));
				}
				//Fire Update
				operation.updateTransmitLog(dbId,Constants.ELASTIC_SEARCH_SKU_PROCESS_INTCODE,getTimeStamp(startDate));
			}
		} catch (final Exception exception) {
			//Log the exception
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}
		//Log
		LOGGER.info(Constants.GOLA);
		//Log
		LOGGER.info(String.format(Constants.LOG_END, dbId, Util.now()));
		//Log
		LOGGER.info(Constants.GOLA);
		//Remove the MDC Context
		MDC.remove(Constants.UNIQUE);
		//Return the success message
		return Constants.SUCCESS_MESSAGE;
	}

	private Timestamp getTimeStamp(final String startDate) throws ParseException {
		//Get the Date
		final Date date = Constants.FORMATTER_TIME.parse(startDate);
		//Create TimeStamp
		return new Timestamp(date.getTime());
	}


	@Override
	public String call() {
		//Call the process
		return process();
	}

	private void process(final List<Sku> skus, int decide) throws Exception {
		//Populate
		final SyncElasticSearch operation = new SyncElasticSearch(metadata, Constants.PRODUCTS);
		//Build For Bulk Insert
		final List<Product> products = operation.build(skus);
		//Switch
		switch(decide) {
		case 1:
			//Build
			operation.bulkUpsert(products);
			//Break
			break;
		case 2:
			//Build
			operation.bulkDelete(products);
			//Break
			break;

		default:
			//Throw
			throw new SearchException(2100, "Wrong Input");
		}
	}

}
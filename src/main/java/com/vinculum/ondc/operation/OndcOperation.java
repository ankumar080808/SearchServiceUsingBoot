package com.vinculum.ondc.operation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.PlatformTransactionManager;

import com.vinculum.ondc.business.Transactional;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.datasource.CustomerContextHolder;
import com.vinculum.ondc.dao.iface.OndcDao;
import com.vinculum.ondc.dao.objects.Sku;	

/**
 * The OndcOperation class is responsible for performing operations related to the ONDC  functionality.
 * It extends the Transactional class, indicating that it supports transaction management.
 * The class provides methods for retrieving SKU data, handling transmit dates, and updating transmit logs.
 */

public class OndcOperation extends Transactional {

    /**
     * The logger instance for logging purposes.
    */
	public static final Logger LOGGER = LoggerFactory.getLogger(OndcOperation.class);
	
	/**
     * The data access object for performing database operations related to ONDC.
     */
	final private OndcDao dao;
	
	/**
     * The SqlSessionTemplate for executing SQL statements in MyBatis.
     */
	
	private SqlSessionTemplate sqlSession;
	
	 /**
     * Constructs an instance of OndcOperation with the provided SqlSessionTemplate and PlatformTransactionManager.
     * @param session The SqlSessionTemplate for executing SQL statements.
     * @param manager The PlatformTransactionManager for managing transactions.
     */

	public OndcOperation(final SqlSessionTemplate session, final PlatformTransactionManager manager) {
		//Set Manager
		setManager(manager);
		//Get the Mapper
		this.dao = session.getMapper(OndcDao.class);
	}
	
	/**
     * Retrieves a map of SKUs based on the given database ID and last transmit date.
     * The map contains two lists: upsert and remove.
     * The upsert list contains SKUs to be created or updated, while the remove list contains SKUs to be removed.
     * @param dbId The ID of the database to retrieve SKUs from.
     * @param lastTransmitDate The timestamp of the last transmit date.
     * @return A map of SKUs categorized as upsert and remove.
     */
	public Map<String,List<Sku>> getSkus(final String dbId, final Timestamp lastTransmitDate) {
		//Set the Context
		CustomerContextHolder.setCustomerType(dbId);
		//Create the Map to be Returned
		Map<String,List<Sku>> map = null;
		//Create List Of Create/Update
		//final List<Sku> upsert = new ArrayList<>();
		//Create List of Remove
		//final List<Sku> remove = new ArrayList<>();
		//Handle Exceptions Here
		try {		
			//Begin
			//begin();
			//Get the Data
			//final List<Sku> result = dao.getSkus(lastTransmitDate);
			//Commit
			//commit();
			///Check
			/*if(null != result && !result.isEmpty()) {
				//Log
				LOGGER.info(String.format("Total Skus %s", result.size()));
				//Loop
				for(final Sku sku: result) {
					//Get the Status
					final int status = sku.getStatus();
					//Check
					if(status==2) {
						//Add
						remove.add(sku);			
					}else {
						//Add
						upsert.add(sku);
					}
				}
				//Init
				map= new HashMap<>();
				//Add
				map.put(Constants.TO_UPSERT, upsert);
				//Add
				map.put(Constants.TO_DELETE, remove);
			}else{
				//Log
				LOGGER.info("Total O Skus");
			}*/
		} catch (final Exception exception) {
			//Log
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
			//Rollback
			rollback();
		} finally {
			//Clear Context
			CustomerContextHolder.clearCustomerType();
		}
		//Return
		return map;
	}
	
	 /**
     * Retrieves the last transmit date for the given database ID and integration code.
     * If the last transmit date is null or blank, a new timestamp is generated and inserted into the transmit log table.
     * 
     * @param dbId The ID of the database to retrieve the last transmit date from.
     * @param intcode The integration code associated with the transmit log.
     * @return The last transmit date as a Timestamp object.
     */

	public Timestamp getLastTransmitDate(final String dbId,final String intcode) {
		//Create The Last Transmit Date To Be Returned
		Timestamp datetime = null;
		//Set the customer context
		
		CustomerContextHolder.setCustomerType("002");
		//Handle Exception
		try {
			//Begin Transaction
			begin();
			//Get The Last Transmit Date From The Database
			//datetime = dao.getLastTransmitDate(intcode);
			//Check If it is null or blank
			if (null == datetime) {
				//Get The Instance Of Calendar
				Calendar calendar = Calendar.getInstance();
				//Subtract 12 Hours From Now
				calendar.add(Calendar.HOUR, -12);
				//Get The Date
				final Date date = calendar.getTime();
				//Log The Information
				LOGGER.info(String.format("Inserting New Time Stamp In Transmit Log Table Int Code: %s, Time: %s" , intcode, date));
				//Create The New Time Stamp From The Derived Date
				datetime = new Timestamp(date.getTime());
				//Insert The Transmit Log
				//dao.insertTransmitLog(intcode, datetime);
			}
			//Commit The Transaction
			commit();
		} catch (final Exception exception) {
			//Log the exception
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
			//Rollback
			rollback();
		} finally {
			//Remove the customer context
			CustomerContextHolder.clearCustomerType();
		}
		//Log
		LOGGER.info(String.format("Got Last Transmit Date %s", datetime));
		//Return Date time
		return datetime;
	}
	
	 /**
     * Updates the transmit log with the provided database ID, integration code, and last transmit date.
     * 
     * @param dbId The ID of the database to update the transmit log in.
     * @param intCode The integration code associated with the transmit log.
     * @param lastDate The last transmit date to be updated.
     * @return true if the update is successful, false otherwise.
     */

	public boolean updateTransmitLog(String dbId, String intCode,final Timestamp lastDate) {
		//Declare
		boolean success = false;
		//Set the Customer
		CustomerContextHolder.setCustomerType(dbId);
		//Handle Exceptions Here
		try {
			//Begin
			begin();
			//Update
			//dao.updateTransmitLog(intCode,lastDate);
			//Commmot
			commit();
		} catch (final Exception exception) {
			//Log
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
			//Rollback
			rollback();
		} finally {
			//Clear
			CustomerContextHolder.clearCustomerType();
		}
		//Return
		return success;
	}
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
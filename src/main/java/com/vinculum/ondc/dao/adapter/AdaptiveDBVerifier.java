package com.vinculum.ondc.dao.adapter;

import com.mysql.jdbc.Driver;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.utils.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;


/**
 * The AdaptiveDBVerifier class is responsible for verifying the database based on some table names.
 * It provides the functionality to establish a connection to the database, execute a count query, and determine if the verification is successful.
 * 
 * The class includes a LOGGER variable for logging purposes.
 * 
 * The verify() method takes the database URL, schema, params, user, password, and dbId as parameters and returns a boolean value indicating whether the verification was successful.
 * 
 * The method establishes a connection to the database using the provided parameters, executes a count query, and checks the result set.
 * If the result set is not null and contains at least one row, the verification is considered successful, and the method returns true.
 * Otherwise, the verification is considered a failure, and the method returns false.
 * 
 * The method handles any exceptions that may occur during the verification process and logs relevant information and error messages using the LOGGER.
 * 
 * Overall, the AdaptiveDBVerifier class provides a mechanism to verify the database connection based on table names and determine its validity.
 */


public class AdaptiveDBVerifier {
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(AdaptiveDBVerifier.class);
	
	/**
	 * This method verifies the database based on some table names.
	 * 
	 * @param dbUrl the database URL
	 * @param schema the database schema
	 * @param params additional parameters for the database connection
	 * @param user the database user
	 * @param password the database password
	 * @param dbId the database ID
	 * @return true if the database verification is successful, false otherwise
	 */
	public boolean verify(final String dbUrl, final String schema, final String params, final String user, final String password, final String dbId){
		//Create the boolean
		boolean verified = false;
		//Create connection
		Connection connection = null;
		//Create statement
		Statement statement = null;
		//Create Result Set
		ResultSet resultSet = null;
		//Handle Exception
		try{
			//Register The Driver
			DriverManager.registerDriver(new Driver());
			//Initialize the Connection
			connection = DriverManager.getConnection(dbUrl + schema + params ,user,password);
			//Initialize the statement
			statement = connection.createStatement();
			//Execute the SQL
			resultSet = statement.executeQuery(Constants.COUNT_QUERY);
			//Check null
			if(null != resultSet){
				//Loop
				while(resultSet.next()){
					//Set the verified to true
					verified = true;
					//Log the information
					LOGGER.info(Util.formated(schema, Constants.SUCCESS_MESSAGE, dbId));
				}
			}
		}catch(final Exception exception){
			//Log the Exception
			//Log the information
			LOGGER.info(Util.formated(schema, Constants.FAILURE_MESSAGE, dbId));
		}finally{
			//Handle Exception
			try{
				//Check null for resultSet
				if(null != resultSet){
					//Close the result set
					resultSet.close();
				}

				//Check Null for statement
				if(null != statement){
					//Close the statement
					statement.close();
				}

				//Check null for connection
				if(null != connection){
					//Close the connection
					connection.close();
				}
			}catch(final SQLException exception){
				//Log the Error
				LOGGER.error(exception.getMessage(),exception.fillInStackTrace());
			}
		}
		//Return the verified
		return verified;
	}
}

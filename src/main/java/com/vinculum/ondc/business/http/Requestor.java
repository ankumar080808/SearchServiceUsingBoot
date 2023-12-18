package com.vinculum.ondc.business.http;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
//import com.vinculum.ondc.dao.datasource.CustomerContextHolder;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.common.xcontent.LoggingDeprecationHandler;
import org.elasticsearch.common.xcontent.NamedXContentRegistry;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;

/**
 *
 * @author Manish Anand
 *
 *         This class is responsible for making request to the integration
 *         server and getting back the response. If there will be any kind of
 *         error the error flag will become true and the error message will be
 *         populated with the appropriate message which can be fetched later and
 *         appropriate action must be taken to persist the error message and
 *         error code into the database.
 *
 */
public class Requestor {
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(Requestor.class);
	/**
	 * The Error Flag
	 */
	private boolean error = false;
	/**
	 * The Error Code
	 */
	private int errorCode;
	/**
	 * The Error Message
	 */
	private String errorMessage;
	/**
	 * Create the raw response
	 */
	private String responsebody;

	public <T> T fireEretailOrderCreate(final Class<T> type, final String json, final CloseableHttpClient client,
			final String endpoint, final ObjectMapper objectMapper, final String auth, final String method,
			final String dbId) {
		// Firing Request - Log
		LOGGER.info(String.format("Firing Request To Ondc. REQUEST TYPE: %s REQUEST BODY: %s", method, json));

		// Type to be returned
		T result = null;
		// Create the response object
		CloseableHttpResponse response = null;
		// Handle Exception
		try {
			// Declare URL
			String url = Constants.ONDC_ON_CONFIRM_ENDPOINT;
			// Get The Meta Map
			// final Map<String, String> meta = Constants.META.get(dbId);
			// Check null
			// if(null != meta) {
			// Get The User
			// s final String base = meta.get(Constants.URL);
			// Check null
			/*
			 * if(StringUtils.isBlank(base)) { //Error
			 * error(String.format(Constants.ERR_012, dbId), 5004); //Return return null;
			 * }else { //Assign url = base + endpoint; }
			 */
			/*
			 * }else { //Error error(String.format(Constants.ERR_010, dbId), 5003); //Return
			 * return null; }
			 */
			// Log The URL Being HIT
			LOGGER.info(String.format("URL To Which Request Is Being Fired To: %s", url));
			// Initialize
			HttpEntityEnclosingRequestBase http = null;
			// Check
			if (StringUtils.equalsIgnoreCase(method, Constants.PUT)) {
				// Assign
				http = new HttpPut(url);
			} else if (StringUtils.equalsIgnoreCase(method, Constants.POST)) {
				// Assign
				http = new HttpPost(url);
			}
			// Set ContentType
			// http.addHeader(Constants.CONTENT_TYPE,
			// ContentType.APPLICATION_JSON.getMimeType());
			http.addHeader(Constants.CONTENT_TYPE, "application/x-www-form-urlencoded");

			// Set Accept
			// http.addHeader(Constants.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
			http.addHeader(Constants.ACCEPT, "application/json");
			http.setHeader("Content-Type", "application/x-www-form-urlencoded");

			// Check
			if (StringUtils.isNotBlank(auth)) {
				// Add the Authorization Header
				http.addHeader(Constants.AUTH, auth);
			}

			// Set the timeout
			setTimeout(120, http);

			// Set the request body as URL-encoded form data
			String formData = "RequestBody=" + json
					+ "&ApiOwner=rahul&ApiKey=e98ce6aafbcd4378a0b78e21b03299f63665295210a54999935b86d&OrgId=USPL&DbIdentifier=09";

			HttpEntity entity = new StringEntity(formData);
			http.setEntity(entity);

			System.out.println(json);

			// Set the Entity
			// http.setEntity(new StringEntity("", ContentType.APPLICATION_JSON));
			//
			// Handle Exception
			try {
				System.out.println("Complete Request:");
				System.out.println(http.getRequestLine()); // Print the request line (e.g., "POST http://example.com
															// HTTP/1.1")
				System.out.println("Headers:");
				for (Header header : http.getAllHeaders()) {
					System.out.println(header.getName() + ": " + header.getValue());
				}

				// Hit the Request
				response = client.execute(http);
				// Null check
				if (null != response) {
					// Check the status line
					final StatusLine line = response.getStatusLine();
					// Null check
					if (null != line) {
						// Get the response code
						final int code = line.getStatusCode();
						// Log the information
						LOGGER.info(String.format("Status Code For The Request Fired Is: %s", code));
						// Check if ok
						if (code == HttpStatus.SC_OK) {
							// Get the response body
							responsebody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
							// Log the response
							LOGGER.info(String.format("Response From Ondc: %s", responsebody));
							// Assign the to T
							result = objectMapper.readValue(responsebody, type);

							// Clean
							clean();
						} else {
							// Set the Error
							error(code + Constants.DASH + line.getReasonPhrase(), code);
						}
					} else {
						// Set the Error
						error(Constants.ERR_004, 9002);
					}
				} else {
					// Set the Error
					// error(Constants.ERR_005, 9003);
					error(Constants.ERR_30019, 9003);
					result = objectMapper.readValue(Constants.ACKNOWLEDGE_FALIURE, type);

				}
			} catch (final IOException exception) {
				// Extract the message
				final String message = exception.getMessage();
				// Log the Exception
				LOGGER.error(message, exception.fillInStackTrace());
				// Set the Error
				error(StringUtils.left(message, 255), 9004);
			}
		} catch (final Exception exception) {
			// Extract the message
			final String message = exception.getMessage();
			// Log the Exception
			LOGGER.error(message, exception.fillInStackTrace());
			// Set the Error
			error(StringUtils.left(message, 255), 9005);
		} finally {
			// Null check
			if (null != response) {
				// Handle Exception
				try {
					// Close the response
					response.close();
				} catch (final IOException exception) {
					// Extract the message
					final String message = exception.getMessage();
					// Log the Exception
					LOGGER.error(message, exception.fillInStackTrace());
					// Set the Error
					error(StringUtils.left(message, 255), 9006);
				}
			}
		}

		return result;
	}

	/*
	 * public <T> T fire(final Class<T> type, final String json, final
	 * CloseableHttpClient client, final String endpoint, final ObjectMapper
	 * objectMapper, final String auth, final String method, final String dbId) {
	 * //Firing Request - Log LOGGER.info(String.
	 * format("Firing Request To Delhivery. REQUEST TYPE: %s REQUEST BODY: %s",
	 * method, json));
	 * 
	 * //Type to be returned T result = null; //Create the response object
	 * CloseableHttpResponse response=null; //Handle Exception try{ //Declare URL
	 * String url ="https://pilot-gateway-1.beckn.nsdl.co.in/on_search"; //Get The
	 * Meta Map final Map<String, String> meta = Constants.META.get(dbId); //Check
	 * null if(null != meta) { //Get The User final String base =
	 * meta.get(Constants.URL); //Check null if(StringUtils.isBlank(base)) { //Error
	 * error(String.format(Constants.ERR_012, dbId), 5004); //Return return null;
	 * }else { //Assign url = base + endpoint; } }else { //Error
	 * error(String.format(Constants.ERR_010, dbId), 5003); //Return return null; }
	 * //Log The URL Being HIT
	 * LOGGER.info(String.format("URL To Which Request Is Being Fired To: %s",url));
	 * //Initialize HttpEntityEnclosingRequestBase http = null; //Check
	 * if(StringUtils.equalsIgnoreCase(method, Constants.PUT)) { //Assign http = new
	 * HttpPut(url); }else if(StringUtils.equalsIgnoreCase(method, Constants.POST))
	 * { //Assign http = new HttpPost(url); } //Set ContentType
	 * http.addHeader(Constants.CONTENT_TYPE,
	 * ContentType.APPLICATION_JSON.getMimeType()); //Set Accept
	 * http.addHeader(Constants.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
	 * //Check if(StringUtils.isNotBlank(auth)) { //Add the Authorization Header
	 * http.addHeader(Constants.AUTH, auth); }
	 * 
	 * //Set the timeout setTimeout(120, http); //Set the Entity http.setEntity(new
	 * StringEntity(json, ContentType.APPLICATION_JSON)); // //Handle Exception try{
	 * //Hit the Request response = client.execute(http); //Null check if(null !=
	 * response){ //Check the status line final StatusLine line =
	 * response.getStatusLine(); //Null check if(null != line){ //Get the response
	 * code final int code = line.getStatusCode(); //Log the information
	 * LOGGER.info(String.format("Status Code For The Request Fired Is: %s", code));
	 * //Check if ok if(code == HttpStatus.SC_OK){ //Get the response body
	 * responsebody =
	 * EntityUtils.toString(response.getEntity(),StandardCharsets.UTF_8); //Log the
	 * response LOGGER.info(String.format("Response From Delhivery: %s",
	 * responsebody)); //Assign the to T ObjectMapper objectMapper1=new
	 * ObjectMapper(); result = objectMapper1.readValue(responsebody, type);
	 * 
	 * SearchResponse searchResponse = parseSearchResponse(responsebody); //Clean
	 * clean(); }else{ //Set the Error error(code + Constants.DASH +
	 * line.getReasonPhrase(), code); } }else{ //Set the Error
	 * error(Constants.ERR_004, 9002); } }else{ //Set the Error
	 * error(Constants.ERR_005, 9003); } }catch(final IOException exception){
	 * //Extract the message final String message = exception.getMessage(); //Log
	 * the Exception LOGGER.error(message, exception.fillInStackTrace()); //Set the
	 * Error error(StringUtils.left(message, 255), 9004); } }catch(final Exception
	 * exception){ //Extract the message final String message =
	 * exception.getMessage(); //Log the Exception LOGGER.error(message,
	 * exception.fillInStackTrace()); //Set the Error
	 * error(StringUtils.left(message, 255), 9005); }finally{ //Null check if(null
	 * !=response){ //Handle Exception try { //Close the response response.close();
	 * } catch (final IOException exception) { //Extract the message final String
	 * message = exception.getMessage(); //Log the Exception LOGGER.error(message,
	 * exception.fillInStackTrace()); //Set the Error
	 * error(StringUtils.left(message, 255), 9006); } } } return result; }
	 */

	private void error(final String errorMessage, final int errorCode) {
		// Set the Error Message
		this.errorMessage = errorMessage;
		// Set the error code
		this.errorCode = errorCode;
		// Set the error to true
		error = true;
	}

	private void clean() {
		// Set the Error Message
		errorMessage = null;
		// Set the error code
		errorCode = 0;
		// Set the error to true
		error = false;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	private void setTimeout(final int seconds, final HttpEntityEnclosingRequestBase post) {
		// Convert to MS
		final int timeout = seconds * 1000; // Timeout in millis.
		// Build Config
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(timeout).setConnectTimeout(timeout)
				.setSocketTimeout(timeout).build();

		// Set
		post.setConfig(config);
	}

	public String getResponsebody() {
		return responsebody;
	}

	private SearchResponse parseSearchResponse(String responseBody) throws IOException {
		XContentParser parser = XContentFactory.xContent(XContentType.JSON).createParser(NamedXContentRegistry.EMPTY,
				LoggingDeprecationHandler.INSTANCE, responseBody);
		return SearchResponse.fromXContent(parser);
	}
	
	public <T> T fire(final Class<T> type, final String json, final CloseableHttpClient client, final String endpoint, final ObjectMapper objectMapper, final String auth, final String method, final String dbId) {
		//Firing Request - Log
		LOGGER.info(String.format("Firing Request To Delhivery. REQUEST TYPE: %s REQUEST BODY: %s", method, json));
		
		//Type to be returned
		T result = null;
		//Create the response object
		CloseableHttpResponse response=null;
		//Handle Exception
		try{
			//Declare URL
			String url ="https://pilot-gateway-1.beckn.nsdl.co.in/on_search";
			//Get The Meta Map
			/*final Map<String, String> meta = Constants.META.get(dbId);
			//Check null
			if(null != meta) {
				//Get The User
				final String base = meta.get(Constants.URL);
				//Check null 
				if(StringUtils.isBlank(base)) {
					//Error
					error(String.format(Constants.ERR_012, dbId), 5004);
					//Return
					return null;
				}else {
					//Assign 
					url = base + endpoint;
				}
			}else {
				//Error
				error(String.format(Constants.ERR_010, dbId), 5003);
				//Return
				return null;
			}
			//Log The URL Being HIT
*/			LOGGER.info(String.format("URL To Which Request Is Being Fired To: %s",url));
			//Initialize
			HttpEntityEnclosingRequestBase http =  null;
			//Check
			if(StringUtils.equalsIgnoreCase(method, Constants.PUT)) {
				//Assign
				http =  new HttpPut(url);
			}else if(StringUtils.equalsIgnoreCase(method, Constants.POST)) {
				//Assign
				http =  new HttpPost(url);
			}
			//Set ContentType
			http.addHeader(Constants.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());
			//Set Accept
			http.addHeader(Constants.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
			//Check
			if(StringUtils.isNotBlank(auth)) {
				//Add the Authorization Header
				http.addHeader(Constants.AUTH, auth);
			}

			//Set the timeout
			setTimeout(120, http);
			//Set the Entity
			http.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
			//
			//Handle Exception
			try{
				//Hit the Request
				response = client.execute(http);
				//Null check
				if(null != response){
					//Check the status line
					final StatusLine line = response.getStatusLine();
					//Null check
					if(null != line){
						//Get the response code
						final int code = line.getStatusCode();
						//Log the information
						LOGGER.info(String.format("Status Code For The Request Fired Is: %s", code));
						//Check if ok
						if(code == HttpStatus.SC_OK){
							//Get the response body
							responsebody = EntityUtils.toString(response.getEntity(),StandardCharsets.UTF_8);
							//Log the response
							LOGGER.info(String.format("Response From Delhivery: %s", responsebody));
							//Assign the to T
						    ObjectMapper objectMapper1=new ObjectMapper();
							result = objectMapper1.readValue(responsebody, type);
							
							 SearchResponse searchResponse = parseSearchResponse(responsebody);
							//Clean
							clean();
						}else{
							//Set the Error
							error(code + Constants.DASH + line.getReasonPhrase(), code);
						}
					}else{
						//Set the Error
						error(Constants.ERR_004, 9002);
					}
				}else{
					//Set the Error
					error(Constants.ERR_005, 9003);
				}
			}catch(final IOException exception){
				//Extract the message
				final String message = exception.getMessage();
				//Log the Exception
				LOGGER.error(message, exception.fillInStackTrace());
				//Set the Error
				error(StringUtils.left(message, 255), 9004);
			}
		}catch(final Exception exception){
			//Extract the message
			final String message = exception.getMessage();
			//Log the Exception
			LOGGER.error(message, exception.fillInStackTrace());
			//Set the Error
			error(StringUtils.left(message, 255), 9005);
		}finally{
			//Null check
			if(null !=response){
				//Handle Exception
				try {
					//Close the response
					response.close();
				} catch (final IOException exception) {
					//Extract the message
					final String message = exception.getMessage();
					//Log the Exception
					LOGGER.error(message, exception.fillInStackTrace());
					//Set the Error
					error(StringUtils.left(message, 255), 9006);
				}
			}
		}
		return result;
	}

	
	

}

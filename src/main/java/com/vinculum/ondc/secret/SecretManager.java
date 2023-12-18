package com.vinculum.ondc.secret;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.http.SdkHttpMetadata;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClient;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;

public class SecretManager {	
	//Logger for this class
	public static final Logger LOGGER = LoggerFactory.getLogger(SecretManager.class);
	//Declare Client Builder
	private AWSSecretsManagerClientBuilder clientBuilder;
	//Declare Object Mapper
	private ObjectMapper objectMapper;

	public SecretManager(final AWSSecretsManagerClientBuilder clientBuilder, final ObjectMapper objectMapper) {
		//Assign
		this.clientBuilder=clientBuilder;
		//Assign
		this.objectMapper = objectMapper;
	}

	/** This Method is Responsible to Call AWS Secret Get Method.
	 *  When the Secret Value is fetched, It is then converted to A Map.
	 *  This Method Returns a SecretResponse Response Object which Comprises
	 *  of Error Description and The Derived Map.
	 *  @param secretKey
	 *  @return
	 */
	public SecretResponse getSecret(final String secretKey){
		//Log
		LOGGER.info(Constants.AWS_SECRET_GET_PROCESS_START);
		//Create Response
		final SecretResponse response = new SecretResponse();
		//Handle Exceptions Here
		try {
			//Get the Value from AWS
			final String json = get(secretKey);
			//Check
			if(StringUtils.isBlank(json)) {
				//Throw
				throw new SecretException(Constants.SE_111,String.format(Constants.AWS_VALUE_IS_NULL, secretKey));
			}
			//Convert to Map
			final Properties properties = convert(json);
			//Check
			if(null == properties || properties.isEmpty()) {
				//Throw
				throw new SecretException(Constants.SE_1111, String.format(Constants.CONVERSION_NOT_FOUND, secretKey));
			}
			//Set
			response.setValues(properties);
			//Set the Response Code
			response.setResponseCode(0);
			//Set the Response Message
			response.setResponseMessage(Constants.SUCCESS_MESSAGE);
		}catch(final SecretException exception) {
			//Get the Code
			response.setResponseCode(exception.getCode());
			//Get the Message
			response.setResponseMessage(exception.getMessage());
		} catch (final Exception exception) {
			//Set Error Code
			response.setResponseCode(Constants.NINE);
			//Get the Message
			String error = exception.getMessage();
			//Check
			if(StringUtils.isBlank(error)) {
				//Set Default
				error=String.format(Constants.EXCEPTION_UNKNOWN,secretKey);
			}
			//Set Error Message
			response.setResponseMessage(error);
		}
		//Log
		LOGGER.info(Constants.AWS_SECRET_GET_PROCESS_END);
		//Return
		return response;
	}


	/** This Method is Responsible to Call the AWS API.
	 *  This Method Throws Custom SecretException Exception.
	 *  This Method Returns the Secret Value that is Persisted on AWS 
	 *  Corresponding the the Passed Secret Key.
	 *  @param secretKey
	 *  @return
	 *  @throws Exception
	 */
	private String get(final String secretKey) throws Exception {
		//Log
		LOGGER.info(Constants.AWS_GET_CALL_START);
		//Create Secret to be Returned
		String secret= Constants.BLANK;
		//Initialize Secret Manager Client
		AWSSecretsManagerClient client = null;
		//Handle Exceptions Here
		try {
			//Initialize Secret Manager Client
			client =(AWSSecretsManagerClient) clientBuilder.build();
			//Check
			if(null == client) {
				//Throw
				throw new SecretException(Constants.SE_1001, String.format(Constants.NO_AWS_CLIENT_FOUND, secretKey));
			}
			//Create the Request
			final GetSecretValueRequest request = new GetSecretValueRequest().withSecretId(secretKey);
			//Check
			if(null == request) {
				//Throw
				throw new SecretException(Constants.SE_1002, String.format(Constants.NO_REQUEST_FOUND, secretKey));
			}
			//Get the Secrets
			final GetSecretValueResult result = client.getSecretValue(request);
			//Check
			if(null == result) {
				//Throw
				throw new SecretException(Constants.SE_1003, String.format(Constants.NO_RESULT_FOUND, secretKey));
			}
			//Get the Meta Datas
			final SdkHttpMetadata sdkMeta =result.getSdkHttpMetadata();
			//Check
			if(null == sdkMeta) {
				//Throw
				throw new SecretException(Constants.SE_1004, Constants.NO_SDK_META_DATA_FOUND);
			}
			//Get  Status Code
			final int statusCode = sdkMeta.getHttpStatusCode();
			//Check
			if(statusCode == HttpStatus.SC_OK) {
				//Decrypt secret using the associated Key
				final String decrypted = result.getSecretString();
				//Check
				if(StringUtils.isNotBlank(decrypted)) {
					//Create JSON Parser
					final JSONParser parser = new JSONParser();
					//Parse
					final JSONObject json = (JSONObject) parser.parse(decrypted);
					//Cast
					final String parsed = (String)json.get(secretKey);
					//Re-Assign
					secret = parsed;
				}
			}else {
				//Throw
				throw new SecretException(Constants.SE_1005, String.format(Constants.STATUS_CODE_NOT_ACCEPTED, statusCode));
			}
		}catch(final Exception exception) {
			//Throw
			throw exception;
		}finally {
			//Check
			if(null != client) {
				//Handle Exceptions Here
				try {
					//Close
					client.shutdown();
				}catch(final Exception exception) {
					//Print
					LOGGER.info(exception.getMessage(), exception.fillInStackTrace());
				}
			}
		}
		//Log
		LOGGER.info(Constants.AWS_GET_CALL_END);

		//Return
		return secret;
	}

	/**This Method is Responsible to Map All the Secret Values to the Corresponding Json Properties
	 * @param json
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	private Properties convert(final String json) throws JsonParseException, JsonMappingException, IOException {
		//Log
		LOGGER.info(Constants.AWS_MAP_CONVERT_START);
		//Create Map to be Returned
		final Properties prop = objectMapper.readValue(json, Properties.class);
		//Log
		LOGGER.info(Constants.AWS_MAP_CONVERT_END);
		//Return
		return prop;
	}
	
	public void setClientBuilder(AWSSecretsManagerClientBuilder clientBuilder) {
		this.clientBuilder = clientBuilder;
	}
}

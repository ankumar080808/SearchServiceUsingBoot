package com.vinculum.ondc.scheduler;



import static com.vinculum.ondc.constants.Memory.KEY_MASTER;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import com.vinculum.ondc.business.memorylog.KeyStoreLoader;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.utils.Util;



/**
 *
 * @author manish.anand
 *
 * The responsibility of this class is to log the memory usages. In general
 * it will be invoked every 15 minutes and will log the information.
 *
 * This class also is responsible for checking cache and updating it if any
 * changes are done in channel type master or ext mapping.
 *
 */
public class MemoryLogScheduler implements Callable<String>{

	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(MemoryLogScheduler.class);
	
	private static final String LOOKUP_ENDPOINT = "https://pilot-gateway-1.beckn.nsdl.co.in/lookup";
	
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
	
	
	public MemoryLogScheduler(MetaData metadata, String dbId,  final CloseableHttpClient client, final String mdcType) {
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
	 * The run method which is called by the scheduler on specified time.
	 */
	@Override
	public String call() {
		//Put this to MDC
		MDC.put(Constants.UNIQUE, Constants.SYSTEM + Constants.F_SLASH + Constants.MEMORY);
		//Log the memory details
		Util.memory(MemoryLogScheduler.class);
		master();
		//Remove
		MDC.remove(Constants.UNIQUE);
		return "";
	}//End Of Memory Rebuild.
	
	
	private void master(){
		
		String response=lookup();
		final HashMap<String,String> keyMap=KeyStoreLoader.consume(response);
		
		
		//Null and Empty Check
		if(null != keyMap){
			//Loop through the channel masters
			for(final Map.Entry<String,String> master:keyMap.entrySet()){
				//Get the Key
				final String key = master.getKey();
				//Get the Value
				final String  value =master.getValue();
				//Get the old value
				final String old = KEY_MASTER.get(key);
				//Null check
				if(null == old){
					//Add this
					KEY_MASTER.put(key, value);
					//Log the information
					//LOGGER.info(String.format("Added New Public key  In Channel Type Master With Channel Type: %s, Channel Type Code: %s, Description: %s", key, value.getChannelTypeCode(), value.getChannelDesc()));
				}else{
					//Compare
					if(!value.equals(old)){
						//Replace the stale one
						KEY_MASTER.put(key, value);
						//Log the information
						//LOGGER.info(String.format("Modified Channel In Channel Type Master With Channel Type: %s, Channel Type Code: %s, Description: %s", key, value.getChannelTypeCode(), value.getChannelDesc()));
					}
				}
			}
		}
	}

	private String lookup(){
		      
		String responseString=null;
	      
	      try 
	    	{
	    	 String jsonSignature="{\"subscriber_id\":\"vinculumgroup.com\",\"type\":\"BPP\",\"domain\":\"nic2004:52110\",\"country\":\"IND\",\"city\":\"*\"}";
	         ////String jsonSignature = "vinculumgroup.com|292|ed25519";

	         HttpClient httpClient = HttpClientBuilder.create().build();
	         HttpPost request = new HttpPost(LOOKUP_ENDPOINT);         
	         System.out.println("jsonSignature--- "+jsonSignature);      
	         StringEntity params = new StringEntity(jsonSignature, ContentType.APPLICATION_JSON);
	         request.setEntity(params);     
	         HttpResponse response = httpClient.execute(request);
	         HttpEntity entity = response.getEntity();
	         responseString = EntityUtils.toString(entity, "UTF-8");
	         System.out.println("Lookup Response :: "+responseString);
	         
	        }catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	     
	      return responseString;
	}
	
    

}

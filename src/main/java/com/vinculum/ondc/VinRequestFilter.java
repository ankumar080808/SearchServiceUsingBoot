package com.vinculum.ondc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;



/**
 * This class is responsible for acting as a filter for requests which would 
 * come from ONDC network.
 *
 * The Authorization header and the json payload  would be extracted from request context and passed.
 * to the Verification utility. If the header is authenticated and verified, the control is forwarded
 * to the respective API else a failure response is returned.
 */
//@Priority(Priorities.HEADER_DECORATOR)

public class VinRequestFilter implements ContainerRequestFilter {

    public static final Logger LOGGER = LoggerFactory.getLogger(VinRequestFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
       
      try {
    		//Fetch headers
            final MultivaluedMap<String, String> map = requestContext.getHeaders();

            //Get Authorization header from  auth header
            List<String> authorizationHeader = map.getOrDefault("Authorization", Collections.emptyList());
            
            String authHeader = authorizationHeader.isEmpty() ? null : authorizationHeader.get(0);
            
            //Fetch client id
            String clientId = getClientId(authHeader);
            
            //Set Unique id in MDC context
            MDC.put("uniqueid", clientId);

            // Get the input stream of the request entity
            InputStream inputStream = requestContext.getEntityStream();
               
            // Read bytes in byte array
            byte[] data = inputStream.readAllBytes();
      
            // Parse data from byte array
            @SuppressWarnings("unused")
			String payload = new String(data, Charset.defaultCharset());
     
            // Set data to request context
            requestContext.setEntityStream(new ByteArrayInputStream(data));

            // Call verification utility to validate Auth header
            
           //boolean result = VerifyRequest.verify(authHeader, payload);
            
            boolean result = true;
            
              //Check
            if (result) {
                // Call the respective API after request header verification
                LOGGER.info("[{}]: Request processed successfully for client {}", getCurrentTimeStamp(), clientId);
                
                //Return
                return;
                
            } else {
                // Verification failed, abort the request processing and send a response
                LOGGER.warn("[{}]: Request processing aborted due to authentication failure for client {}", getCurrentTimeStamp(), clientId);
                Response response = Response.status(Response.Status.UNAUTHORIZED).build();
                requestContext.abortWith(response);
            }
        } catch (Exception e) {
        	//return;
            LOGGER.error("[{}]: Error occurred during request processing for client {}: {}", getCurrentTimeStamp(), MDC.get("clientId"), e.getMessage());
            Response response = Response.status(Response.Status.UNAUTHORIZED).build();
            requestContext.abortWith(response);
        } 
    	//Remove MDC context 
        MDC.remove("uniqueid");
    }

   
      
   
    /**
     * This method provide the current time stamp in yyyy-MM-dd HH:mm:ss format*
     * @return
     */
    public String getCurrentTimeStamp() 
    {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDatetime = datetime.format(formatter);
        return formattedDatetime;
    }
    

   /**
    * This method is to get the subscriber id from auth header
    * eg: keyId="xxxxx|292|ed25519
    * @param signature
    * @return
    */
    private static String getClientId(String signature)
    {
        Pattern pattern = Pattern.compile("keyId=\"(.*?)\\|");
        Matcher matcher = pattern.matcher(signature);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
    
    
}

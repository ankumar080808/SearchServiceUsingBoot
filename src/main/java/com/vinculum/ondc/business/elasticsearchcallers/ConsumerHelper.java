package com.vinculum.ondc.business.elasticsearchcallers;

import java.util.List;

import org.apache.http.HttpStatus;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.elasticsearch.client.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vinculum.ondc.business.eretail.vinculum.transformer.OndcToVinculumTransformer;
import com.vinculum.ondc.business.http.Requestor;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.objects.MetaData;
import com.vinculum.ondc.objects.request.cancel.Cancel;
import com.vinculum.ondc.objects.request.confirm.Confirm;
import com.vinculum.ondc.objects.request.eretailCancel.TransformerCancel;
import com.vinculum.ondc.objects.request.search.Search;
import com.vinculum.ondc.objects.request.select.Select;
import com.vinculum.ondc.objects.response.OnEventPayloadGenerator;
import com.vinculum.ondc.objects.response.ResponseStatus;
import com.vinculum.ondc.objects.response.eretail.EretailResponse;
import com.vinculum.ondc.objects.response.oncancel.OnCancel;
import com.vinculum.ondc.objects.response.oncancel.OnCancelGenerator;
import com.vinculum.ondc.objects.response.oncancel.rto.OnCancelRTOGenerator;
import com.vinculum.ondc.objects.response.oncancel.rto.OnCancelRto;
import com.vinculum.ondc.objects.response.onconfirm.singleorder.OnConfirm;
import com.vinculum.ondc.objects.response.onconfirm.singleorder.OnConfirmGenerator;
import com.vinculum.ondc.objects.response.oninit.singleresponse.OnInit;
import com.vinculum.ondc.objects.response.oninit.singleresponse.OnInitGenerator;
import com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.OnSearchByGroceryCatalog;
import com.vinculum.ondc.objects.response.onsearch.GroceryCatalog.OnSearchByGroceryCatalogGenerator;
import com.vinculum.ondc.objects.response.onsearch.fb.OnSearchByFAndBCatalog;
import com.vinculum.ondc.objects.response.onsearch.fb.OnSearchByFAndBCatalogGenerator;
import com.vinculum.ondc.objects.response.onsearch.health.OnSearchByHealthAndWellnessCatalog;
import com.vinculum.ondc.objects.response.onsearch.health.OnSearchByHealthAndWellnessCatalogGenerator;
import com.vinculum.ondc.objects.response.onsearch.homekitchen.OnSearchByHomeAndKitchenCatalog;
import com.vinculum.ondc.objects.response.onsearch.homekitchen.OnSearchByHomeAndKitchenCatalogGenerator;
import com.vinculum.ondc.objects.response.onselect.ItemNotInStock.ItemNotInStockGenerator;
import com.vinculum.ondc.objects.response.onselect.ItemNotInStock.OnSelect;
import com.vinculum.ondc.objects.sku.Product;
import com.vinculum.ondc.utils.Util;
import com.vinculum.ondc.utils.VerifyRequest;

import co.elastic.clients.elasticsearch.core.BulkResponse;

public class ConsumerHelper {
    // Logger for this class
    public static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
    
    private MetaData metaData;
    
   
	
    
    public ConsumerHelper(MetaData metaData)
    {
    	this.metaData=metaData;
    }
    
    public ConsumerHelper()
    {
    	
    }

    /**
     * Process a search operation for a list of products using the provided data and database ID.
     *
     * @param data   The data used for the search operation.
     * @param list   The list of products to search for.
     * @param dbId   The ID of the database to perform the search on.
     */
    
    public void processSearch(final Object data, List<Product> list, String dbId) {
        // Define a method 'processSearch' that takes 'data', a list of 'Product', and 'dbId' as parameters.

        @SuppressWarnings("unused")
        Search search = (Search) data;
        // Suppress a warning about 'search' being unused. Attempt to cast 'data' to a 'Search' object.

        ObjectMapper objectMapper = new ObjectMapper();
        // Initialize an 'ObjectMapper' for JSON serialization/deserialization.

        String payload = null;
        // Initialize a 'payload' variable to null, which will hold JSON data.

        String authHeader = null;
        // Initialize an 'authHeader' variable to null, which will hold authentication information.

        for (Product product : list) {
            // Loop through the list of 'Product' objects.

            try {
                if (Constants.ONDC_RET10.equalsIgnoreCase(product.getDomain())) {
                    // If the domain of the product is ONDC_RET10...

                    payload = OnSearchByFAndBCatalogGenerator.generatePayload();
                    // Generate a payload for ONDC_RET10 using a generator.

                    OnSearchByFAndBCatalog onSearchByFAndBCatalog = objectMapper.readValue(payload, OnSearchByFAndBCatalog.class);
                    // Deserialize the payload into an 'OnSearchByFAndBCatalog' object.

                    VerifyRequest.generateAuthHeader(payload);
                    // Generate an authentication header.

                    processSearchRequest(onSearchByFAndBCatalog, authHeader, payload, dbId);
                    // Call a method 'processSearchRequest' with the deserialized object and other parameters.
                } else if (Constants.ONDC_RET11.equalsIgnoreCase(product.getDomain())) {
                    // Similar process for ONDC_RET11, ONDC_RET18, and ONDC_RET17 domains...

                    payload = OnSearchByHomeAndKitchenCatalogGenerator.generatePayload();
                    // Generate a payload for ONDC_RET11.

                    OnSearchByHomeAndKitchenCatalog onSearchByHomeAndKitchenCatalog = objectMapper.readValue(payload, OnSearchByHomeAndKitchenCatalog.class);
                    // Deserialize the payload into an 'OnSearchByHomeAndKitchenCatalog' object.

                    VerifyRequest.generateAuthHeader(payload);
                    // Generate an authentication header.

                    processSearchRequest(onSearchByHomeAndKitchenCatalog, authHeader, payload, dbId);
                    // Call a method 'processSearchRequest' with the deserialized object and other parameters.
                } else if (Constants.ONDC_RET18.equalsIgnoreCase(product.getDomain())) {
                    // Similar process for ONDC_RET18...

                    payload = OnSearchByHealthAndWellnessCatalogGenerator.generatePayload();
                    // Generate a payload for ONDC_RET18.

                    OnSearchByHealthAndWellnessCatalog onSearchByHealthAndWellnessCatalog = objectMapper.readValue(payload, OnSearchByHealthAndWellnessCatalog.class);
                    // Deserialize the payload into an 'OnSearchByHealthAndWellnessCatalog' object.

                    VerifyRequest.generateAuthHeader(payload);
                    // Generate an authentication header.

                    processSearchRequest(onSearchByHealthAndWellnessCatalog, authHeader, payload, dbId);
                    // Call a method 'processSearchRequest' with the deserialized object and other parameters.
                } else if (Constants.ONDC_RET17.equalsIgnoreCase(product.getDomain())) {
                    // Similar process for ONDC_RET17...

                    payload = OnSearchByGroceryCatalogGenerator.generatePayload();
                    // Generate a payload for ONDC_RET17.

                    OnSearchByGroceryCatalog onSearchByGroceryCatalog = objectMapper.readValue(payload, OnSearchByGroceryCatalog.class);
                    // Deserialize the payload into an 'OnSearchByGroceryCatalog' object.

                    VerifyRequest.generateAuthHeader(payload);
                    // Generate an authentication header.

                    processSearchRequest(onSearchByGroceryCatalog, authHeader, payload, dbId);
                    // Call a method 'processSearchRequest' with the deserialized object and other parameters.
                }
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                // Handle JSON processing exceptions by printing the stack trace.
            }
        }
    }

    
    public void processSelect(final Object data, List<Product> list, String dbId) {
        String payload = null;
        @SuppressWarnings("unused")
        Select select = (Select) data;
        ObjectMapper objectMapper = new ObjectMapper();
        com.vinculum.ondc.objects.response.onselect.ItemNotInStock.OnSelect onSelect = null;

        if (select.getMessage().getOrder().getItems().isEmpty()) {
            OnEventPayloadGenerator generator = new ItemNotInStockGenerator();
            payload = generator.generate();
            try {
                onSelect = objectMapper.readValue(payload, OnSelect.class);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        if (!select.getMessage().getOrder().getItems().isEmpty()) {
            OnEventPayloadGenerator generator = new ItemNotInStockGenerator();
            payload = generator.generate();
            try {
                onSelect = objectMapper.readValue(payload, OnSelect.class);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        String authHeader = VerifyRequest.generateAuthHeader(payload);
        selectProcessRequest(onSelect, authHeader, dbId);
    }

   
    /**
     * Process a search request using the provided parameters and return a Response object.
     *
     * @param onSearch  The search data to be sent as a request.
     * @param token     The authentication token for the request.
     * @param payload   The payload data to be sent in the request.
     * @param dbId      The ID of the database for the search request.
     * @param <T>       The type of Response object.
     * @return          A Response object containing the result of the search request.
     */
    @SuppressWarnings("deprecation")
    public <T> Response processSearchRequest(final Object onSearch, String token, String payload, String dbId) {
        // Suppress deprecation warnings for this method.

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
            objectMapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
            objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
            @SuppressWarnings("unused")
            String onSearchJson = null;
            // Initialize an 'onSearchJson' variable and suppress an unused warning.

            try {
                onSearchJson = Util.replaceNullWithEmpty(objectMapper.writeValueAsString(onSearch));
                // Convert the 'onSearch' object to JSON, replacing null values with empty strings.
            } catch (Exception e) {
                e.printStackTrace();
            }

            CloseableHttpClient client = HttpClientBuilder.create().build();
            Requestor requestor = new Requestor();
            // Create an HTTP client and a requestor for making the request.

            Response response = requestor.fire(Response.class, payload, client, Constants.ONDC_ON_SEARCH_ENDPOINT, objectMapper, token, Constants.POST, dbId);
            // Send the request and receive a response.

            if (null == response && requestor.isError()) {
                // If the response is null and an error occurred, you can handle it here.
                // response = error(requester);
            }
            return response;
            // Return the response object.
        } catch (final Exception exception) {
            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
            // Log an error message if an exception occurs.
        }
        return null;
        // Return null if an exception occurred during processing.
    }

    /**
     * Process a select request using the provided 'OnSelect' data and return a Response object.
     *
     * @param onSelect  The data for the select request.
     * @param token     The authentication token for the request.
     * @param dbId      The ID of the database for the select request.
     * @return          A Response object containing the result of the select request.
     */
    public Response selectProcessRequest(OnSelect onSelect, String token, String dbId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // Initialize an ObjectMapper for JSON serialization.

            String onSelectJson = null;
            // Initialize a variable to hold the JSON representation of 'OnSelect' data.

            try {
                onSelectJson = Util.replaceNullWithEmpty(objectMapper.writeValueAsString(onSelect));
                // Convert the 'onSelect' object to JSON, replacing null values with empty strings.
            } catch (Exception e) {
                e.printStackTrace();
                // Handle any exceptions that occur during JSON serialization.
            }

            CloseableHttpClient client = HttpClientBuilder.create().build();
            // Create an HTTP client for making the request.

            Requestor requestor = new Requestor();
            // Initialize a Requestor for making the request.

            Response response = requestor.fire(Response.class, onSelectJson, client, Constants.ONDC_ON_SELECT_ENDPOINT, objectMapper, token, Constants.POST, dbId);
            // Send the request and receive a response.

            if (null == response && requestor.isError()) {
                // If the response is null and an error occurred, you can handle it here.
                // response = error(requester);
            }
            return response;
            // Return the response object.
        } catch (final Exception exception) {
            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
            // Log an error message if an exception occurs.
        }
        return null;
        // Return null if an exception occurred during processing.
    }


    /**
     * Process an 'OnConfirm' request using the provided data and database ID.
     *
     * @param data   The data used for the 'OnConfirm' request.
     * @param dbId   The ID of the database to perform the request on.
     */
    public void processOnConfirm(Object data, String dbId) {
        // Check if the provided 'data' is an instance of 'Confirm' before proceeding.
        if (data instanceof Confirm) {
            @SuppressWarnings("unused")
            Confirm confirm = (Confirm) data;
            // Suppress a warning about 'confirm' being unused.
            
            final SyncElasticSearch operation = new SyncElasticSearch(metaData, Constants.CONFIRM);
    		
            operation.bulkUpsertConfirm(data);
            
            // Create a payload generator specific to 'OnConfirm' requests.
            OnEventPayloadGenerator generator = new OnConfirmGenerator();
            
            // Generate the payload data for the 'OnConfirm' request.
            String payload = generator.generate();
            
            // Generate an authentication header for the payload.
            String authHeader = VerifyRequest.generateAuthHeader(payload);
            
            // Call a method to process the 'OnConfirm' request with the confirm data and authentication header.
            onConfirmProcessRequest(confirm, authHeader, dbId);
            
            // Print the generated payload to the console for debugging or logging.
            System.out.println("payload " + payload);
        }
    }

    /**
     * Process an 'OnConfirm' request using the provided 'Confirm' data, authentication header, and database ID.
     *
     * @param confirm     The 'Confirm' data for the request.
     * @param authHeader  The authentication header for the request.
     * @param dbId        The ID of the database for the request.
     * @return            A string result (possibly null) indicating the outcome of the request.
     */
    public  String onConfirmProcessRequest(Confirm confirm, String authHeader, String dbId) {
        // Initialize a transformer for converting 'Confirm' data to another format.
        OndcToVinculumTransformer transformer = new OndcToVinculumTransformer();
        
        // Suppress a warning about an unused variable.
        @SuppressWarnings("unused")
        final ResponseStatus response = new ResponseStatus();
        
        // Initialize an 'ObjectMapper' for JSON serialization and deserialization.
        ObjectMapper objectMapper = new ObjectMapper();
        
        // Initialize variables to hold JSON data.
        String eretailjson = null;
        @SuppressWarnings("unused")
        String onconfirmJson = null;
        
        // Initialize variables for response data.
        EretailResponse responses = null;
        OnConfirm onConfirm = null;
        
        try {
            // Transform the 'Confirm' data to a different format.
            eretailjson = transformer.transform(confirm);
            
            // Create a payload generator specific to 'OnConfirm' requests.
            OnEventPayloadGenerator generator = new OnConfirmGenerator();
            onconfirmJson = generator.generate();
            
            // Deserialize the 'onconfirmJson' into an 'OnConfirm' object.
            onConfirm = objectMapper.readValue(onconfirmJson, OnConfirm.class);
            
            // Access and print specific properties from the 'OnConfirm' object.
            System.out.println("order_id: " + onConfirm.getMessage().getOrder().getId());
            // Access other properties as needed
            
            // Create an HTTP client for making the request.
            CloseableHttpClient client = HttpClientBuilder.create().build();
            Requestor requestor = new Requestor();
            
            // Send the request and receive a response.
            responses =  requestor.fireEretailOrderCreate(EretailResponse.class, eretailjson, client, Constants.ONDC_ON_CONFIRM_ENDPOINT,
                    objectMapper, authHeader, Constants.POST, dbId);
            
            // Extract and print the HTTP status code from the response.
            int statusCode = (int) responses.getResponseCode();
            
            // Sucess
            if (statusCode == 0) {
            	
            	 final SyncElasticSearch operation = new SyncElasticSearch(this.metaData, Constants.CONFIRM);
           		
            	 // Update Elastic search confirm index status to 1
                 operation.updateStatus();
                   
                System.out.println("Response is valid. HTTP status code: " + statusCode);
                
            } else {
                System.out.println("Response is not OK. HTTP status code: " + statusCode);
            }
        } catch (final Exception exception) {
            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
            // Log an error message if an exception occurs.
        }
        
        // The method does not return any specific result, so return null.
        return null;
    }


    /**
     * Process an 'OnCancel' request using the provided data and database ID.
     *
     * @param data   The data used for the 'OnCancel' request.
     * @param dbId   The ID of the database to perform the request on.
     */
    public void processOnCancel(Object data, String dbId) {
        // Check if the provided 'data' is an instance of 'Cancel' before proceeding.
        if (data instanceof Cancel) {
            Cancel cancel = (Cancel) data;
            
            // Initialize an 'ObjectMapper' for JSON serialization and deserialization.
            ObjectMapper objectMapper = new ObjectMapper();
            
            // Initialize variables to hold payload and authentication header.
            String payload = null;
            String authHeader = null;
            
            try {
                // Check the domain of the 'Cancel' request to determine the payload generator.
                if (cancel.getContext().getDomain() == Constants.ONDC_RET10) {
                    // Create a payload generator specific to 'OnCancel' requests.
                    OnEventPayloadGenerator generator = new OnCancelGenerator();
                    payload = generator.generate();
                    
                    // Deserialize the payload into an 'OnCancel' object.
                    OnCancel oncancel = objectMapper.readValue(payload, OnCancel.class);
                    
                    // Generate an authentication header for the payload.
                    VerifyRequest.generateAuthHeader(payload);
                    
                    // Call a method to process the 'OnCancel' request with the 'OnCancel' object and authentication header.
                    onCancelProcessRequest(oncancel, authHeader, dbId);
                } else if (cancel.getContext().getDomain() == Constants.ONDC_RET11) {
                    // Create a payload generator specific to 'OnCancelRTO' requests.
                    OnEventPayloadGenerator generator = new OnCancelRTOGenerator();
                    payload = generator.generate();
                    
                    // Deserialize the payload into an 'OnCancelRto' object.
                    OnCancelRto oncancelRto = objectMapper.readValue(payload, OnCancelRto.class);
                    
                    // Generate an authentication header for the payload.
                    VerifyRequest.generateAuthHeader(payload);
                    
                    // Call a method to process the 'OnCancelRTO' request with the 'OnCancelRto' object and authentication header.
                    onCancelProcessRequest(oncancelRto, authHeader, dbId);
                }
            } catch (JsonMappingException e) {
                e.printStackTrace();
                // Handle JSON mapping exceptions by printing the stack trace.
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                // Handle JSON processing exceptions by printing the stack trace.
            }
        }
    }
    /**
     * Process an 'OnCancel' request using the provided 'oncancel' data, authentication header, and database ID.
     *
     * @param oncancel    The 'OnCancel' data for the request.
     * @param authHeader  The authentication header for the request.
     * @param dbId        The ID of the database for the request.
     */
    public void onCancelProcessRequest(Object oncancel, String authHeader, String dbId) {
        // Initialize a transformer for converting 'oncancel' data to another format.
        TransformerCancel transformer = new TransformerCancel();
        
        // Initialize an 'ObjectMapper' for JSON serialization and deserialization.
        ObjectMapper objectMapper = new ObjectMapper();
        
        // Initialize a variable to hold the transformed JSON data.
        String eretailjson = null;
        
        // Initialize a variable for the response from the request.
        Response responses = null;
        
        try {
            // Transform the 'oncancel' data to a different format.
            eretailjson = transformer.transform(oncancel);
            
            // Create an HTTP client for making the request.
            CloseableHttpClient client = HttpClientBuilder.create().build();
            Requestor requestor = new Requestor();
            
            // Send the request and receive a response.
            responses = requestor.fire(Response.class, eretailjson, client, Constants.ONDC_ON_CANCEL_ENDPOINT,
                    objectMapper, authHeader, Constants.POST, dbId);
            
            // Extract and print the HTTP status code from the response.
            int statusCode = responses.getStatusLine().getStatusCode();
            
            if (statusCode == HttpStatus.SC_OK) {
                System.out.println("Response is valid. HTTP status code: " + statusCode);
            } else {
                System.out.println("Response is not OK. HTTP status code: " + statusCode);
            }
        } catch (final Exception exception) {
            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
            // Log an error message if an exception occurs.
        }
    }


    /**
     * Process an 'OnInit' request using the provided 'BulkResponse' data and database ID.
     *
     * @param bulkResponse  The 'BulkResponse' data for the request.
     * @param dbId          The ID of the database for the request.
     */
    public void processOnInit(BulkResponse bulkResponse, String dbId) {
        // Create a payload generator specific to 'OnInit' requests.
        OnEventPayloadGenerator generator = new OnInitGenerator();
        
        // Generate the payload for the 'OnInit' request.
        String payload = generator.generate();
        
        // Initialize an 'ObjectMapper' for JSON serialization and deserialization.
        ObjectMapper objectMapper = new ObjectMapper();
        
        // Initialize an 'OnInit' object to hold the deserialized payload data.
        OnInit onInit = null;
        
        try {
            // Deserialize the payload into an 'OnInit' object.
            onInit = objectMapper.readValue(payload, OnInit.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
            // Handle JSON mapping exceptions by printing the stack trace.
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // Handle JSON processing exceptions by printing the stack trace.
        }
        
        // Print the generated payload to the console for debugging or logging.
        System.out.println("payload " + payload);
        
        // Generate an authentication header for the payload.
        String authHeader = VerifyRequest.generateAuthHeader(payload);
        
        // Call a method to process the 'OnInit' request with the 'OnInit' object and authentication header.
        orderInitProcessRequest(onInit, authHeader, dbId);
    }


    /**
     * Process an 'OnInit' request using the provided 'OnInit' data, authentication token, and database ID.
     *
     * @param onInit   The 'OnInit' data for the request.
     * @param token    The authentication token for the request.
     * @param dbId     The ID of the database for the request.
     * @return         A Response object containing the result of the 'OnInit' request.
     */
    private Response orderInitProcessRequest(OnInit onInit, String token, String dbId) {
        try {
            // Initialize an 'ObjectMapper' for JSON serialization and deserialization.
            ObjectMapper objectMapper = new ObjectMapper();
            
            // Initialize a variable to hold the JSON representation of 'OnInit' data.
            String onInitJson = null;
            try {
                // Serialize 'onInit' object to JSON, replacing null values with empty strings.
                onInitJson = Util.replaceNullWithEmpty(objectMapper.writeValueAsString(onInit));
            } catch (Exception e) {
                e.printStackTrace();
                // Handle any exceptions that occur during JSON serialization.
            }
            
            // Create an HTTP client for making the request.
            CloseableHttpClient client = HttpClientBuilder.create().build();
            
            // Initialize a 'Requestor' for making HTTP requests.
            Requestor requestor = new Requestor();
            
            // Send the request and receive a response.
            Response response = requestor.fire(Response.class, onInitJson, client, Constants.ONDC_ON_INIT_ENDPOINT,
                    objectMapper, token, Constants.POST, dbId);
            
            if (null == response && requestor.isError()) {
                // If the response is null and an error occurred, you can handle it here.
                // response = error(requester);
            }
            
            return response;
            // Return the response object.
        } catch (final Exception exception) {
            // Log an error message with a stack trace if an exception occurs.
            LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
        }
        
        return null;
        // Return null if an exception occurred during processing.
    }

    
    public  String processOnConfirm(final Confirm confirm,final OnConfirm onConfirm,final int statusCode) {
    	
    	int retryCount = 0;
		boolean receivedResponse = false;
		String payload = null;
		String dbId="50";
		ResponseStatus status = new ResponseStatus();
    	//Case 1: Buyer NP sends ACK for /on_confirm if the order_id is the same as /confirm and order object is same;
    	
        if (confirm.getMessage().getOrder().getId().equals(onConfirm.getMessage().getOrder().getId())) {
            // Buyer NP sends ACK for /on_confirm if the order_id is the same as /confirm
            // and order object is the same
        	
        	while (!receivedResponse && retryCount < Constants.MAX_RETRIES) {
				try {
					OnEventPayloadGenerator generator = new OnConfirmGenerator();

					payload = generator.generate();

					receivedResponse = true;
					

					ObjectMapper objectMapper = new ObjectMapper();

					String authHeader = VerifyRequest.generateAuthHeader(payload);
					onConfirmProcessRequest(confirm, authHeader,dbId);
				
				} catch (Exception e) {

					retryCount++;

					if (e.getMessage() == "Unable to process /confirm") {
						status.setResponseCode(Constants.CUSTOM_ERROR_CODE_30019);
						status.setResponseMessage(e.getMessage());
					
					}

					else {
						try {
							Thread.sleep(Constants.RETRY_INTERVAL_MILLIS);
						} catch (InterruptedException ex) {

						}
					}
				}

			}

            return "ACK";
        }


        // Case 2: order.id is different from confirm;
        else if (!confirm.getMessage().getOrder().getId().equals(onConfirm.getMessage().getOrder().getId())) {
            // Buyer NP sends NACK for on_confirm if there's an error in /on_confirm response
            // or if order.id is different from /confirm
            return "NACK";
        } 
        // Case 3 : 
        else if( (!compareItems(confirm.getMessage().getOrder().getItems(),onConfirm.getMessage().getOrder().getItems())

        		&& (!compareFullfimentType(confirm.getMessage().getOrder().getFulfillments(),onConfirm.getMessage().getOrder().getFulfillments()))))
        {

        	return "NACK";
        }
        // Check if the order state is "Cancelled."
        if (confirm.getMessage().getOrder().getState().equals("Cancelled") || statusCode!=0 ) {
            
        	// set onConfirm to cancel
        	 onConfirm.getMessage().getOrder().setState("Cancelled");
        	 return "ACK";
            
            // No further retries are needed in this case.
        }
        else {
        	return "NACK"; // Default NACK if no other condition is met
        }
    }
    
    
   public static boolean compareItems(List<com.vinculum.ondc.objects.request.confirm.Item> confirmItems,List<com.vinculum.ondc.objects.response.onconfirm.singleorder.Item> onconfirmItems)
    {
    	@SuppressWarnings("unused")
		boolean areItemsEqual = true;
    	
        // Check for quantity
    	if (confirmItems.size() == onconfirmItems.size()) {
    	    for (int i = 0; i < confirmItems.size(); i++) {
    	        if (!confirmItems.get(i).getId().equals(onconfirmItems.get(i).getId())) {
    	            areItemsEqual = false;
    	            break;
    	        }
    	    }
    	} else {
    	    areItemsEqual = false;
    	}

      return true;
    }
   
   public static boolean compareFullfimentType(List<com.vinculum.ondc.objects.request.confirm.Fulfillment> confirmFullfillments,List<com.vinculum.ondc.objects.response.onconfirm.singleorder.Fulfillment> onConfirmFullfillments)
   {
   	@SuppressWarnings("unused")
	boolean areItemsEqual = true;
   	
       // Check for quantity
   	if (confirmFullfillments.size() == onConfirmFullfillments.size()) {
   	    for (int i = 0; i < confirmFullfillments.size(); i++) {
   	        if (!confirmFullfillments.get(i).getType().equals(onConfirmFullfillments.get(i).getType())) {
   	            areItemsEqual = false;
   	            break;
   	        }
   	    }
   	} else {
   	    areItemsEqual = false;
   	}

     return true;
   }
   
   
}

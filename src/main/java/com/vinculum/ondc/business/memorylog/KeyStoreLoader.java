
package com.vinculum.ondc.business.memorylog;

import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.constants.Constants;

/**
 * The `KeyStoreLoader` class provides methods to consume lookup response and extract key-value pairs.
 * It utilizes the `com.fasterxml.jackson.databind.ObjectMapper` class for JSON processing.
 * 
 */

public class KeyStoreLoader {

    /**
     * This method is used to consume the lookup response in the Look up object and extract key-value pairs.
     * 
     * @param json The JSON string representing the lookup response.
     * @return A HashMap containing the extracted key-value pairs from the lookup response.
     */
    @SuppressWarnings("unused")
    public static HashMap<String, String> consume(String json) {
        // Create an ObjectMapper instance
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = null;
        HashMap<String, String> map = null;

        try {
            // Convert the JSON string into a JsonNode object
            root = mapper.readTree(json);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Iterate over the array elements
        for (JsonNode node : root) {
            String ukId = node.get(Constants.UK_ID).asText();
            String signingPublicKey = node.get(Constants.SIGNING_PUBLIC_KEY).asText();

            map = new HashMap<String, String>();
            map.put(ukId, signingPublicKey);
        }

        return map;
    }
}

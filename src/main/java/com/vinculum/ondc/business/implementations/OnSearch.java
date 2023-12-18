package com.vinculum.ondc.business.implementations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OnSearch {
    
    public static void main(String[] args) {
        // call the method to generate the payload with dummy data
        String payload = generatePayload();
        
        // print the generated payload
        System.out.println(payload);
    }

    public static String generatePayload() {
        // generate dummy data for the payload
        String domain = "nic2004:52110";
        String country = "IND";
        String city = "std:011";
        String action = "on_search";
        String coreVersion = "1.1.0";
        String bapId = "buyerapp.com";
        String bapUri = "https://buyerapp.com/ondc";
        String bppId = "sellerapp.com";
        String bppUri = "https://sellerapp.com/ondc";
        String transactionId = "9fdb667c-76c6-456a-9742-ba9caa5eb765";
        String messageId = "1655281254860";
        Date timestamp = new Date();
        
        List<Object> fulfList = Arrays.asList(
            Collections.singletonMap("id", "1"),
            Collections.singletonMap("id", "2"),
            Collections.singletonMap("id", "3")
        );
        
        List<String> imagesList = Collections.singletonList("https://abc.com/images/shop-img");
        
        List<Object> providersList = Collections.singletonList(Collections.singletonMap(
            "id", "P1"
        ));
        
        List<Object> locationsList = Collections.singletonList(Collections.singletonMap(
            "id", "L1"
        ));
        
        List<Object> itemsList = Collections.singletonList(Collections.singletonMap(
            "id", "I1"
        ));
        
        // create a JSON string from the dummy data
        String payload = "{"
            + "\"context\": {"
            + "\"domain\": \"" + domain + "\","
            + "\"country\": \"" + country + "\","
            + "\"city\": \"" + city + "\","
            + "\"action\": \"" + action + "\","
            + "\"core_version\": \"" + coreVersion + "\","
            + "\"bap_id\": \"" + bapId + "\","
            + "\"bap_uri\": \"" + bapUri + "\","
            + "\"bpp_id\": \"" + bppId + "\","
            + "\"bpp_uri\": \"" + bppUri + "\","
            + "\"transaction_id\": \"" + transactionId + "\","
            + "\"message_id\": \"" + messageId + "\","
            + "\"timestamp\": \"" + timestamp.toInstant().toString() + "\""
            + "},"
            + "\"message\": {"
            + "\"catalog\": {"
            + "\"bpp/fulfillments\": " + fulfList.toString() + ","
            + "\"bpp/descriptor\": {"
            + "\"name\": \"ABC store\","
            + "\"symbol\": \"https://abc.com/images/1-shop-img\","
            + "\"short_desc\": \"Online eCommerce Store\","
            + "\"long_desc\": \"Online eCommerce Store\","
            + "\"images\": " + imagesList.toString()
            + "},"
            + "\"bpp/providers\": " + providersList.toString() + ","
            + "\"bpp/locations\": " + locationsList.toString() + ","
            + "\"bpp/items\": " + itemsList.toString()
            + "}"
            + "}"
            + "}";
        
        return payload;
    }
}

package com.vinculum.ondc.business.eretail.vinculum.transformer;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.objects.request.confirm.Billing;
import com.vinculum.ondc.objects.request.confirm.Confirm;
import com.vinculum.ondc.objects.request.confirm.Context;
import com.vinculum.ondc.objects.request.confirm.Message;
import com.vinculum.ondc.objects.request.confirm.Price;
import com.vinculum.ondc.objects.request.confirm.Quote;
import com.vinculum.ondc.objects.request.eretail.PaymentItem;

public class OndcToVinculumTransformer {

	
		
	public String transform(Object data) {
		
		Confirm confirm = (Confirm) data;
	    String transformedOrderJson = null;

	    // Initialize ObjectMapper
	    ObjectMapper objectMapper = new ObjectMapper();
	    com.vinculum.ondc.objects.request.eretail.OrderMaster orderMaster = new com.vinculum.ondc.objects.request.eretail.OrderMaster();
		   
	    // Create transformedOrder object and populate its fields
	    com.vinculum.ondc.objects.request.eretail.Order transformedOrder = new com.vinculum.ondc.objects.request.eretail.Order();
	    Context context = confirm.getContext();
	    Message message = confirm.getMessage();
	    com.vinculum.ondc.objects.request.confirm.Order order = message.getOrder();
	    Billing billing = order.getBilling();
	    Quote quote = order.getQuote();
	    Price price = quote.getPrice();

	    transformedOrder.setUniqueKey("2Y69PN66YPDXq");
	    transformedOrder.setOrderLocation("TWH");
	    
	    transformedOrder.setOrderNo("2Y69PN66YPDXq"); 
	    transformedOrder.setOrderType("Prepaid");  
	    transformedOrder.setPaymentType(order.getPayment().getType()); 
	    transformedOrder.setStatus("Confirmed");

        transformedOrder.setAddressVerified("Y");
        transformedOrder.setPaymentVerified("Y");
        transformedOrder.setOrderDate("23/06/2023 17:43:00");
        transformedOrder.setOrderAmount(price.getValue());
        transformedOrder.setOrderCurrency(price.getCurrency());
        transformedOrder.setConversionRate("1.41");
        transformedOrder.setIsReplacement("No");
        transformedOrder.setCustomerName(order.getBilling().getName());
        transformedOrder.setShipAddress1("cccc");
        transformedOrder.setShipAddress2("DEF Road, Green Park");
        transformedOrder.setShipCity("Delhi");
        transformedOrder.setShipState("Delhi");
        transformedOrder.setShipCountry("India");
        transformedOrder.setShipPinCode("110001");
        transformedOrder.setShipPhone1("9999223344");
        transformedOrder.setShipEmail1("johndoe@gmail.com");
        transformedOrder.setBillName("John Doe");
        transformedOrder.setBillAddress1("House number 51, First Floor");
        transformedOrder.setBillAddress2("DEF Road, Green Park");
        transformedOrder.setBillCity(order.getFulfillments().get(0).getEnd().getLocation().getAddress().getCity());
        transformedOrder.setBillState(order.getFulfillments().get(0).getEnd().getLocation().getAddress().getState());
        transformedOrder.setBillCountry(order.getFulfillments().get(0).getEnd().getLocation().getAddress().getCountry());
        transformedOrder.setBillPinCode(order.getFulfillments().get(0).getEnd().getLocation().getAddress().getAreaCode());
        transformedOrder.setBillPhone1(order.getFulfillments().get(0).getEnd().getContact().getPhone());
        transformedOrder.setBillEmail1(order.getFulfillments().get(0).getEnd().getContact().getEmail());
        transformedOrder.setCustType("B2C");
	    
	    
    
        
        
	    // Populate item list
	    List<com.vinculum.ondc.objects.request.eretail.Item> transformedItems = new ArrayList<>();
	    for (com.vinculum.ondc.objects.request.confirm.Item itm : order.getItems()) {
	    	com.vinculum.ondc.objects.request.eretail.Item transformedItem = new com.vinculum.ondc.objects.request.eretail.Item(); 
	    	 transformedItem.setLineno(itm.getId());
	    	  transformedItem.setOrderQty(String.valueOf(itm.getQuantity().getCount()));
	    	    transformedItem.setUnitPrice("100");
	    	    transformedItem.setMode("wms");
	    	    transformedItem.setTaxInclusive("Yes");
	            transformedItem.setChannelProductId("bea848a4-7692-4ba5-bbd4-fabf2f099a2f");
	            transformedItem.setDelFulfillmentMode("1");
	            transformedItems.add(transformedItem);
	            break;

	    }
	    transformedOrder.setItems(transformedItems);

	   
	    orderMaster.setOrder(transformedOrder);

	    try {
	        transformedOrderJson = objectMapper.writeValueAsString(orderMaster);
	        System.out.println("Transformed Order JSON: " + transformedOrderJson);
	    } catch (JsonProcessingException e) {
	        e.printStackTrace();
	    }

	    return transformedOrderJson;
	}


   
}
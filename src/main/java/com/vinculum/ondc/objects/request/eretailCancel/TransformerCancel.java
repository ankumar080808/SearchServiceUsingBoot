package com.vinculum.ondc.objects.request.eretailCancel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.objects.request.cancel.Cancel;
import com.vinculum.ondc.objects.request.cancel.Context;
import com.vinculum.ondc.objects.request.cancel.Message;;


public class TransformerCancel {
	
	/**
	 * @param data
	 * @return
	 */


		
        public String  transform(Object data) 
    	{
        	
        	EretailCancel eretail=new EretailCancel();
    		Cancel cancel=(Cancel)data;
    		
    		String transformedCancelJson=null;
    		 // Map Cancel to eretail Order
    		Order transformedOrder = new Order();

            Context context = cancel.getContext();
         
            Message message = cancel.getMessage();
            transformedOrder.setOrderLocation(context.getCity());
            transformedOrder.setUniqueKey(context.getTransactionId());
            transformedOrder.setOrderNo(message.getOrderId());
            transformedOrder.setCancelationReason(message.getCancellationReasonId());
            transformedOrder.setCancelationRemarks("Cancel this order");
            eretail.setOrder(transformedOrder);
            

    		try {
    			ObjectMapper objectMapper = new ObjectMapper();
    			transformedCancelJson = objectMapper.writeValueAsString(eretail);
    			System.out.println(transformedCancelJson);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    		return transformedCancelJson;


          
        

    }
	


}

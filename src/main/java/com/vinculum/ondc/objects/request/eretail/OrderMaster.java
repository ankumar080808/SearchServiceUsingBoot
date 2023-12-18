package com.vinculum.ondc.objects.request.eretail;

import java.io.Serializable;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order"
})
@Generated("jsonschema2pojo")
public class OrderMaster implements Serializable
{

    @JsonProperty("order")
    Order order;
  
    private final static long serialVersionUID = -68910349912948289L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderMaster() {
    }

    /**
     * 
     * @param order
     */
    public OrderMaster(Order order) {
        super();
        this.order = order;
    }

    @JsonProperty("order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Order order) {
        this.order = order;
    }

   

}

package com.vinculum.ondc.objects.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vinculum.ondc.objects.sku.Product;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseStatus implements Serializable{
    private static final long serialVersionUID = -3899043660860637755L;
    private int responseCode;
    private String responseMessage;
    private List<Product> products;

   
    public String getResponseMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public int getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

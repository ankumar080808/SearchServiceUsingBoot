package com.vinculum.ondc.objects.sku;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7711166045148941092L;
	
	private String sku;
	private String skuname;
	private int status;
	private Detail details;
	private String item_descriptor;
	private String item;
	private String city;
	private String category;
	private String area_code;
	private String domain;
	@JsonIgnore
	private List object=new ArrayList();
	
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public Detail getDetails() {
		return details;
	}
	public void setDetails(Detail details) {
		this.details = details;
	}
	public String getSkuname() {
		return skuname;
	}
	public void setSkuname(String skuname) {
		this.skuname = skuname;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	public String getItem_descriptor() {
		return item_descriptor;
	}
	public void setItem_descriptor(String item_descriptor) {
		this.item_descriptor = item_descriptor;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public List<?> getObject() {
		return object;
	}
	public void setObject(List<?> object) {
		this.object = object;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	
}

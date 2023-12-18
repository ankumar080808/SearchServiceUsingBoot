package com.vinculum.ondc.secret;

import java.util.Properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecretResponse {
	private int responseCode;
	private String responseMessage;
	private String arn;
	private Properties values = new Properties();
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}	
	public String getArn() {
		return arn;
	}
	public void setArn(String arn) {
		this.arn = arn;
	}
	public Properties getValues() {
		return values;
	}
	public void setValues(Properties values) {
		this.values = values;
	}
	
}

package com.vinculum.ondc.objects.sku;

public class Confirm implements java.io.Serializable{
	
	private static final long serialVersionUID = 7711166045148941092L;

	
	
	private String bpp_id;
	
	private int id;
	
	private String timestamp;
	
	private String bap_id;
	
	private int status;
	
	private Object object;
	
	

	public String getBpp_id() {
		return bpp_id;
	}

	public void setBpp_id(String bpp_id) {
		this.bpp_id = bpp_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getBap_id() {
		return bap_id;
	}

	public void setBap_id(String bap_id) {
		this.bap_id = bap_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	

}

package com.vinculum.ondc.objects;

public class SearchException extends Exception{
	
	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 8298642100458725778L;
	//The Code
	final int code;
	//Create The Constructor
	public SearchException( final int code,final String message) {
		//Super
		super(message);
		//Assign
		this.code = code;
	}
	public int getCode() {
		return code;
	}
}

package com.vinculum.ondc.secret;

public class SecretException extends Exception{

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 8298642100458725778L;

	final int code;

	public SecretException( final int code,final String message) {
		//Assign
		super(message);
		//Assign
		this.code = code;
	}
	public int getCode() {
		return code;
	}
}
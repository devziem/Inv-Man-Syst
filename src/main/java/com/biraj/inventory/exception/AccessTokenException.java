package com.biraj.inventory.exception;

public class AccessTokenException extends IMSException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5103834241136923369L;
	
	public AccessTokenException() {
		super("40001" , "Access token exception occured.");
	}
	
	public AccessTokenException(String errorCode,String errorDescription) {
		super(errorCode , errorDescription);
	}
	

}

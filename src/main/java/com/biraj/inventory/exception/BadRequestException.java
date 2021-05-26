package com.biraj.inventory.exception;

public class BadRequestException extends IMSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2733779060228501637L;
		
	public BadRequestException() {
		super("40000" , "Internal error occured.");
	}
	
	public BadRequestException(String errorCode,String errorDescription) {
		super(errorCode , errorDescription);
	}

}

package com.biraj.inventory.exception;


public class InsufficientStockException extends IMSException {

	
	private static final long serialVersionUID = 1L;
	
	public InsufficientStockException() {
		super("40003" , "Insufficient Stock exception occured.");
	}
	
	public InsufficientStockException(String errorCode,String errorDescription) {
		super(errorCode , errorDescription);
	}
	
	public InsufficientStockException(String errorCode,String errorDescription , Exception exception) {
		super(errorCode , errorDescription , exception);
	}
	
	
}

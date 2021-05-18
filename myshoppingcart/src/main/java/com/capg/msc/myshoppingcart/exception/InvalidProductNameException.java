package com.capg.msc.myshoppingcart.exception;

public class InvalidProductNameException extends Exception{
    private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public InvalidProductNameException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidProductNameException(String productName) {
		super();
		this.productName = productName;
	}

	public InvalidProductNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidProductNameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidProductNameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}

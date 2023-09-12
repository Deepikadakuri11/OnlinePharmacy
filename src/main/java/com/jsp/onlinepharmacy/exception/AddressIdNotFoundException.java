package com.jsp.onlinepharmacy.exception;

public class AddressIdNotFoundException extends RuntimeException {

	private String message;
	
	public AddressIdNotFoundException(String message) {
		super();
		this.message = message;
	}
}

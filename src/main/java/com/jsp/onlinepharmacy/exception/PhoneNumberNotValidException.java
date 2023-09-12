package com.jsp.onlinepharmacy.exception;

public class PhoneNumberNotValidException extends RuntimeException {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PhoneNumberNotValidException(String message) {
		super();
		this.message = message;
	}
	
}

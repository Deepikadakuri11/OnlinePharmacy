package com.jsp.onlinepharmacy.exception;

public class InvalidPasswordException extends RuntimeException {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidPasswordException(String message) {
		super();
		this.message = message;
	}
	
}

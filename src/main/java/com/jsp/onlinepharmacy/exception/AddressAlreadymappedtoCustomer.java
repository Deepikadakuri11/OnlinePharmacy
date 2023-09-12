package com.jsp.onlinepharmacy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressAlreadymappedtoCustomer extends RuntimeException {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public AddressAlreadymappedtoCustomer(String message) {
	super();
	this.message = message;
}

}
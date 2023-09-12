package com.jsp.onlinepharmacy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookingCantCancelledNow extends RuntimeException {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public BookingCantCancelledNow(String message) {
	super();
	this.message = message;
}

}

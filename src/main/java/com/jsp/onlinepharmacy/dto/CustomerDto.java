package com.jsp.onlinepharmacy.dto;

import java.util.List;

import javax.persistence.OneToMany;

public class CustomerDto {

	private int customerId;
	private String customerName;
	private String Email;
	private long phoneNumber;
	
	@OneToMany
	private List<AddressDto> addresses;
	
	@OneToMany
	private List<BookingDto> bookingDtos;
	
	
	
	public List<AddressDto> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}
	public List<BookingDto> getBookingDtos() {
		return bookingDtos;
	}
	public void setBookingDtos(List<BookingDto> bookingDtos) {
		this.bookingDtos = bookingDtos;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

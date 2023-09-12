package com.jsp.onlinepharmacy.dto;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class MedicalStoreDto {

	private int storeId;
	private String name;
	private String managerName;
	private long phone;
	
	@ManyToOne
	private AdminDto adminDto;
	@OneToOne
	private AddressDto addressDto;
	
	public AdminDto getAdminDto() {
		return adminDto;
	}
	public void setAdminDto(AdminDto adminDto) {
		this.adminDto = adminDto;
	}
	public AddressDto getAddressDto() {
		return addressDto;
	}
	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}
	
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}

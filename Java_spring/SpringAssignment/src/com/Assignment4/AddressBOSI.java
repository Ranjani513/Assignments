package com.Assignment4;

public class AddressBOSI {
	private String addressLine1;
	private String addressLine2;
	private Long zipCode;
	private Long phoneNum;
	private String state;
		public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
		public String toString()
	{
		return "Addressline1:"+addressLine1+"\t"+"AddressLine2:"+addressLine2+"\t"+"Zipcode:"+zipCode+"\t"+"State:"+state;
	}
}

package com.Assignment4;

import java.util.Iterator;
import java.util.List;

public class ContactBOSI {
	private String firstName;
	private String lastName;
	private List<AddressBOSI> addressBOs;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<AddressBOSI> getAddressBOs() {
		return addressBOs;
	}
	public void setAddressBOs(List<AddressBOSI> addressBOs) {
		this.addressBOs = addressBOs;
	}
	
	
}

package com.Assignment4;

import java.util.Iterator;
import java.util.List;

public class ContactBO {
	private String firstName;
	private String lastName;
	private List<AddressBO> addressBOs;
	public ContactBO(String firstName,String lastName,List<AddressBO> addressBOs)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.addressBOs=addressBOs;
	}
	public void displaycontact()
	{
		System.out.println("FirstName:"+firstName+"\t"+"LastName:"+lastName);
		Iterator<AddressBO> it=addressBOs.iterator();
		while(it.hasNext())
		{
			System.out.println("Address:"+it.next());
		}
	}
}

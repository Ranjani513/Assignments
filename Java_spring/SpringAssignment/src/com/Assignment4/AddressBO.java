package com.Assignment4;

public class AddressBO {
	private String addressLine1;
	private String addressLine2;
	private Long zipCode;
	private Long phoneNum;
	private String state;
	public AddressBO(String addressLine1,String addressLine2, Long zipCode,Long phoneNum,String state)
	{
		super();
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		this.zipCode=zipCode;
		this.phoneNum=phoneNum;
		this.state=state;
	}
	public String toString()
	{
		return "Addressline1:"+addressLine1+"\t"+"AddressLine2:"+addressLine2+"\t"+"Zipcode:"+zipCode+"\t"+"State:"+state;
	}
}

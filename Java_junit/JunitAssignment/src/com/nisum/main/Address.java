package com.nisum.main;

public class Address {
String pincode;
String area;
String country;
	public Address(String pincode,String area,String country) {
		// TODO Auto-generated constructor stub
		super();
		this.pincode=pincode;
		this.area=area;
		this.country=country;
	}
	public void setcountry(String country)
	{
		this.country=country;
	}
	public void setarea(String area)
	{
		this.area=area;
	}
	public void setpin(String pincode)
	{
		this.pincode=pincode;
	}


}

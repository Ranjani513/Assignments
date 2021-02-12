package com.nisum.Address;

//import com.nisum.Student.Student;

public class Address {
String village;
String District;
String Mandal;
String state;
String pincode;

public Address(String village,
String District,
String Mandal,
String state,
String pincode){
	this.village=village;
	this.District=District;
	this.Mandal=Mandal;
	this.pincode=pincode;
	this.state=state;
	
}
public String getdist()
{
	return District;
}
public String getcity()
{
	return Mandal;
}
public String toString()
{
	return "Village:"+village+"\n"+"Mandal:"+Mandal+"\n"+"District:"+District+"\n"+"State:"+state+"\n"+"Pincode:"+pincode;
}
}

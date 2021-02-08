package com.nisum;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

String name;
String password;
public void setname(String name)
{
	this.name=name;
}
public void setpassword(String password)
{
	this.password=password;
}
public String getname()
{
	return name;
}
public String getpassword()
{
	return password;
}
}

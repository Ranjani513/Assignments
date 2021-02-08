package com.Assignment7;

import org.springframework.beans.factory.annotation.Required;

public class PersonB {
String name;
Integer age;
@Required
public void setname(String name)
{
	this.name=name;
}
public String getname()
{
	return name;
}
@Required
public void setage(Integer age)
{
	this.age=age;
}
public Integer getage()
{
	return age;
}
public void display()
{
	System.out.println("Name:"+name+"\n"+"Age:"+age);
}
}

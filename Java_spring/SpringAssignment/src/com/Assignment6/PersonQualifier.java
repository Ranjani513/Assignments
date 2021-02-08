package com.Assignment6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonQualifier {
	@Autowired
	@Qualifier("Person1")
	public Person person;
	public PersonQualifier()
	{
		System.out.println("I am in Personqualifier");
	}
	public void getname()
	{
		System.out.println("Name:"+person.getname());
	}
	public void getage()
	{
		System.out.println("Age:"+person.getage());
	}
}

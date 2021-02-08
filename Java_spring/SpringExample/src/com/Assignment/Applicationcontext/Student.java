package com.Assignment.Applicationcontext;

public class Student {
	String name;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void Display()
	{
		System.out.println("Hello"+name);
	}
}

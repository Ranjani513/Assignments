package com.servlet;

public class StudentDetails {
	String name;
	int id;
	StudentDetails(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public String toString()
	{
		return "Name:"+name+"\n"+"Id:"+id+"\n";
	}
}

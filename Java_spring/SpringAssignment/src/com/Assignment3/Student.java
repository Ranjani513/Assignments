package com.Assignment3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	String name;
	List<String> courses;
	Map<String,String>cost;
	Set<String> address;
	public void setname(String name) {
	this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public List<String> getcourses()
	{
		return courses;
	}
	public void setaddress(Set<String> address)
	{
		this.address=address;
	}
	public Set<String> getaddress()
	{
		return address;
	}
	public void setcourses(List<String> courses)
	{
		this.courses=courses;
	}
	public void setcost(Map<String,String> cost)
	{
		this.cost=cost;
	}
	public  Map<java.lang.String, java.lang.String> getcost()
	{
		return cost;
	}
	}


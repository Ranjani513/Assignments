package com.collections;

import java.util.List;
import java.util.Map;

public class Student {
String name;
List<String> courses;
Map<String,String>fee;
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
public void setcourses(List<String> courses)
{
	this.courses=courses;
}
public void setfee(Map<String,String> fee)
{
	this.fee=fee;
}
public  Map<java.lang.String, java.lang.String> getfee()
{
	return fee;
}
}
package com.nisum.Employee;

public class Employee {
String name;
int id;
String city;

public Employee(String name, int id, String city) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
}
}

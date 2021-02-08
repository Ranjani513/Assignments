package com.inheritance;

public class person {
String name;
String id;
String persontype;
public void setname(String setname)
{
	this.name=setname;
}
public void setid(String id)
{
	this.id=id;
}
public String getname()
{
	return name;
}
public String getid()
{
	return id;
}
public String getpersontype()
{
	return persontype;
}
public void  setpersontype(String persontype)
{
	this.persontype=persontype;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", personType=" + persontype + "]";
}
}

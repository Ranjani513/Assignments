package com.nisum.Student;

public class Student {
String FirstName;
String LastName;
int Gpa;
 int id;
Student(String FirstName,String LastName,int Gpa,int id )
{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Gpa=Gpa;
	this.id=id;
}
public String getFirstName()
{
	return FirstName;
}
public String getLastName()
{
	return LastName;
}
public  int getid()
{
	return id;
}
public int getgpa()
{
	return Gpa;
}
public String toString()
{
	return "FirstName:"+FirstName+"\n"+"LastName:"+LastName+"\t"+"ID:"+id+"\n"+"GPA:"+Gpa;
}
}

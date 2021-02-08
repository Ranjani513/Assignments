//9) Write a program to overload static methods?


package com.Ass2;
import java.util.*;
public class Overload {
String name;
int age;
double salary;
String mailid;
//String Account_no;
Overload(String name,String mailid,int age,double salary)
{
	this.name=name;
	this.mailid=mailid;
	//this.Account_no=Account_no;
	this.age=age;
	this.salary=salary;
}
public static void  details(int age,String name,String mailid)
{
	System.out.println("Age:"+age+"\t"+"Name:"+name+"\t"+"Mailid:"+mailid);
}
public static void  details(String name,int age)
{
	System.out.println("Name:"+name+"\t"+"Age:"+age);
}
public static void details(String name,double salary)
{
	System.out.println("Name:"+name+"\t"+"Salary:"+salary+"\t");
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the salary");
	double salary=sc.nextDouble();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	System.out.println("Enter the mailid");
	String mailid=sc.next();
	Overload o=new Overload(name,mailid,age,salary);
	o.details(age,name,mailid);
	o.details(name,age);
	o.details(name,salary);
	
}
}
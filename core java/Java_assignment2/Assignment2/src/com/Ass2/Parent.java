//5) Write a program to access static method in parent class from child class?
package com.Ass2;

import java.util.Scanner;

class Parent1 {
static String name;
static String id;
static int age;
Parent1(String name,String id,int age)
{
	this.name=name;
	this.id=id;
	this.age=age;
}
public static void getdetails()
{
	System.out.println("Name:"+name+"\n"+"Id:"+id+"\n"+"Age:"+age);
}
public static void hi()
{
	System.out.println("I am in stsic method from parent class");
}

}
class Child extends Parent1
{
	Child(String name, String id, int age) {
		super(name, id, age);
		// TODO Auto-generated constructor stub
	}

	public void childmethod()
	{
		super.getdetails();
	}
	public void details()
	{
		System.out.println("name:"+name+" "+"from child class");
	}
}
class Parent
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("enter the mailid");
		String id=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		Child c=new Child(name,id,age);
		c.getdetails();
		c.hi();
		c.details();
	}
}
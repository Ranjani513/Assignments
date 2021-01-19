//11)Java Program to Check Whether a Static Method Can Access the Instance Variable jkk


package com.Ass2;

import java.util.Scanner;

public class A11 {
	 String name;
	 int age;
	A11(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public static void getdetails()
	{
		System.out.println("Name:"+name+"\t"+"Age"+age);// we can't access instance variable in static method
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		A11 a=new A11(name,age);
		a.getdetails();
	}
}

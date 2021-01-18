package com.Ass2;

import java.util.Scanner;

public class A16 {
	String name;
	A16(String name)
	{
		this.name=name;
	}
	public void getdetails()
	{
		System.out.println("Name:"+name);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		A16 a=new A16(name);
		a.getdetails();
	}
}

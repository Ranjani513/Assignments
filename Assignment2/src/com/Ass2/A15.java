/*
15)Java Program to Allocate and Initialize Super
Class Members Using Constructor*/
package com.Ass2;

import java.util.Scanner;

public class A15 {
String name;
A15()
{
	this.name="Nisum";
}
public void getdetails()
{
	System.out.println("Name:"+name);
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the name:");
	//String name=sc.next();
	A15 a=new A15();
	a.getdetails();
}
}
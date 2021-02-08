//21) Write a Java Program to  display some basic information of car and bus using inheritance concept


package com.Ass2;
import java.util.*;
public class A21 {
public static void main(String []args)
{
	Bus b=new Bus("ABC","Black","XYZ");
	b.Busd();
	b.card("MNO", "REd", "KLM");
	
}

}
class Car extends A21
{
	String name;
	String color;
	String brand;
	
	public void card(String name,String color,String brand) {
	this.name=name;
	this.color=color;
	this.brand=brand;
	
		System.out.println("Name:"+name+"\t"+"color:"+color+"\t"+"brand:"+brand);
	
}
}
class Bus extends Car{
 String name;
 String color;
 String brand;
 Bus(String name,String color,String brand){
	 this.name=name;
		this.color=color;
		this.brand=brand;
 }
 public void Busd()
 {
	 System.out.println("Name:"+name+"\t"+"color:"+color+"\t"+"brand:"+brand);
	 
 }
}


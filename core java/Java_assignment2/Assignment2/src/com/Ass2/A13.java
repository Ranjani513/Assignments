//13) write a program using constructor chaining.
package com.Ass2;

public class A13 {
String name;
int mailid;
A13()
{
	System.out.println("I am in default constructor");
}
A13(String name){
	this();
   this.name=name;
	System.out.println("Name:"+name);
    
}
A13(int id)
{
	this("nisum");
	this.mailid=mailid;
	System.out.println("mail:"+mailid);
	
}
public static void main(String []args)
{
	A13 a=new A13(1234);
}
}

//7) write a program using static block.


package com.Ass2;

public class Staticblock {
//String name;
static {
	System.out.println("I am in static block");
}
{
	System.out.println("i am in instance block");
}
Staticblock()
{
	System.out.println("i am in constructor");
	}
public static void main(String []args)
{
	Staticblock st=new Staticblock();
}
}

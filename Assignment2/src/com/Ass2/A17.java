//17) Write a Java program to print alphabets on screen, i.e., a, b, c, ..., z; in lowercase.


package com.Ass2;

public class A17 {
public static void main(String[] args)
{
	for(int i=97;i<=122;i++)
	{
		char c=(char)i;
		System.out.print(c+" , ");
	}
	//System.out.println("hi");
}
}

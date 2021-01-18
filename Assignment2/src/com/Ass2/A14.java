package com.Ass2;

import java.util.Scanner;

public class A14 {
	String name;
	int id;
	A14()
	{
		System.out.println("I am in default constructor");
	}
	A14(String name){
		
	   this.name=name;
		System.out.println("Name:"+name);
	    
	}
	A14(int id,String name)
	{
		
		this.id=id;
		System.out.println("mail:"+id+"\t"+"name;"+name);
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		A14 a2=new A14();
		A14 a=new A14(1234,name);
		A14 a1=new A14(name);
	}
	}


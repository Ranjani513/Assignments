//25) Create different types of credit cards and register users to single or multiple credit cards? (Constructors, access modifiers(private & public))
package com.Ass2;

import java.util.Scanner;

public class A25 {
static	String credit1;
	static String credit2;
 	static String credit3;
	String name;
	String Address;
	int cardscount;
	static String cardname;
	static int count=0;
	A25(String credit1,String credit2,String credit3)
	{
		this.credit1=credit1;
		this.credit2=credit2;
		this.credit3=credit3;
		this.name=name;
		this.Address=Address;
		this.cardscount=cardscount;
		
	}
	public static void display()
	{
		System.out.println("----------Available cards---------------");
		
		System.out.println("1."+credit1+"\n"+"2."+credit2+"\n"+"3."+credit3);
	}
	
	public void register(String name,String Address, int cardscount) {
	this.name=name;
	this.Address=Address;
	this.cardscount=cardscount;

	System.out.println("Name:"+name+"\n"+"Address:"+Address+"Registered successfully please go further");
		
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the creditcard name 1:");
		String credit1=sc.nextLine();
		System.out.println("enter the creditcard name 2:");
		String credit2=sc.nextLine();
		System.out.println("enter the creditcard name 3:");
		String credit3=sc.nextLine();
		A25 a=new A25(credit1,credit2,credit3);
		System.out.println("enter the 1. for displaying credit cards or 2 for both registering and displaying ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			a.display();
			break;
		case 2:
			System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the Address");
		String Address=sc.next();
		System.out.println("enter the cardscount");
		int cardscount=sc.nextInt();
		//System.out.println("enter the cardname");
		//String cardname=sc.next();
	
			a.register(name, Address, cardscount);
			
			String []d=new String[cardscount];
			
			for(int i=0;i<cardscount;i++)
			{
				System.out.println("enter the cardname"+(i+1)+":");
				 cardname=sc.next();
				 if(cardname.equals(credit1) || cardname.equals(credit2) || cardname.equals(credit3)) {
				 d[i]=cardname;
				 count++;
				 }
				 else
				 {
					 System.out.println("Enter the cardname from the available list");
					 break;
				 }
			}
			for(int i=0;i<cardscount;i++)
			{
				System.out.println(d[i]);
				 
			}
			System.out.println("selected successfully"+"\n"+"Total cards selected:"+count+"\n"+"----------Thank you---------------");
			break;
			default:
				System.out.println("Enter the valid choice");
				break;
			
		}
		
	}
}
package com.nisum;
import java.util.*;
public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the first number");
   int n1=sc.nextInt();
   System.out.println("Enter the Second number");
   int n2=sc.nextInt();
   while(n1!=n2)
   {
	   if(n1%2==0)
	   {
		   System.out.println("Even number are:"+n1);
	   }
	   else
	   {
		   System.out.println("Odd number are:"+n1);
	   }
	   n1++;
   }
	}

}
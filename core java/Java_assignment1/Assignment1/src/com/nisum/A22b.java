package com.nisum;

import java.util.Scanner;

public class A22b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the first number");
		   int n1=sc.nextInt();
		   System.out.println("Enter the Second number");
		   int n2=sc.nextInt();
		   int count=0;
		   while(n1!=n2)
		   {
			   count=0;
			   for(int i=2;i<n1/2;i++)
			   {
				   if(n1%i==0)
				   {
					   count=1;
				   }
			   }
			  
			   if(count==0)
			   {
				   System.out.println(n1);
			   }
			   n1++;
		   }
	}

}

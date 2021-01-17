package com.nisum;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the integer");
		    int num=sc.nextInt();
		    int sum=0;
		    while(num!=0)
		    {
		    	int rem=num%10;
		    	sum=sum*10+rem;
		    	num/=10;
		    }
		    System.out.println("Reverse of a number:"+sum);
	}

}

package com.nisum;

import java.util.Scanner;

public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //  System.out.println("No of words in a string is:"+args.length );
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
       
   int count=0;
       String s[]=st.split(" ");
		for(String a:s)
		{
			//StringBuffer sb=new StringBuffer(a);
			count++;
		}
		System.out.print(count);
	}

}

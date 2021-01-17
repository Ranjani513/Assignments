package com.nisum;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String res="";
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
       
    /*   for(int i=0;i<args.length;i++)
       {
    	   res=res+args[i];
       }
       System.out.println(res);*/
       String s[]=st.split(" ");
		for(String a:s)
		{
			//StringBuffer sb=new StringBuffer(a);
			System.out.print(a);
		}
	}

}

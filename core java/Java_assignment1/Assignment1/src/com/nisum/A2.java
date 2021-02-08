package com.nisum;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		/* for(int i=0;i<args.length;i++)
	       {
			 StringBuffer sb=new StringBuffer(args[i]);
	    	   res=res+sb.reverse()+" ";
	       }
	       System.out.println(res.trim());*/
		String s[]=st.split(" ");
		for(String a:s)
		{
			StringBuffer sb=new StringBuffer(a);
			System.out.print(sb.reverse()+" ");
		}
	}

}

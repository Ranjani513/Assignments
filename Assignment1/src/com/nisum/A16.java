package com.nisum;

public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1=args[0];
   String s2=args[1];
   int len1=s1.length();
   int len2=s2.length();
   int t=len1+len2;
   s1=s1+s2;
   
   s2=s1.substring(0,len1);
   s1=s1.substring(len1, t);

   
   System.out.println("Swapped string values:"+s1+" "+s2);
	}

}

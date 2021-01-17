package com.nisum;
import java.util.*;
public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String s="";
    StringTokenizer str1=new StringTokenizer(str,"  ");
    while(str1.hasMoreTokens())
    {
    	String s1=str1.nextToken();
    	if(s1.charAt(0)>='a' && s1.charAt(0)<='z')
    	{
    		int i=s1.charAt(0);
    		int j=i-32;
    		char c=(char)j;
    	char c1[]=s1.toCharArray();
    	c1[0]=c;
    	s1=String.copyValueOf(c1);
    		// System.out.println(c);
    		s=s+s1+" ";
    	}
    	else
    	{
    		s=s+s1+" ";
    	}
    	  //System.out.println(str1.nextToken());
    }
    System.out.println(s);
	}

}

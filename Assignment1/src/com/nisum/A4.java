package com.nisum;
import java.util.*;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String s=sc.next();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
    	count=0;
    	for(int j=0;j<s.length();j++)
    	{
    		if(s.charAt(i)==s.charAt(j)) {
    			count=count+1;
    		}
    			
    		    	}
    	//System.out.println(count);
    	
    	if(count==1)
    	{
    		System.out.println(s.charAt(i));
    		break;
    	}
    }
	}

}
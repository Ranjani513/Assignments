package com.nisum;
import java.util.*;
public class A20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the first  string");
   String s1=sc.nextLine();
   System.out.println("enter the first  string");
   String s2=sc.nextLine();
   if(s1.compareTo(s2)>0)
   {
	   System.out.println("s1 is greater than s2");
   }
   else if(s1.compareTo(s2)<0) {

	   System.out.println("s1 is less than s2");
   }
   else
   {
	   System.out.println("s1 is equal s2");
   }
	}

}

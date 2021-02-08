//19) Write a Java program to find if a number is odd or even
package com.Ass2;
import java.util.*;
public class A19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   if(num%2==0)
   {
	   System.out.println("Given number is even");
   }
   else
   {
	   System.out.println("Given number is odd");
   }
	}

}

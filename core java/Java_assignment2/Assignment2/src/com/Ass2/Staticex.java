//6) write a program to showcase the static members and their behaviors with class instances?


package com.Ass2;
import java.util.*;
public class Staticex {
int count1=0;
 static int count2=0;

 public void test()
 {
	 this.count1=count1;
	 this.count2=count2;
	// this.count2=count2;
	 System.out.println("instance variable count:"+ count1++ +"\n"+"static variable count:"+ count2++);
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	// System.out.println("Enter the initial value of count:");
	// int count=sc.nextInt();
	 Staticex se=new Staticex();
	 se.test();
	 Staticex se1=new Staticex();
	 se1.test();
	 Staticex se2=new Staticex();
	 se2.test();
	 Staticex se3=new Staticex();
	 se3.test();
	 
	 
 }
 
}

//22) Write a java Program to display Colleges and student marks info where each subject marks should not be visible to outside(ex:take 3 subjects marks)


package com.Ass2;

import java.util.Scanner;

public class A22 {
public String college_name;
private int telugumarks;
private int engmarks;
private int mathmarks;
private void getdetails( String college_name,int telugumarks,int engmarks,int mathmarks) {
	this.college_name=college_name;
	this.telugumarks=telugumarks;
	this.mathmarks=mathmarks;
	this.engmarks=engmarks;
	System.out.println("college name:"+college_name+"\t"+"telugumarks:"+telugumarks+"\t"+"englishmarks:"+engmarks+"\t"+"mathmarks:"+mathmarks);
}
public static void main(String[] args) {
	A22 a=new A22();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the college name");
	String college_name=sc.nextLine();
	System.out.println("Enter the telugumarks");
	int telugumarks=sc.nextInt();
	System.out.println("Enter theEnglimarks");
	int engmarks=sc.nextInt();
	System.out.println("Enter the math marks");
	int mathmarks=sc.nextInt();
	a.getdetails(college_name, telugumarks, engmarks, mathmarks);
}
}

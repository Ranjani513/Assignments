/*8) Write a Java program for student class with basic student Information(name,address,section, college,class,roll no) .Here College and roll number must be 
unique and should be loaded once through out the class.write a method to display student info.*/


package com.Ass2;

import java.util.Scanner;

public class Staticstu {
	String name;
	String Address;
	String Section;
	static int roll_no;
	static String college;
 
	public void display(String name,String Address,String Section,int roll_no,String college)
	{
		this.name=name;
		this.Address=Address;
		this.Section=Section;
		this.roll_no=roll_no;
		this.college=college;
		System.out.println("Name:"+name+" \n"+"Address:"+Address+"\n "+"Section:"+Section+"\n "+"rollno:"+roll_no+" \n"+"College:"+college);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the Address:");
        String Address=sc.nextLine();
        System.out.println("Enter the Section:");
        String Section=sc.nextLine();
        System.out.println("Enter the Roll_no:");
 int roll_no=sc.nextInt();
 System.out.println("Enter the college:");
 String college=sc.next();
Staticstu st=new Staticstu();
System.out.println("------------------Displays the studentdetails---------------------");
st.display(name, Address, Section, roll_no,college);
}
}
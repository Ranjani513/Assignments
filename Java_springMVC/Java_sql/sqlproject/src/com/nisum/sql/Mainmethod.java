package com.nisum.sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
StudentDAOimpl si=new StudentDAOimpl();
do {
System.out.println("Enter"+"\n"+"1.Add Element"+"\n"+"2.delete"+"\n"+"3.update"+"\n"+"4.display");
int option=sc.nextInt();
switch(option)
{
case 1:
	System.out.println("enter the number of records to be added");
	int no=sc.nextInt();
	for(int i=0;i<no;i++)
	{
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the Rollnumber:");
		int roll=sc.nextInt();
		si.addstudent(new Student(roll,name));
	}
	break;
case 2:
	System.out.println("enter the number of records to be deleted");
	int no1=sc.nextInt();
	for(int i=0;i<no1;i++)
	{
		System.out.println("enter the name to be deleted:");
		String name=sc.next();
		System.out.println("enter the row number(index) to be deleted:");
		int roll=sc.nextInt();
		si.deletestudent(new Student(roll,name));
	}
	break;
case 3:
	System.out.println("enter the number of records to be Updated:");
	int no2=sc.nextInt();
	for(int i=0;i<no2;i++)
	{
		System.out.println("enter the name to be Updated:");
		String name=sc.next();
		System.out.println("enter the index or row number to be updated:");
		int roll=sc.nextInt();
		si.updatestudent(new Student(roll,name));
	}
	break;
case 4:
	System.out.println("***************Avaliable records*****************************");
	List<Student> s=si.getallstudentdetails();
	for(Student d:s)
	{
		System.out.println(d.getName()+"\t"+d.getRollNo());
	}

	break;
}
System.out.println("Enter  you want to proceed futher or not press Y/N");
String confirm=sc.next();
if(confirm.equalsIgnoreCase("Y"))
{
	   
}
else
{
	   break;
}

}while(true);

System.out.println("**************Thank you**********************");
	}

}

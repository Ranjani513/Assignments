/*2) Create user profile with basic information and print the user information after
 *  completion of creating the profile.
 */


package com.Ass2;


import java.util.Scanner;

public class Profile {
	String name;
	String Address;
	String mobileno;
	 String mailid;

	public void getdetails(String name,String Address,String mobileno ,String mailid)
	{
		this.name=name;
		this.Address=Address;
		this.mobileno=mobileno;
		this.mailid=mailid;
		
		System.out.println("Name:"+name+" "+"Address:"+Address+" "+"mobileno:"+mobileno+" "+"mailid:"+mailid);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the Address:");
        String Address=sc.nextLine();
        System.out.println("Enter the mailid:");
        String mailid=sc.nextLine();
        System.out.println("Enter the mobileno:");
        String mobileno=sc.next();
         Profile st=new Profile();
         st.getdetails(name, Address, mobileno, mailid);
}
}
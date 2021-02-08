/*4) Create a class UserDetails with variables like name,id,email,password,creditCard
 * ,creditCardbalance where in name,id,email of any user should be accessible to all but not creditcard and creditcardbalance.
 */


package com.Ass2;

import java.util.Scanner;

public class Userdetails {
public 	String name;
public 	String mailid;
public	String password;
private	double creditbalance;
private	 String creditname;

	public void getdetails(String name,String mailid,String password ,String creditname,double creditbalance)
	{
		this.name=name;
		this.mailid=mailid;
		this.password=password;
		this. creditname= creditname;
		this.creditbalance=creditbalance;
		System.out.println("Name:"+name+"  \t  "+"mailid:"+mailid+" \t  "+"password:"+password+"\t "+"creditname:"+creditname+"\t "+"creditname"+creditname);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the mailid:");
        String mailid=sc.nextLine();
        System.out.println("Enter the password:");
        String password=sc.nextLine();
        System.out.println("Enter the creditbalance:");
        double creditbalance=sc.nextDouble();
        System.out.println("Enter the creditname:");
        String creditname=sc.next();
        Userdetails st=new Userdetails();
         st.getdetails(name, mailid, password, creditname,creditbalance);
}
}

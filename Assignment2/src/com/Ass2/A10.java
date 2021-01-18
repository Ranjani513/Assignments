/*10) Write a util class to check whether given username and password are valid or not? Username should be email id format. Password should have alphabets,digits and special characters.

*/
package com.Ass2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A10 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the username1:");
	String uname=sc.nextLine();
	System.out.println("Enter the password");
	String pword=sc.nextLine();
	String ur= "^(.+)@(.+)$";
	String up="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	if(uname.matches(ur))
	{
		System.out.println("Entered valied mailid");
	}
	else
	{
		System.out.println("Entered invalied mailid");
	}
	Pattern pattern=Pattern.compile(up);
	Matcher matches1=pattern.matcher(pword);
	//System.out.println(matches1.matches());
	if(matches1.matches())
	{
		System.out.println("Entered valied password");
	}
	else
	{
		System.out.println("Entered invalied password");
	}
}
}

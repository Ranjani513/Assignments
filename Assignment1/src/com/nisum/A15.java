package com.nisum;

public class A15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s=args[0];
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());//using String method
	String r="";
	for(int i=s.length()-1;i>=0;i--)
	{
		r=r+s.charAt(i);
	}
	System.out.println("Reverse of the String:"+r);//without using string method
	}

}

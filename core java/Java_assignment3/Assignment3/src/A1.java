//1) Write a program to print the given string in reverse order using StringBuffer methods?
import java.util.*;
public class A1 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	StringBuffer sb=new StringBuffer(s);
	System.out.println("Reverse of the string is:"+sb.reverse());
}
}

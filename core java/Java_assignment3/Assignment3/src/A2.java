//2) Write a program to convert Interger to Float using wrapper class methods ?
import java.util.*;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer");
int i=sc.nextInt();
Integer in=new Integer(i);
System.out.println("Integre to Float:"+in.floatValue());
	}

}

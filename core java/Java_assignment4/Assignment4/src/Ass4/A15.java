//15. Write a program where finally block will not execute.

package Ass4;

public class A15 {
public static void main(String[] args)
{
	int a=1;
	int b=0;
	
	try {
		int res=a/b;
	}
	catch(Exception e){
		System.exit(1);
	}
	finally
	{
		System.out.println("I am in finally block");
	}
}
}

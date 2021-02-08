//16. Write a Program with nested try block (inside try block one more block)
package Ass4;

public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=9;
int b=0;
try {
	try {
	System.out.println(a/b);
	}
	finally
	{
		System.out.println("I am in finally block");
	
}
	
}
catch(Exception e)
{
	System.out.println("divide by Zero error");
}
	}

}

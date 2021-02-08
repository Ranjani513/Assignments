// 22. Write a Program to not execute the finally block.
package Ass4;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

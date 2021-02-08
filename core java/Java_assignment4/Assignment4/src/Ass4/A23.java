// 23. Write a program to execute the finally block.
package Ass4;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res=1/0;
		}
		
		finally
		{
			System.out.println("I am in finally block");
		}
	}

}

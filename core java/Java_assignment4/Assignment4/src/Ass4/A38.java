// 38. Write a Program to print the error message by using PrintStackStrace().
package Ass4;

public class A38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(2/0);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
	}

}

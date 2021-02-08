// 25. Write a program by using Throws keyword.
package Ass4;

public class A25 {

	public void details() throws ArithmeticException
	{
		System.out.println(2/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A25 a=new A25();
   // a.details();
     try {
    	 a.details();
     }
     catch(ArithmeticException e) {
    	 System.out.println(e.getMessage());
     }
	}

}

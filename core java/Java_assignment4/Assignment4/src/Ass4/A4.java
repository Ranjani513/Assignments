//4. Write a Program with Multiple Catch blocks.
package Ass4;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int   a=2;
		   int  b=0;
		     try
		     {
		    	System.out.println(a/b); 
		     }
		     catch(ArithmeticException ae)
		     {
		    	 System.out.println(ae);
		    	 
		     }
		     catch(ArrayIndexOutOfBoundsException aae)
		     {
		    	 System.out.println(aae);
			}
		     catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}

}

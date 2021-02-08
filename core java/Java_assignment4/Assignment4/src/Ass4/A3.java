//3. Write a Program to hand the arithmetic Exception by using custom message.
package Ass4;

public class A3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
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
    	 throw new Exception(ae);
     }
	}

}

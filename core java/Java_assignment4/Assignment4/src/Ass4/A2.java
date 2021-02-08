//2. Write a Program to hand the arithmetic Exception by using try catch block.
package Ass4;

public class A2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
  int   a=2;
   int  b=0;
   String msg="divide by zero not possible";
     try
     {
    	System.out.println(a/b); 
     }
     catch(ArithmeticException ae)
     {
    	// System.out.println("custom msg:"+msg);
    	 throw new Exception("Custom message:"+msg,ae);
     }
	}

}

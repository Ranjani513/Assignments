// 7. Write a Program without catch block.
package Ass4;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int   a=2;
		   int  b=0;
		   String msg="divide by zero not possible";
		     try
		     {
		    	System.out.println(a/b); 
		     }
		    //with out catch we will get error try must be followed by either catch or finally
finally
{
	System.out.println("I am in finally");
}

}
}
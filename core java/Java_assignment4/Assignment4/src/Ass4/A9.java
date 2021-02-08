//9. Write a Program to hand the null pointer Exception by using try-catch block.
package Ass4;

public class A9 {

	
		 String str;
		 A9(String str)
		 {
			 this.str=str;
		 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	  A9 a=new A9("hello");
	  a=null;
	  try
	  {
		  System.out.println(a.str);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Null pointer give reference to the object");
	  }
	}

}

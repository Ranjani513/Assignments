//  Write a program by implementing final,finally,finalize
package Ass4;

public class A27 {

	 protected void finalize() throws Throwable
	  {
		  System.out.println("garbage collected");
	  }
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		A27 a1=new A27();
  final int a=10;
  try {
	  System.out.println(a/0);
  }
  catch(Exception e)
  {
	  System.out.println(e.getMessage());
  }
  finally
  {
	  System.out.println("I am in finally block");
  }
 a1.finalize();
	}

}

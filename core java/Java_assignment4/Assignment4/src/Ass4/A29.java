// 29. Write a program which has multiple methods in a class and implementing in exception.
// 29. Write a program which has multiple methods in a class and implementing in exception.
package Ass4;

public class A29 {
public void array() throws ArrayIndexOutOfBoundsException
{
	int a[]= {1,2,3,4};
	System.out.println(a[6]);
}
public void divide()
{
	System.out.println(2/0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A29 a=new A29();
  try {
	  a.array();
  }
  catch(ArrayIndexOutOfBoundsException ae)
  {
	  System.out.println(ae.toString());
  }
  try {
	  a.divide();
  }
  catch(ArithmeticException ae)
  {
	  System.out.println(ae.toString());
  }
	}

}

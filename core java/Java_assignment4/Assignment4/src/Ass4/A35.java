//  35. Write a Program to handle No such method exception.
package Ass4;

import java.lang.reflect.Method;

public class A35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{


	// TODO Auto-generated method stub
Method s=String.class.getDeclaredMethod("add()");
System.out.println(s);
}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	

}
}
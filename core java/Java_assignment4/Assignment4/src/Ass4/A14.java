//14. Write a Program to hand the array index out of bound Exception by using custom message.
package Ass4;

public class A14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		String msg="array index is out of bound";
		try {
		System.out.println(a[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		throw new Exception("Custom message:"+msg,e);
	}

	}

}

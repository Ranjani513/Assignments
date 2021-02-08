//13. Write a Program to hand the array index out of Exception by using try-catch block.
package Ass4;


public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		try {
		System.out.println(a[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array is out of the range");
	}

}
}

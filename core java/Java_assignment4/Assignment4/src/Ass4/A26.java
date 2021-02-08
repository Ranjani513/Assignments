//  26. Write a program by with multiple exceptions handle in a single catch block.
package Ass4;

public class A26 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[5]);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
				throw new Exception("Array out of bound");
			}
	}

}

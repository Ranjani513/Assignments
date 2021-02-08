//  36. Write a Program by using finalize().
package Ass4;

public class A36 {

	public void d()
	{
		System.out.println("Helo");
	}
	public void finalize()
	{
		System.out.println("garbage collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A36 a=new A36();
a.finalize();
a.d();

	}

}

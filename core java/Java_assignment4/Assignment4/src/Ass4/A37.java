package Ass4;

public class A37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	System.out.println(2/0);
}
catch(ArrayIndexOutOfBoundsException ae)
{
	System.out.println("Array is out of bound");
}
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
}
catch(Exception ee)
{
	System.out.println(ee.getMessage());
}
	}

}

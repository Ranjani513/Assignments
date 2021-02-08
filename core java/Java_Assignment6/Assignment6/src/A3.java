/*Write Thread program using below methods

      --Sleep() method

	  --interrupt() method*/
public class A3 extends Thread {
	public void run()
	{
		try {
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println("Excetion occured:"+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A3 a=new A3();
a.start();
try {
	a.interrupt();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}

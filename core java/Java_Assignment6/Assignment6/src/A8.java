/*8.Write java thread program with below specifications

   -- Should have 2 threads

   --start user defined thread

   --output should un-predictable*/
public class A8 {

	public void start()
	{
		System.out.println("I am in start1 method");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			try
			{
				Thread.sleep(0);
			}
			catch(Exception w)
			{
				System.out.println(w);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   A8 a=new A8();
   Thread5  t1=new Thread5(a); 
  
   Thread6 t2=new Thread6(a);
   t2.start();
   t1.start();
	}

}
class Thread5 extends Thread
{
	A8 a;
	Thread5(A8 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.start();
	}
}
class Thread6 extends Thread
{
	A8 a;
	Thread6(A8 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.start();
	}
}

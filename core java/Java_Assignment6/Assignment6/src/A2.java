/*2. Write Thread program using below methods

      --yield() method

	  --Join() method

	  --Sleep() method*/
public class A2 extends Thread{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			System.out.println(Thread.currentThread().getName()+"\t"+i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A2 a=new A2();
  A2 b=new A2();
  A2 c=new A2();
  a.start();
  try
  {
	  a.join();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
 
  b.start();
  try
  {
	  b.yield();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  c.start();
  
	}

}

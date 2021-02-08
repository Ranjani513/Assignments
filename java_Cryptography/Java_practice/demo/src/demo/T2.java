package demo;

public class T2 implements Runnable{
	public void run()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  T2 t=new T2();
  Thread t1=new Thread(t);
  t1.run();
  
  
	}

}

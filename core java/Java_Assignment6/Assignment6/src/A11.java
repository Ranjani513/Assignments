import java.util.ArrayList;
import java.util.HashSet;

/*11. Write a java program with below conditions   

     --Should have 2 threads

    ---use collections update operations

    ---use a synchronized block*/
public class A11 extends Thread {
	static HashSet<String> ar=new HashSet<>();
	public void adding(String name1,String name2)
	{
		
		synchronized(this)
		{
			ar.add(name1);
			ar.add(name2);
		}
		System.out.println(Thread.currentThread().getName()+"\t"+ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A11 a=new A11();
Thread9 t1=new Thread9(a);
Thread10 t2=new Thread10(a);
t1.start();
t2.start();
	}

}
class Thread9 extends Thread
{
	A11 a;
	Thread9(A11 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.adding("Ranjani", "Ramya");
	}
}
class Thread10 extends Thread
{
	A11 a;
	Thread10(A11 a)
	{
		this.a=a;
	}
	public void run()
	{
		a.adding("Sushma", "Bala");
	}
}

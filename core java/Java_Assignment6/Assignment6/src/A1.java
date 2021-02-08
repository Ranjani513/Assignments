/*1.Write a program to get the following things

		-- Current thread name

		-- Current Thread Priority

		--Set the name to current Thread

		--Set the priority to the current thread*/
public class A1 extends Thread {
	public void run()
	{
		System.out.println("Curret thread nmae:"+Thread.currentThread().getName());
		System.out.println("Current Thread Priority:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 a=new A1();
a.setName("hello");
a.setPriority(MAX_PRIORITY);
A1 b=new A1();
b.setPriority(MIN_PRIORITY);
a.start();
b.start();
	}

}

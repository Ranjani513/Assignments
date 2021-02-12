package demo;

public class T extends Thread {
public void run()
{
	System.out.println("Hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   T a=new T();
   a.start();
	}

}

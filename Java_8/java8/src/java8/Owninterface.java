package java8;

public class Owninterface implements Hello {

	public void  demo()
	{
		System.out.println("It's a demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Owninterface o=new Owninterface();
Hello h=o::demo;
h.welcome();
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		//System.out.println("welcome to the world");
	}

}

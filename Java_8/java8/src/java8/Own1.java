package java8;

public class Own1 implements Own11 {
public static void main(String args[])
{
	Own11 o=(a,b)->(a+b);
	System.out.println(o.add(2, 3));
}

@Override
public int add(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
}

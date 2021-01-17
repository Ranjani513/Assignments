package com.nisum;

public class A14 {
      
	static int a=1;//class or static variable
	
    int i=10;//instance variable
    String s="Nisum";
    public void hi()
    {
    	int j=23;//local variable
    	System.out.println(j);
    }
    
	public static void main(String []args)
	{
		A14 a=new A14();
		System.out.println(a.i+" "+a.s);
		
		System.out.println(A14.a);
		a.hi();
		
	}

}

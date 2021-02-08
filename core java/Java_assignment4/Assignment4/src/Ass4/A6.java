package Ass4;

public class A6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		  int   a=2;
		   int  b=0;
		     try
		     {
		    	 int res=a/b;
		    	 
		     }
		    	
		     
		     catch(ArithmeticException ae)
		     {
		    	 System.out.println("not possible");
		    	 throw new ArithmeticException("divide by zero not possible"); 
	}

}
}

//10. Write a Program to hand the null pointer Exception by using custom message.
package Ass4;

public class A10 {
	 String str;
	 A10(String str)
	 {
		 this.str=str;
	 }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String msg="Null pointer give reference to the object";
  A10 a=new A10("hello");
  a=null;
  try
  {
	  System.out.println(a.str);
  }
  catch(Exception e)
  {
	  throw new Exception("Custom msg:"+msg,e);
  }
}
}

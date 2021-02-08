// 8. Write a Programs to get NullPointer Exception
package Ass4;

public class A8 {
	 String str;
	 A8(String str)
	 {
		 this.str=str;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  A8 a=new A8("hello");
  a=null;
  
   System.out.println(a.str);
	}

}

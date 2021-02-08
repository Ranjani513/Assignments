// 31. Write a Program to handle Class not found exception.
package Ass4;

public class A31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	         Class.forName("Ass4.A100");
	      }catch (ClassNotFoundException ex) {
	         ex.printStackTrace();
	      }
	}

}

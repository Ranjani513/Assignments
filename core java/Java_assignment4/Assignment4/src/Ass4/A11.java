// 11. Write a Program to represent the different type of messages by using stackTrace(), toString().
package Ass4;

public class A11 {

	public static void main(String[] args) {
	
		try{// TODO Auto-generated method stub
    System.out.println(2/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e);
			System.out.println("-------------------------------------------------------");
			System.out.println(e.getMessage());
			System.out.println("-------------------------------------------------------");
			System.out.println(e.toString());
			System.out.println("-------------------------------------------------------");
		}
	}

}

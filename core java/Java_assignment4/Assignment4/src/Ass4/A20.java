// 20. Write a Program without catch block.
package Ass4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	          System.out.println(1/0);
		}
			finally
			{
				System.out.println("I am in finally block");
			}
	}

}

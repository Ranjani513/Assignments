// 17. Write a Program for checked exception example.
package Ass4;

import java.io.*;

public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
          File fout=new File("o1.txt");
          FileReader fr=new FileReader(fout);
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

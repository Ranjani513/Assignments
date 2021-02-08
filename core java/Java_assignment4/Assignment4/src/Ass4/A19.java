// 19. Write a Program without finally block.
package Ass4;

import java.io.File;
import java.io.FileReader;

public class A19 {

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

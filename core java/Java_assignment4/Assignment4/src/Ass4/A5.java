//5. Write a Program with try with resource.
package Ass4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class A5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
FileOutputStream f=new FileOutputStream("out.txt");
String m="How are you";
byte b[]=m.getBytes();
f.write(b);
System.out.print("data written successfully");
	}
		catch(Exception e)
		{
			System.out.println("File not found");
		}

}
}

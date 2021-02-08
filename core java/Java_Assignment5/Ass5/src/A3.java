import java.io.IOException;
import java.io.InputStream;

// 3) Write a program to read any file (property file, image file, etc) from a static method,
//or static block using getResourceAsStream() method
public class A3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStream i=A3.class.getResourceAsStream("input.txt");
int r;
while((r=i.read())!=-1)
{
	System.out.println((char)r);
}
	}

}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// 15) Prepare program to convert inputstream to reader or BufferedReader
public class A15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("input.txt");
BufferedReader be=new BufferedReader(new InputStreamReader(fin));
String h="";
while((h=be.readLine())!=null)
		{
	  System.out.println(h);
		}
	}

}

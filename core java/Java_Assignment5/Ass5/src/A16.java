import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 16) how to get (determine) the number of bytes written to a file using DataOutputStream
public class A16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String str="Hello,How are you";
FileOutputStream fos = new FileOutputStream("out.txt");
DataOutputStream d=new DataOutputStream(fos);
d.writeBytes(str);
int s=d.size();
System.out.println("Size:"+s);
	}

}

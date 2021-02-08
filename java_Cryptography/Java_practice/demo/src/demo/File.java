package demo;
import java.io.*;
public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\input.txt");
FileOutputStream fout=new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\Desktop\\\\\\\\output.txt");
int c=0;
while((c=fin.read())!=-1)
{
	fout.write(c);
}
System.out.println("written completed");
	}

}

import java.io.File;

// 17) how to get the size of a given file in bytes, kilobytes, and megabytes?
public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("input.txt");
double size=f.length();
System.out.println("File size in bytes is : " + size);
System.out.println("File size in KB is : " + size/1024);
System.out.println("File size in MB is : " + size/(1024*1024));
	}

}

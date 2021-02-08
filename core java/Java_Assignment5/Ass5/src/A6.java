import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

// 6) Get creation, last access and last modified time of a file from a defined folder


public class A6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("input.txt");
Path p=f.toPath();
BasicFileAttributes br=Files.readAttributes(p,  BasicFileAttributes.class);
       System.out.println("Get Created:"+br.creationTime()+"last access time:"+br.lastModifiedTime());

	}

}

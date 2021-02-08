import java.io.File;

//18) how we can create a directory or a folder?
public class A18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Dell\\Desktop\\folder");
boolean create=f.mkdir();
if(create)
{
	System.out.println("folder created");
}
else
{
	System.out.println("folder not created");
}
	}

}

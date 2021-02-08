import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//  how to read a CSV file using java program
public class A20 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(new File("s.csv"));
sc.useDelimiter(",");
while(sc.hasNext())
{
	System.out.println(sc.next());
}
	}

}

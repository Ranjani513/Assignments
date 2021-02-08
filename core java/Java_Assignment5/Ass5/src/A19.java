import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 19) Program to read the Boolean value from the file using hasNextBoolean() method of Scanner class.
public class A19 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()){
		
			if(scan.hasNextBoolean()){
				
				if(scan.nextBoolean()){
					System.out.println(scan.nextLine());
				}
				else{
					break;
				}
			}
			
			else{
				System.out.println(scan.nextLine());
			}
		}
		scan.close();

	}

	}



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

// 5) Write a program to read file content line by line. To get this, you have to use BufferedReader object. By calling readLine() method you can get file content line by line. readLine() returns one line at each iteration,
//we have to iterate it till it returns null.
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BufferedReader br=null;
    String str="";
    try {
    	br=new BufferedReader(new FileReader("input.txt"));
    	 while( (str = br.readLine()) != null){
             System.out.println(str);
         }
    }
    	 catch(Exception e)
    	 {
    		 System.out.println(e.getMessage());
    	 }
    
	}

}

package ReadXL_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import lib1.Excel_configFile;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       
     Excel_configFile f=new Excel_configFile("C:\\Users\\bragaranjani\\Pictures\\Excel\\Book1.xlsx");
     System.out.println("Result1:"+f.getdata(0, 0, 1));
     f.getlist();
     //f.create();
	}

}

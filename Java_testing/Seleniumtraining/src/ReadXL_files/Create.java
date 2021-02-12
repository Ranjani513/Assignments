package ReadXL_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {
public static void main(String[] args) throws IOException
{
	  File src=new File("C:\\\\Users\\\\bragaranjani\\\\Pictures\\\\Excel\\\\Book1.xlsx");
       FileInputStream fid=new FileInputStream(src);
       XSSFWorkbook  xw=new XSSFWorkbook(fid);
       XSSFSheet  sheet1 =xw.getSheetAt(0);
		sheet1.getRow(1).createCell(0).setCellValue("Sowmya");
		FileOutputStream fout=new FileOutputStream(src);
		xw.write(fout);
		xw.close();

}
}

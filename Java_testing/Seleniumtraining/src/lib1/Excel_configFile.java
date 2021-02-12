package lib1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_configFile {
	  XSSFWorkbook xw;
	  XSSFSheet sheet1;
	  File src;
	public Excel_configFile(String excelpath) throws IOException {
		     src=new File(excelpath);
	        FileInputStream fid=new FileInputStream(src);
	         xw=new XSSFWorkbook(fid);
	          
	}
	public String getdata(int sheetnumber,int row,int col) throws IOException
	{
		sheet1 =xw.getSheetAt(sheetnumber);
		String data= sheet1.getRow(row).getCell(col).getStringCellValue();
	    /*   */
		xw.close();
		  return data;
	}
	public void getlist() throws IOException
	{
		int rowcount=sheet1.getLastRowNum();
	       for(int i=0;i<rowcount;i++)
	       {
	    	  System.out.println( sheet1.getRow(i).getCell(0).getStringCellValue());
	       }
	       xw.close();
	}
	/*public void create() throws IOException
	{
		sheet1.getRow(1).createCell(0).setCellValue("Sowmya");
		FileOutputStream fout=new FileOutputStream(src);
		xw.write(fout);
		xw.close();
	}
*/
	
}

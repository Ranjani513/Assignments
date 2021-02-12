/*9. write a program to insert, update and delete the employee records in
 *  db by providing options to user to perform operation and by taking user values at
 *   runtime and terminate program only when user wants.
*/
package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
	                  //Statement stmt = con.createStatement();
			 do {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter"+"\n"+" 1.insert data in to the table"+"\n"+"2.Update"+"\n"+"3.delete"+"\n"+"4.Display");
	           int option=sc.nextInt();
	           switch(option) {
	           case 1:
	        	   PreparedStatement ps=con.prepareStatement("insert into newdetails(id,name)values(?,?)");
	        	   System.out.println("enter the number of records you want to insert in to the table");
	        	   int no=sc.nextInt();
	        	   for(int i=0;i<no;i++)
	        	   {
	        		   System.out.println("enter the serial number of the employee:");
	        		   String sno=sc.next();
	        		   System.out.println("enter the name of the employee:");
	        		   String name=sc.next();
	        		   ps.setString(1, sno);
	        		   ps.setString(2, name);
	        		   ps.execute();
	        		     }
	        	   break;
	           case 2:
	        	   PreparedStatement ps1=con.prepareStatement("update newdetails set name=? where id=?");
	        	   System.out.println("enter the number of records you want to update  the table");
	        	   int no1=sc.nextInt();
	        	   for(int i=0;i<no1;i++)
	        	   {
	        		   System.out.println("enter the serial number of the employee to be updated:");
	        		   String sno=sc.next();
	        		   System.out.println("enter the name of the employee to be updated:");
	        		   String name=sc.next();
	        		   ps1.setString(1, sno);
	        		   ps1.setString(2, name);
	        		   ps1.execute();
	        		     }
	        	   break;
	           case 3:  
	        	   PreparedStatement ps2=con.prepareStatement("delete from newdetails  where id=?");
	        	   System.out.println("enter the number of records you want to delete from the table");
	        	   int no2=sc.nextInt();
	        	   for(int i=0;i<no2;i++)
	        	   {
	        		   System.out.println("enter the serial number of the employee you want to delete:");
	        		   String sno1=sc.next();
	        		   
	        		   ps2.setString(1, sno1);
	        		 
	        		   ps2.execute();
	        		     }
	        	   break;
	           case 4:
	        	   PreparedStatement ps3=con.prepareStatement("select * from newdetails");
	        	   ResultSet rs=ps3.executeQuery();
	        	   while(rs.next())
	        	   {
	        		   System.out.println("Id:"+rs.getString("id")+"\t"+"name:"+rs.getString("name"));
	        	   }
	        	  
	        	  
	        	   break;
	        	 default:
	        		 System.out.println("entered the out of the range");
	        		 break;

	        	   
	           }
	           System.out.println("Enter  you want to proceed futher or not press Y/N");
	           String confirm=sc.next();
	           if(confirm.equalsIgnoreCase("Y"))
	           {
	        	   
	           }
	           else
	           {
	        	   break;
	           }
			 }while(true);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}

}

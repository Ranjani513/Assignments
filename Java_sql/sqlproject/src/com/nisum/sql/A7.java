// 7. write a program by using prepared statement interface to insert, update and delete 
//multiple records into the table and display them.
package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
          
           java.sql.PreparedStatement pstmt=con.prepareStatement("insert into details (id,name,location)values(?,?,?)");
     /* for(int i=0;i<4;i++) {
    	  
    	  System.out.println("enterb the sn0");
    	  String sno1=sc.next();
    	  System.out.println("enterb the name");
    	  String name=sc.next();
    	  System.out.println("enterb the location");
    	  String locat=sc.next();
    	  pstmt.setString(1, sno1);
          
          pstmt.setString(2, name);
           pstmt.setString(3, locat);
           pstmt.execute();
      }*/
     
    	 // pstmt.execute("update details set name='Divya',location='basar' where sno=2");
           pstmt.execute("delete from details where id=4");
          
         /* pstmt.setString(1, "2");
          
          pstmt.setString(2, "Ranjani");
           pstmt.setString(3, "kerela");
          
             pstmt.execute();*/
          
        		  java.sql.ResultSet rs=pstmt.executeQuery("select * from details");
            
            while(rs.next())
            {
            	System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
            }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

//4. write a java program to demonstrate all the methods of prepared statement interface.
//(explain the method functionality with short comment in program)

package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
           Statement stmt = con.createStatement();
          // stmt.execute("insert into details values(\"1\",\"Ranjani\",\"hyderabad\");");
           java.sql.PreparedStatement pstmt=con.prepareStatement("insert into details (sno,name,location)values(?,?,?)");
        pstmt.setString(1, "4");
         
         pstmt.setString(2, "bala");
          pstmt.setString(3, "kuwit");
           pstmt.execute();//it returns the boolean value 
         
        
          
             pstmt.executeUpdate("delete from details where sno=2");//it  excutes specified query and returns the number of rows affected .
             
             
             System.out.println("deleted row successfully");
             
          
        		  java.sql.ResultSet rs=stmt.executeQuery("select * from details");//it returns the resultsetobject
            
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

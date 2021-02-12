package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root");
           Statement stmt = con.createStatement();
          // stmt.execute("insert into details values(\"1\",\"Ranjani\",\"hyderabad\");");
           java.sql.PreparedStatement pstmt=con.prepareStatement("insert into details (sno,name,location)values(?,?,?)");
        pstmt.setString(1, "1");
         
         pstmt.setString(2, "ramya");
          pstmt.setString(3, "chennai");
        //  boolean res= pstmt.execute();
          //System.out.println(res);
          // pstmt.setString(1, "2");
          pstmt.execute();
          pstmt.setString(1, "2");
          
          pstmt.setString(2, "Ranjani");
           pstmt.setString(3, "kerela");
          
             pstmt.execute();
          
        		  java.sql.ResultSet rs=stmt.executeQuery("select * from details");
            
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

//3. write a java program to demonstrate all the methods of statement interface.
//(explain the method functionality with short comment in program)

package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
	            Statement stmt = con.createStatement();
	           stmt.execute("insert into details values(2,\"goodmorning\",\"delhi\");");//it returns the boolean value
	          // stmt.execute("delete from rr where sno=3");
	           stmt.executeUpdate("delete from details where sno=3");//it returns the integer value tells how many rows got  affected
	            ResultSet rs = stmt.executeQuery("select * from details");//it returns the resultset object used for the retriving the data
	            while (rs.next())
	                System.out.println("ID:"+rs.getInt("sno") + " Name:" + rs.getString("name")+"location"+rs.getString("location") );
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}

}

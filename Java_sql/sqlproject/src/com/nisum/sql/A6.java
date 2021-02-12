// 6. write a program by statement interface to perform all the operations of sql(insert, update, delete, create(table), display).


package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
	            Statement stmt = con.createStatement();

		          // stmt.execute("create table newdetails(id varchar(20),name varchar(20))");
	          stmt.execute("insert into newdetails values(5,\"goodmorning\");");//it returns the boolean value
	           
	           //stmt.execute("delete from newdetails where sno=7");
	           
	           //stmt.execute("update newdetails set name='sowmya' where sno='5'");
	          
	           //stmt.executeUpdate("delete from details where sno=3");//it returns the integer value tells how many rows got  affected
	            ResultSet rs = stmt.executeQuery("select * from details");//it returns the resultset object used for the retriving the data
	            while (rs.next()) {
	                System.out.println("ID:"+rs.getInt("sno") + " Name:" + rs.getString("name")+"location"+rs.getString("location") );
	           
	            }
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}

}

// 8. write a program to demonstrate result set meta data interface methods and display meta data of resulset.
package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
	            
	           PreparedStatement stmt=con.prepareStatement("select * from details");
	            ResultSet rs = stmt.executeQuery();
	            ResultSetMetaData rsd=rs.getMetaData();
	          System.out.println("total number of coulumns:"+rsd.getColumnCount());
	          System.out.println("total number of coulumns:"+rsd.getColumnName(1));
	          System.out.println("total number of coulumns:"+rsd.getTableName(1));
	          con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}

}

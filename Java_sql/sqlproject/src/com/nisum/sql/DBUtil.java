package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
public static Connection getDbConnection() 
{
	try {
	
        Class.forName("com.mysql.jdbc.Driver");
         return DriverManager.getConnection( "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	return null;
	
}


}

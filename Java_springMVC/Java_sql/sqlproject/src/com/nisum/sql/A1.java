//write a simple JDBC java program to retrieve and display data from a table.
package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;





public class A1 {
	public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ranjani?characterEncoding=utf8", "root", "root");
            Statement stmt = con.createStatement();
          // stmt.execute("insert into rr values(3,\"goodmorning\");");
          // stmt.execute("delete from rr where sno=3");
           
            ResultSet rs = stmt.executeQuery("select * from rr");
            while (rs.next())
                System.out.println(
                        "EID:"+rs.getInt("sno") + " Name:" + rs.getString("name") );
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// 5. write a java program by using varios methods of result set interface.
package com.nisum.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/assignment?characterEncoding=utf8", "root", "root123");
           Statement stmt = con.createStatement();
          
        		  java.sql.ResultSet rs=stmt.executeQuery("select * from details");
            
          /*  while(rs.last())
            {
            	System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
            	break;
            }*/
        		   
                  /*  while(rs.first())
                    {
                    	System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
                    	break;
                    }*/
        		  Scanner sc=new Scanner(System.in);
        		  System.out.println("enter the name you want");
        		  String sname=sc.nextLine();
                  // while(rs.next())
                   // {
                    	/*if((rs.getString("name")).equals(sname));
                    	{
                    		
                    		while(rs.previous())
                    		{
                    			System.out.println(true);
                    			System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
                    		}
                    		break;
                    	}*/
                   //	System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
                    	
                    	
                    //}
        		  while(rs.absolute(3))
                       {
                       	
                       		
                       		while(rs.previous())
                       		{
                       			System.out.println(true);
                       			System.out.println(rs.getString("sno")+"\n"+rs.getString("name")+"\n"+rs.getString("location"));
                       		}
                       		break;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}


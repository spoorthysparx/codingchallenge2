package com.java.util;

import java.sql.*;


public class DBconnect {
private static Connection conn = null;
	
	public  DBconnect() {
     try {
            
         Class.forName("com.mysql.cj.jdbc.Driver");
 
    	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "spoorthy");
    	 
         System.out.println("Connected to the database");
           
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
 
	}
 
	public static Connection  getConnect()
	 {
		 DBconnect d1= new DBconnect();
		 return conn;
		
	 }
}

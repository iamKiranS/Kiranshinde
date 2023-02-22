package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class ConnectionUtility {

	 public static final String Driver = "com.mysql.cj.jdbc.Driver";
	 public static final String URL = "jdbc:mysql://localhost:3306/demo";
	 public static final String User = "root";
	 public static final String Password = "Kiran@123";
	 
		 public static Connection getConnectionUtility() {
			
			Connection connection = null;
		try {
			Class.forName(Driver);
		    connection = DriverManager.getConnection(URL,User,Password);
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		return connection;
	
	}
}

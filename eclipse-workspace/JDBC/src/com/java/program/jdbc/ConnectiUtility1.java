package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectiUtility1 {

	public static final String URL = "jdbc:mysql://localhost:3306/demo";
	public static final String User = "root";
	public static final String Password = "Kiran@123";
	
	public static Connection ConnectUtility() {
		
		Connection connect = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		  connect = DriverManager.getConnection(URL,User,Password);
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return connect;
	}
}

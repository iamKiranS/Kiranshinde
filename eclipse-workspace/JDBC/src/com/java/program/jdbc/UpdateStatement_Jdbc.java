package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStatement_Jdbc {

	public static void main(String[] args) {
		
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.deregisterDriver(driver);
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			
			PreparedStatement ps = con.prepareStatement("update cricket set team=? where jersyno=?");
			
			ps.setString(1, "aus");
			ps.setString(2, "3");
			
			int i = ps.executeUpdate(); 
			System.out.println("Record updated "+i);
			
			ps.close();
			con.close();
		} catch (SQLException e) {
 			e.printStackTrace();
		}
	}
}

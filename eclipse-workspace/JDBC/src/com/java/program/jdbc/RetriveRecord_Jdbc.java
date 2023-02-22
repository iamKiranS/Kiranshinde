package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveRecord_Jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			PreparedStatement ps = con.prepareStatement("select * from instagram");
		
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getInt(4));
			//	System.out.println(rs.getInt());
 
			}
			
		} catch (ClassNotFoundException | SQLException e) {
 			e.printStackTrace();
		}
	}
}

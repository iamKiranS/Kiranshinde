package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord_Jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			PreparedStatement ps = con.prepareStatement("update instagram set comment=? where srno=?");
			
			ps.setInt(1, 17);
			ps.setInt(2, 5);
			
			int i = ps.executeUpdate();
			System.out.println("updated  > "  +i);
			
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
 			e.printStackTrace();
		}
	}
}

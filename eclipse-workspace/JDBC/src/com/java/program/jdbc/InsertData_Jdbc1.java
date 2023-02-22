package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData_Jdbc1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			
			String sql = "insert into instagram(loginid,password,liked,comment,share)values('iamkiran17',12345,165,13,2),"
					+ "('its_akki',166155,88,7,1)";
			Statement smt = con.createStatement();
			smt.execute(sql);
			System.out.println("insersion query is done");
			smt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
 			e.printStackTrace();
		}
	}
}

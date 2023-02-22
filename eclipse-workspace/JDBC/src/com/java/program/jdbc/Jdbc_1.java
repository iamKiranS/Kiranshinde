package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_1 {

	public static void main(String[] args) {
		
		try {
			//load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			String sql = "insert into Employee(empName,empCity,empSalary) value('Kiran','Baramati',40000)";
			
			Statement stm = con.createStatement();
			stm.execute(sql);
			
			System.out.println("Successfully done");
			stm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
 
			e.printStackTrace();
		}
	}
}

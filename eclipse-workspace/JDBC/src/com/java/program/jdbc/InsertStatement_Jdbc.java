package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement_Jdbc {

	public static void main(String[] args) {                   
		
		//demo-schema name
        //jdbc:mysql://localhost:3306 - url
        //root - name
        //Kiran@123 - password
		
		try {
			//1.load the driver class
		//	Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new com.mysql.cj.jdbc.Driver();
			
			//2.establish the connection
			DriverManager.registerDriver(driver); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			                      
			String sql = "insert into cricket(name,score,team,sixs,fours)value('Rohit',264,'India',9,33)"
				                                                       	+ ",('Virat',183,'India',5,14)";
			
			//3. create statement
			Statement stmt = con.createStatement();
			//4.execute query
			stmt.execute(sql);
			
			System.out.println("successful");
			
			//5.close resoure
			stmt.close();
			con.close();
		} catch (SQLException e) {
 			e.printStackTrace();
		}
	}
}

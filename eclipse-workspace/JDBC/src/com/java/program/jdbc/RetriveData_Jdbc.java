package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData_Jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kiran@123");
			
			PreparedStatement ps = con.prepareStatement("select * from cricket");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("jersyno         :   "+rs.getInt(1));
				System.out.println("name            :   "+rs.getString(2));
				System.out.println("bestscore       :   "+rs.getInt(3));
				System.out.println("country         :   "+rs.getString(4));
				System.out.println("sixes           :   "+rs.getInt(5));
				System.out.println("fours           :   "+rs.getInt(6));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}

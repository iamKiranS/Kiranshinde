package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput {

		public static void getUserInput(String name,int jersyno,int hundred,String country) {
			
			try {
				Connection con = ConnectionUtility.getConnectionUtility();
				PreparedStatement ps = con.prepareStatement("insert into crick ( name, jersyno, hundred, country)values(?,?,?,?)");
				
				ps.setString(1, name);
				ps.setInt(2, jersyno);
				ps.setInt(3, hundred);
				ps.setString(4, country);
				
				ps.execute();
				
				System.out.println("Successfully uploaded");
				ps.close();
				con.close();
				
			} catch (SQLException e) {
                e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			
			Scanner sc = null;
			//Scanner sc1=new Scanner(System.in);
		//	int num = sc1.nextInt();
			for(int i=1;i<=3;++i) {
				sc=new Scanner(System.in);
			System.out.println("Enter the name");
			String name=sc.nextLine();
			System.out.println("Enter the jersyno");
			int jersyno=sc.nextInt();
			System.out.println("Enter the hundreds");
			int hundred=sc.nextInt();
			System.out.println("Enter the country");
			String country=sc.next();
			
			getUserInput(name,jersyno,hundred,country);
			}
			sc.close();
		}
}

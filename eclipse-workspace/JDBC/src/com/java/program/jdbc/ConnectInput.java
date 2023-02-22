package com.java.program.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class ConnectInput {

	public static void getConnectUtility(String loginid, int password, int liked, int comment, int share) {

		Connection con = ConnectiUtility1.ConnectUtility();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(
					"insert into instagram( loginid, password, liked, comment, share)values(?,?,?,?,?");

			ps.setString(1, loginid);
			ps.setInt(2, password);
			ps.setInt(3, liked);
			ps.setInt(4, comment);
			ps.setInt(5, share);

			ps.execute();
			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the loginid");
		String loginid = sc.nextLine();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		System.out.println("Enter the liked");
		int liked = sc.nextInt();
		System.out.println("Enter the comment");
		int comment = sc.nextInt();
		System.out.println("Enter the share");
		int share = sc.nextInt();

		getConnectUtility(loginid, password, liked, comment, share);

	}
}

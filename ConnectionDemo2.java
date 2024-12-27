package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverName="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wiproreact";
		String username= "root";
		String password = "Root@2012";
		
		Connection con= null;
		
		try {
			//step1: load the driver
			Class.forName(driverName);
			System.out.println("Driver loaded");
		
			//step2: Establish the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				//step5: close the connection
				con.close();
				System.out.println("Connection closed");
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		}

	}

}

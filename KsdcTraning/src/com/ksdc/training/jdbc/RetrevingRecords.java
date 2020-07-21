package com.ksdc.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrevingRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load the driver
		
		 Class.forName("com.mysql.jdbc.Driver");
		 
		 //2.Get connection
		Connection ct= DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
		
		//3.Create statments
		
		 Statement st=ct.createStatement();
		 ResultSet rs=st.executeQuery("select * from jdbcdemo");
		 
		 while (rs.next()) {
			System.out.println(rs.getInt("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Designation"));
			
		}
		 ct.close();
		
	}
	
	

}

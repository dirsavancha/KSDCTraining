package com.ksdc.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteReord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
		Statement st=ct.createStatement();
		int i=st.executeUpdate("DELETE FROM JDBCDEMO WHERE ID=102");
		if(i>0) {
			System.out.println("Row Deleted");
		}else {
			System.out.println("Row not Deleted");
		}
		ct.close();
	}

}

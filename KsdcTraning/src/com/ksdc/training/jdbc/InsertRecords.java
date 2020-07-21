package com.ksdc.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection ct= DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
		 Statement st=ct.createStatement();
		int i= st.executeUpdate("INSERT INTO JDBCDEMO(ID,NAME,DESIGNATION)VALUES(103,'Peter','Executive')");
		st.executeUpdate("INSERT INTO JDBCDEMO(ID,NAME,DESIGNATION)VALUES(104,'James','Representative')");
		st.executeUpdate("INSERT INTO JDBCDEMO(ID,NAME,DESIGNATION)VALUES(105,'Allen','ReportingManager')");
		if(i>0) {
			System.out.println("Rows inserted");
		}else {
			System.out.println("Rows not inserted");
		}
		ct.close();
	}
	

}

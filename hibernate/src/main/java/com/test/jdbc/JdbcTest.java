package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class JdbcTest {

	// Driver name and url
	static final String JDBC_DRIVER = "org.h2.Driver";
	//static final String JDBC_URL = "jdbc:h2:~/test";
	static final String JDBC_URL = "jdbc:h2:@127.0.1.1:8082";
	
	

	// database credential
	static final String USERNAME = "sa";
	static final String PASSWORD = "sa";

	public static void main(String[] rgs) {
		

		// Connection conn = null;

		try {
			// load
			Class.forName(JDBC_DRIVER);
			// get connection
			// try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME,
			// PASSWORD)) {}
			Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			System.out.println("connection successfull...");

		} catch (SQLException | ClassNotFoundException exception) {
			System.out.println("exeption while creating h2 database connection ");
			exception.printStackTrace();
		}
	}

}

package com.coolcuy.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	final String URL = "jdbc:oracle:thin:@192.168.0.56:1521:XE";
	final String USER = "yun";
	final String PASSWORD = "1111";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.0.56:1521:XE", 
				"yun",
				"1111");
	}
}


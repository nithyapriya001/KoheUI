package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/kohedb";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "welcome");
			return connection;
		} catch (Exception e) {
			throw e;
		}

	}

}
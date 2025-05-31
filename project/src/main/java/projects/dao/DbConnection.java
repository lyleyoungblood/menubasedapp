package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

private static String HOST = "localhost";
private static String PASSWORD = "projects";
private static int PORT = 3306;
private static String SCHEMA = "projects";
private static String USER = "projects";

public static Connection getConnection() {
	String url = String.format("jdbc:mysql://localhost:3306/projects?user=projects&password=projects", HOST, PORT, SCHEMA, USER, PASSWORD);

try {
	Connection conn = DriverManager.getConnection(url);
	System.out.println("Connection to schema " + SCHEMA + " was successful.");
	return conn;
} catch (SQLException e) {
	System.out.println("Unable to connect to " + url);
	throw new DbException("Unable to get connection at \" + url");
}


}
	
}

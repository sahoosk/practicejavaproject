package pkg002_LearnJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			String userName = "root";
			String passWord = "password";
			
			String url = "jdbc:mysql://localhost/test";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			conn = DriverManager.getConnection(url, userName, passWord);
			
			System.out.println("Database connection successful");
		} 
		
		catch(Exception e) {
			
		System.out.println("Can not connect to database");
		
			
		}
	}
	
}

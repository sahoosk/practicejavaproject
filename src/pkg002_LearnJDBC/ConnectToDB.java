package pkg002_LearnJDBC;

import java.sql.*;

public class ConnectToDB {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			String userName = "root";
			String passWord = "root";
			
			String url = "jdbc:mysql://localhost/test";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			conn = DriverManager.getConnection(url, userName, passWord);
			
			System.out.println("Database connection successful");
		} 
		
		catch(Exception e) {
			
		System.out.println("Can not connect to database :  " + e.toString());
				
		}
		
		finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("Database Connectiion Closed");
				} catch (Exception e) {
					System.out.println("Database Connectiion can not be Closed");
				}
			}
		}
	}
	
}

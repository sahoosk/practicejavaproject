package pkg002_LearnJDBC;

import java.sql.*;

public class ConnectToDB {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			String userName = "root";
			String passWord = "spring";
			
			String url = "jdbc:mysql://localhost/mydb?useSSL=false";    //?useSSL=false makes the program not to show warning 
			
			//Class.forName("com.mysql.jdbc.Driver").newInstance(); driver deprecated
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
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

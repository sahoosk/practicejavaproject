package pkg_001_TrialWorkSpace;

import java.sql.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Connection conn = null;
		try {
			
			String userName = "root";
			String passWord = "root";
			
			String url = "jdbc:mysql://localhost/world?useSSL=false";    // world is the name of a valid db and '?useSSL=false' makes the program not to show warning 
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
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


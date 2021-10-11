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


/*

Create a new Java project in Eclipse.
Right click on the project folder, select Build Path, and from the submenu select Add External Archives...
In the JAR Selection panel that comes up; browse to the j connector jar file in the folder you have downloaded the mysql j connector jar file.



OR

If you're facing this problem with Eclipse, I've been following many different solutions but the one that worked for me is this:

Right click your project folder and open up Properties.

From the right panel, select Java Build Path then go to Libraries tab.

Select Add External JARs to import the mysql driver (here the j connector jar file)


You should see the sql driver on the list. Select it and click first.


*/


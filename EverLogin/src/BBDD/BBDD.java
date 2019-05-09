package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BBDD {

	public static ResultSet getResultSet(String query)
	{
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			Statement statement = connection.createStatement(); 
			ResultSet resultSet = statement.executeQuery(query);
			connection.close();  
			
			return resultSet;
		}catch(Exception e) { 
			System.out.println(e);
		}
		
		return null;
	}
}

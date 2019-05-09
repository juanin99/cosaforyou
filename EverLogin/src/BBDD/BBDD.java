package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BBDD {

	public static String[][] getTable(String query, int columns)
	{
		String[][] table = new String[100][columns];
		boolean todoNice = false;
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			Statement statement = connection.createStatement(); 
			ResultSet resultSet = statement.executeQuery(query);
			
			int rowsCounter = 0;
			for(rowsCounter = 0; resultSet.next(); rowsCounter++)
			{
				for(int j = 0; j < columns; j++)
				{
					table[rowsCounter][j] = resultSet.getString(j + 1);
					todoNice = true;
				}
			}
			String[][] notNice = new String[1][1];
			notNice[0][0] = "";
			if(!todoNice) return notNice;
			String finalTable[][] = new String[rowsCounter][columns];
			for(int i = 0; i < rowsCounter; i++)
			{
				for(int j = 0; j < columns; j++)
				{
					finalTable[i][j] = table[i][j];
				}
			}
			connection.close();
			return finalTable;
		}catch(Exception e) { 
			System.out.println(e);
		}
		
		return null;
	}
}


package Gestores;

import BBDD.BBDD;
import Vista.Login;

public class GestorUsuario 
{	
	public static boolean userExists(String username)
	{
		BBDD bbdd = new BBDD();
		
		String[][] table = bbdd.getTable("select * from usuario where nick = '" + username + "'", 2);
		if(table[table.length - 1][0].equals(username)) return true;
		else return false;
	}
	
	public static boolean passwordIsCorrect(String username, String hashPassword)
	{
		BBDD bbdd = new BBDD();
		
		String[][] table = bbdd.getTable("select * from usuario where nick = '" + username + "'", 2);
		if(table[table.length - 1][1].equals(hashPassword)) return true;
		else return false;
	}
	
	public static void insertUser(String username, String hashPassword)
	{
		BBDD bbdd = new BBDD();
		
		bbdd.insertQuery("insert into usuario values('" + username + "', '" + hashPassword + "');");
	}
}

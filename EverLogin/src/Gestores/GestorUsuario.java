package Gestores;

import java.sql.ResultSet;
import java.sql.SQLException;

import BBDD.BBDD;
import Modelo.Usuario;

public class GestorUsuario 
{	
	public static Usuario getUserFromDDBB(String username)
	{
		BBDD bbdd = new BBDD();
		
		String[][] table = bbdd.getTable("select * from usuario where nick = '" + username + "'", 2);
		return new Usuario(table[0][0], table[0][1]);
	}
	
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
}

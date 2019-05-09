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
		
		ResultSet resultSet = bbdd.getResultSet("select * from usuario where nick = " + username);
		try {
			return new Usuario(resultSet.getString(1), resultSet.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean userExists(String username)
	{
		BBDD bbdd = new BBDD();
		
		try {
			ResultSet resultSet = bbdd.getResultSet("select * from usuario where nick = " + username);
			if(resultSet.getString(1) == username) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}

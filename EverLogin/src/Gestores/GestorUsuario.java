package Gestores;

import java.sql.ResultSet;
import java.sql.SQLException;

import BBDD.BBDD;
import Modelo.Usuario;

public class GestorUsuario 
{
	private BBDD bbdd;
	
	public GestorUsuario()
	{
		bbdd = new BBDD();
	}
	
	public Usuario getUserFromDDBB(String username)
	{
		ResultSet resultSet = bbdd.getResultSet("select * from usuario where nick = " + username);
		try {
			return new Usuario(resultSet.getString(1), resultSet.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

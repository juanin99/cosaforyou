package Gestores;

import BBDD.BBDD;

public class GestorCoche 
{
	public static String getCarsStrings()
	{
		BBDD bbdd = new BBDD();
		
		int columns = 4;
		String carsString = "";
		
		String[][] tabla = bbdd.getTable("select * from car", columns);
		
		for(int i = 0; i < tabla.length; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				carsString += tabla[i][j] + "  ";
			}
			carsString += "\n";
		}
		return carsString;
	}
}

package Gestores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Usuario;

public class GestorAceptar implements ActionListener
{
	private String username;
	private Usuario user;

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		username = login.getUserTextField().getText();
		user = new GestorUsuario().getUserFromDDBB(username);
		
		Resultado result = new Resultado("Resultado");
		result.setUser(username);
	}
}

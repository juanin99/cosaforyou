package Gestores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Usuario;
import Vista.Login;
import Vista.Resultado;

public class GestorAceptar implements ActionListener
{
	private String username;
	private Login login;
	
	public GestorAceptar(Login login)
	{
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		username = login.getUserTextField().getText();
		
		if(GestorUsuario.userExists(username))
		{
			Resultado result = new Resultado("Resultado");
			result.setUser(username);
		}
		else
		{
			JOptionPane.showMessageDialog(login, "El usuario " + username + " no existe", "Usuario no existe", JOptionPane.ERROR_MESSAGE, null);
		}
	}
}

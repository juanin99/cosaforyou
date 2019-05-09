package Gestores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.Login;

public class GestorRegistrar implements ActionListener 
{
	private String username;
	private String nonHashPassword;
	private Login login;
	
	public GestorRegistrar(Login login)
	{
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		username = login.getUserTextField().getText();
		nonHashPassword = String.valueOf(login.getPassTextField().getPassword());
		
		if(!GestorUsuario.userExists(username))
		{
			GestorUsuario.insertUser(username, nonHashPassword);
			JOptionPane.showMessageDialog(login, "El usuario " + username + " ha sido añadido con exito al sistema", "Usuario registrado", JOptionPane.INFORMATION_MESSAGE, null);
		}
		else JOptionPane.showMessageDialog(login, "El usuario " + username + " ya existe", "Usuario ya existe", JOptionPane.ERROR_MESSAGE, null);
	}

}

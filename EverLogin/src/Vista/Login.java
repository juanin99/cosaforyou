package Vista;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends JFrame {
	
	private JButton aceptarButton;
	private JButton registrarButton;
	private JLabel usuarioLabel;
	private JLabel passLabel;
	private JTextField usuarioText;
	private JTextField passText;
	
	
	public Login(String title) {
		
		setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        setResizable(true);
        setVisible(true);
        
        
        usuarioLabel =new JLabel("Usuario: ");  
        usuarioText = new JTextField(28);
        passLabel =new JLabel("Password: ");  
        passText = new JTextField(28);
        aceptarButton = new JButton("Aceptar");
        registrarButton = new JButton("Registrar");
        
        /*GestorAceptar gestorAceptar = new GestorAceptar(this);
        aceptarButton.addActionListener(gestorAceptar);
        registrarButton.addActionListener(new GestorRegistrar(this));*/
        
        //Panel TOP
        JPanel top = new JPanel();
		top.setLayout(new GridBagLayout());
		
		g.gridx = 0;
		g.gridy = 0;
		g.weightx = 1.0;
		g.weighty = 1.0;
		
		g.insets = new Insets(5, 55, 5, 40);
		top.add(usuarioLabel, g);
		g.gridx = 1;
		top.add(usuarioText, g);
		g.gridx = 0;
		add(top, g);
		
		
		//Panel MIDDLE
		JPanel middle = new JPanel();
		middle.setLayout(new GridBagLayout());
		
		g.gridx = 0;		
		g.insets = new Insets(5, 51, 5, 40);
		middle.add(passLabel, g);
		g.gridx = 1;
		middle.add(passText, g);
		g.gridx = 0;
		g.gridy = 1;
		add(middle, g);
				
		//Panel BOTTOM
		JPanel bottom = new JPanel();
		bottom.setLayout(new GridBagLayout());
		
		g.gridx = 0;
		g.gridy = 0;		
		bottom.add(aceptarButton, g);
		
		g.gridx = 1;
		bottom.add(registrarButton, g);		
		g.gridx = 0;
		g.gridy = 2;
		add(bottom, g);	
				
		
		pack();
		
	}
	
	public static void main(String args[]) 
	{
		Login mainWindow = new Login("EverLogin");
		
		
		
	}
	
	public JTextField getUserTextField() {return usuarioText;}
	public JTextField getPassTextField() {return passText;}

}

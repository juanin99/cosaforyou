package Vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import Gestores.GestorSalir;

public class Resultado extends JDialog 
{
	private JLabel hola;
	private JTextArea textArea;
	private String user;
	private JButton botonSalir;
	
	public Resultado(String title, String user) 
	{
		setTitle(title);
		setLayout (new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		setVisible(true);
		setResizable(true);
		
		this.user = user;
		hola = new JLabel ("Hola " + user);
		textArea = new JTextArea();
		botonSalir = new JButton ("Aceptar"); 
		
		JPanel panelhola = new JPanel();
		panelhola.setLayout (new GridBagLayout());
		g.gridx = 0;
		g.weightx = 1.0;
		g.weighty = 1.0;
		//g.fill = GridBagConstraints.HORIZONTAL;
		//g.insets = new Insets(5, 55, 5, 40);

		panelhola.add(hola, g);
		add(panelhola,g);
		
		JPanel panelholahola = new JPanel();
		panelholahola.setLayout (new GridBagLayout());
	
		
		textArea.setColumns(20);
		textArea.setRows(10);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		JScrollPane scrollablePanel = new JScrollPane(textArea);
		scrollablePanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollablePanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panelholahola.add(textArea,g);
		
		
		panelholahola.add(scrollablePanel); 
		
		g.gridx = 0;
		g.gridy = 1;
		add(panelholahola, g);
		
		
		JPanel panelholaholahola = new JPanel ();
		panelholaholahola.setLayout (new GridBagLayout());
		
		
		botonSalir.addActionListener(new GestorSalir());
		
		
		g.gridx =-1;
		g.gridy = 2;
		g.gridwidth = 1;
		g.anchor = GridBagConstraints.LINE_START;
		g.insets = new Insets(15, 25, 30, 25);
		g.ipadx = 20;
		panelholaholahola.add(botonSalir,g);
		add(panelholaholahola,g);
		pack();
		
	}

	
	public JTextArea getTextArea() {return textArea;}
	public JLabel getJLabel() {return hola;}
	public void setUser(String user) {this.user=user;}
}
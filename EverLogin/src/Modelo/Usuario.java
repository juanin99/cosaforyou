package Modelo;

public class Usuario 
{
	private String username;
	private String hashPassword;
	
	public Usuario(String username, String hashPassword)
	{
		this.username = username;
		this.hashPassword = hashPassword;
	}
	
	public String getUsername() {return username;}
	public String getHashPassword() {return hashPassword;}
}

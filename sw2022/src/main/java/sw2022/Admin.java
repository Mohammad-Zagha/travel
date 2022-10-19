package sw2022;

public class Admin {
	

	protected String Password;
	protected boolean isLogged;
	
	public Admin(String password) {
	
		this.Password = password;
		this.isLogged = false;
	}
	
	
	public boolean login(String password)
	{
		this.isLogged = this.Password.equals(password);
		return this.isLogged;
	}
	
    public boolean logout()
	{
    	this.isLogged = false;
    	return this.isLogged;
	}
	
	public boolean LoggingStatus()
	{return this.isLogged;
	}
	

}

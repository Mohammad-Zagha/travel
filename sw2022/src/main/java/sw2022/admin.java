package sw2022;

public class admin {
	

	protected String name;
	protected String password;
	protected boolean isLogged;
	
	public admin(String name, String password) {
		//super(UserName, PassWord);
		this.name = name;
		this.password = password;
		this.isLogged = false;
	}
	
	
	public boolean login(String password)
	{this.isLogged = this.password.equals(password);
	return this.isLogged;
	}
	
    public boolean logout()
	{this.isLogged = false;
	return this.isLogged;
	}
	
	public boolean isLogged()
	{return this.isLogged;
	}
	

}

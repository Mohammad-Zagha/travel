package sw2022;

public class User {
protected String UserName;
protected String PassWord;
protected Boolean LogInStatus;
public User(String UserName,String PassWord)
{
	this.PassWord=PassWord;
	this.UserName=UserName;
	this.LogInStatus=false; // User is Logged out at first 
}
public boolean LoggedIn(String UserName,String PassWord)
{
	if(this.UserName.equals(UserName)&&this.PassWord.equals(PassWord))
	{
		this.LogInStatus=true;
		return LogInStatus;
	}
	else
	{
		this.LogInStatus=false;
		return LogInStatus;
	}
	
	
}
public Boolean Logout() {
	// TODO Auto-generated method stub
	this.LogInStatus=false;
	return LogInStatus;
	
}
}

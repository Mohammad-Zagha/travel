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
public boolean getLoginStatus()
{
	
		return LogInStatus;

}
public void Logout() {
	// TODO Auto-generated method stub
	this.LogInStatus=false;
}

public void login(String user,String password) {
	if(UserName.equals(user)&&PassWord.equals(password))
	{
		LogInStatus=true;
	}
	else
	{
		LogInStatus=false;
	}
	
	
}

}

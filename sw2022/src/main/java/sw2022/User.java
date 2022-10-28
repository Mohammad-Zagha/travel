package sw2022;

import java.util.ArrayList;

public class User {
protected String UserName;
protected String PassWord;
protected String email;
protected String phone;
protected Boolean LogInStatus;
protected ArrayList<Trip> UserTrips = new ArrayList<>();
public User(String UserName,String PassWord)
{
	this.PassWord=PassWord;
	this.UserName=UserName;
	this.LogInStatus=false; // User is Logged out at first 
}
public User(String UserName,String PassWord,String email,String phone)
{
	this.PassWord=PassWord;
	this.UserName=UserName;
	this.email=email;
	this.phone=phone;
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
public String getPassword()
{
	return this.PassWord;
}
}

package sw2022;

import java.util.ArrayList;

public class Controlls {



public static boolean isUser( String user, String pass) {
	//Tempt data
	if(  (user.equals("rosol")&&pass.equals("tuhul")) || (user.equals("mohammad")&&pass.equals("zagha")) || (user.equals("amer")&&pass.equals("zagha")) )
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
	
}
}

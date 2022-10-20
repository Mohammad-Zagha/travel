package sw2022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class MainScreen {
	private static ArrayList<User> UserList;
	private static ArrayList<Admin> AdminList;
	protected static ArrayList<Trip> trips;
	
	
	public static void main(String[] args) {
		
		AdminList= new ArrayList<Admin>();
		UserList= new ArrayList<User>();
		trips=new ArrayList<Trip>();
		
		
		String UserName;
		String Password;
		String AdminPassword;
		

		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		
		while (true) {
			
			menu();
			char c = sc.next().charAt(0);
		
			switch (c) {
			case '1':
				System.out.print("Username:  ");
				UserName=sc.next();

				System.out.println("Password:  ");
				Password=sc.next();

				if(isUser(UserName,Password))
				{
					//Show User Menu
				}
				else
				{
					System.out.println ("Wrong Info ");
				}
				break;
			case '2':
				System.out.print("Admin Password:  ");
				AdminPassword=sc.next();
				if(isAdmin(AdminPassword))
				{

					//Admin.showAdminMenu();
					c = sc.next().charAt(0);
					switch (c)
					{
					case '4':
						System.out.print("inter the User Username:   ");
						String 	tempString=sc.next();
						User tempUser= Controlls.isUser(tempString,UserList);
					if(tempUser !=null) {
						for (int i=0;i<tempUser.UserTrips.size();i++)
						{
							System.out.println(tempUser.UserTrips.get(i).tripName);
						}
					}
					else
					{
						System.out.println("User Not Found");	
					}
					
						break;
					}
					
				}
				else
				{
					System.out.println ("Wrong Info ");
				}
				break;
			case '3':
				
		
				
			}
		}

	}
	public static boolean isUser(String userName, String password) {
		for(int i=0;i<UserList.size();i++)
		{
			if(UserList.get(i).PassWord.equals(password) && UserList.get(i).UserName.equals(userName))
			{
				return true;
			}
		

		}
		return false;

	}

	public static boolean isAdmin(String password) {
		for(int i=0;i<AdminList.size();i++)
		{
			if(AdminList.get(i).Password.equals(password) )
			{
				return true;
			}
				}
		return false;
	}

	public static void menu() {
		System.out.println("1) User Login");
		System.out.println("2) Admin Login");
		System.out.println("3) Sign up");

	}
	}
	


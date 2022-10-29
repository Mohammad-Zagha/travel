package sw2022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class MainScreen {
	private static ArrayList<User> UserList;
	private static ArrayList<Admin> AdminList;
	protected static ArrayList<Trip> trips;
	
	
	
	public static void main(String[] args) {
		
		
		Trip a1 = new Trip();
		AdminList= new ArrayList<Admin>();
		UserList= new ArrayList<User>();
		trips=new ArrayList<Trip>();
		User U =new User("amer" , "zagha");
		UserList.add(U);
		Trip t=new Trip("Aqaba","Queen Alia International Airport","Aqaba - wadiRam-");
		Trip t1=new Trip("nablus","Queen Alia International Airport","nablus-ramallah");
		Trip t2=new Trip("spain","Queen Alia International Airport","spain - madrid-");
		trips.add(t);
		trips.add(t1);
		trips.add(t2);
		
		
		String UserName;
		String Password;
		String email;
		String phone;
		String AdminPassword;
		

		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		
		while (true) {
			
			menu();
			char c = sc.next().charAt(0);
		
			switch (c) {
			case '1':
				System.out.print("Username:  \n");
				UserName=sc.next();

				System.out.println("Password:  ");
				Password=sc.next();

				if(isUser(UserName,Password))
				{
					System.out.print("a:join a trip\n");
				}
				else
				{
					System.out.println ("Wrong Info ");
				}
				Scanner sc1=new Scanner(System.in);
				char d = sc1.next().charAt(0);
				switch(d) {
				case'a':
					System.out.println ("please choose your trip : \n ");
					for(int i=0; i<trips.size() ;i++) {
						 a1 =trips.get(i);
						String A2=a1.tripName;
						String A3 = a1.airport;
						String A4 = a1.tripCource;
						 
							System.out.print(i+1);
							System.out.print(" :" );
							System.out.print(A2 );
							System.out.print("\t ," );
							System.out.print(A3 );
							System.out.print("\t ," );
							System.out.print(A4 );
							System.out.print("\n" );
							} 
					
					}
				
				Scanner sc2=new Scanner(System.in);
				int w = sc2.nextInt();
				
					
				for(int k =0 ;k<trips.size() ; k++) {
					if(k+1==w) {
						Trip l1 =new 	Trip();
						l1 = trips.get(k);
						User U2 =new User();
						U2.UserTrips.add(l1);
						for(int g=0 ; g<U2.UserTrips.size() ; g++) {
							Trip y1 = U2.UserTrips.get(g);
							String y2=y1.tripName;
							String y3 = y1.airport;
							String y4 = y1.tripCource;
							System.out.print(w);
							System.out.print(" :" );
							System.out.print(y2 );
							System.out.print("\t ," );
							System.out.print(y3 );
							System.out.print("\t ," );
							System.out.print(y4 );
							System.out.print("\n" );
							
						
						}
					}
					
					
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
				
				System.out.print("Username:  ");
				UserName=sc.next();
				System.out.print("password:  ");
				Password=sc.next();
				System.out.print("email:  ");
				email=sc.next();
				System.out.print("phone:  ");
				phone=sc.next();
				
				if(Controlls.sameinfo(UserName,UserList))
				{
					System.out.println ("this username is already in use please try again \n");
				}
				else {
					User x1;
				x1=	Controlls.singup(UserName, Password, email, phone);
					UserList.add(x1);
				}
			
		
		break;
				
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
		System.out.println("5) choose trip");

	}
	}
	


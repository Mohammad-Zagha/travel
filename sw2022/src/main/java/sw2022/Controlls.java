package sw2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlls {
	public static User isUser(String userName ,ArrayList<User> list) 
	{
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print( list.get(i).UserName);
			if( list.get(i).UserName.equals(userName))
			{
				
				return list.get(i);
			}
		
		}
		return null;
	}
	public static ArrayList<String> getTripNames(User user,Admin Admin)
	{	
		if(Admin.isLogged)
		{
			ArrayList<String> tempList=new ArrayList<>();
			for (int i=0;i<user.UserTrips.size();i++)
			{
				tempList.add(user.UserTrips.get(i).tripName);
			}
			return tempList;
		}
		else
		{
			return null;
		}
	
	}
	
	
	
	public static boolean addTrip(Admin admin , Trip trip )
	{
			
		if ( admin.LoggingStatus() )
		{
			
				MainScreen.trips.add(trip);
				
				return true;
		}
		else
		{
			System.out.println("the admin is not logged in");
			return false;
		}
		
	
	
	}
	
	public static ArrayList<String> search( String type,ArrayList<Trip> trips ) {
		ArrayList<String> result = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		if ( type.equals("all") ) {
			String temp;
			for(int i=0;i<trips.size();i++)
			{
				temp=trips.get(i).tripName+" / "+trips.get(i).airport+" / "+trips.get(i).tripCource;
				result.add(temp);
			}
			
		}
		
		if ( type.equals("Name") ) {
			System.out.print("Please inter the Trip Name :  ");
			String Name=sc.next();
			String temp;
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).tripName.equals(Name))
				{
					temp=trips.get(i).tripName+" / "+trips.get(i).airport+" / "+trips.get(i).tripCource;
					result.add(temp);
				}
			
			}
			
		}
		
		
		return result;
		
		}
	
	
	
	
	
	public static boolean addTrip(Admin admin , Trip trip,ArrayList<Trip> list )
	{
			
		if ( admin.LoggingStatus() )
		{
			
				list.add(trip);
				return true;
		}
		else
		{
			System.out.println("the admin is not logged in");
			return false;
		}
		
	
	
	}
	
		
	}

	


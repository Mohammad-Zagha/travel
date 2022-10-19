package sw2022;

import java.util.ArrayList;

public class Trip {
protected static ArrayList<String[]> trips;
	
	protected String tripName;
	protected String id_trip;
	protected String airport;
    protected boolean added;
	
		
	public Trip()
	{
		trips = new ArrayList<String[]>();
		added = false;
	}
	
	public void set( String tripName ,String airport, String id_trip )
	{
		this.tripName = tripName;
		this.airport=airport;
		this.id_trip = id_trip;
		
	}
	
	public boolean add(admin Admin)
	{
		added = false;

		if ( Admin.isLogged() )
		{
			String [] trip = { this.tripName , this.id_trip  };
			if ( Trip.trips.add(trip) )
				added = true;
		}
		else
		{
			System.out.println("the admin is not logged in");
		}
		
		return added;
	}
	
	
	
	public ArrayList<String> search(String text, String type) {
		ArrayList<String> result = new ArrayList<String>();
		boolean flag = false;
		
		if ( type.equals("all") ) {
			flag = true;
		}
		
		for (int i = 0; i < trips.size(); i++)
		{String [] b = (String[])trips.get(i);
			
		
		if ( (type.equals("tripName")  || flag) && ( b[0].indexOf( text ) != -1))
			result.add(b[2]);
			
		if ( (type.equals("airportName")  || flag) && (b[1].indexOf( text ) != -1) )
			result.add(b[2]);
			
		if ( (type.equals("id_trip")|| flag) && (b[2].indexOf( text ) != -1) )
			result.add(b[2]);
		
		
		//catch(Exception IndexOutOfBounds) {System.out.println("errror dear");}
		
		
		}
		return result;
	}
	

	public String get(String type) {
		if (type.equals("tripName"))
			return this.tripName;
		else  if(type.equals("id_trip"))
			return this.id_trip;
		else return this.airport;	
	}
	
	public boolean isAdded()
	{
		return this.added;
	}
	

}

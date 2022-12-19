package software;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


//import javax.swing.JOptionPane;


import java.time.Duration;

public class MyTrips {
	

	public ArrayList<Trip> trips =new ArrayList<Trip>();
	public static ArrayList<User>registeredUsers =new ArrayList<User>();
	
	public static final HashMap<String,ArrayList<Trip>> registered = new HashMap<String, ArrayList<Trip>>();	Trip b,c,d;
	int fine;
	
	
	
	public class DateServer {

		public LocalDate getDate() {
			LocalDate today =  LocalDate.now();  
			return today;
		}
		
			
	} 
	
	
	DateServer date=new DateServer();
	
	public void add(Trip b, Admin user) {
		// TODO Auto-generated method stub
		if( user.getLogState()==false) {
			System.out.println("you can't add trips");
		}
		else {
			trips.add(b);
			
		}
	}

	public ArrayList<Trip> tripIDSearch(String string) {
		Trip b;
		ArrayList<Trip>results=new ArrayList<Trip>();
		for(int i=0 ;i<trips.size();i++) {
			if(trips.get(i).tripID.contains(string)) {
				b=trips.get(i);
				results.add(b);
			}
			
			if(trips.get(i).airportNOW.contains(string)) {
				b=trips.get(i);
				results.add(b);
			}
			
			if(trips.get(i).destination.contains(string)) {
				b=trips.get(i);
				results.add(b);
			}
			
		}
		
		return results;

		
	}

	
	

	public boolean isContained(String string, String string2, String string3) {
		boolean found =false;
		for (int i=0;i<trips.size();i++) {
			if(trips.get(i).destination.equals(string) && trips.get(i).airportNOW.equals(string2) && trips.get(i).tripID.equals(string3) )
				found= true;
		
			else 
				found= false;
		}
		return found;
					
	}




public void setFine(int x) {
	
	fine=x;
}

public  int getFine() {
	return fine;
}

public boolean checkUser(User u) {
	
	for (int i=0;i<registeredUsers.size();i++) {
		if (registeredUsers.get(i).ID.equals(u.ID)) {
			
			return true;
		}
	}
	
	//	JOptionPane.showInternalMessageDialog(null, "This user is not registered before in the touristSystem", "Error", JOptionPane.ERROR_MESSAGE);
		return false;
	
}

public boolean register(Trip b,User u) {
	
	boolean f=checkUser(u);
	if(f) {
		f=lateTripps(u, 21);
		if(f==false) {
			if(u.countFine(getFine())!=0) {
			//	JOptionPane.showInternalMessageDialog(null, "Cant register trip,you have fines", "Error", JOptionPane.ERROR_MESSAGE);
				return false;
				}
	    	f=u.register(b, trips,registered);
			return f;
		}
		else return false;
	}
	
	else {	
		return f;
	}
}



public boolean lateTripps(User u,int day) {
	LocalDate today=date.getDate();
	Duration diff;
	long difference;
	ArrayList<Trip>x=new ArrayList<Trip>();
	if(registered.containsKey(u.ID)) {
		x=registered.get(u.ID);
		for(int i=0;i<x.size();i++) {
	diff=Duration.between( x.get(i).registeringDate.atStartOfDay(),today.atStartOfDay());	

	difference=diff.toDays();
			
			if(difference ==day || difference > day) {
				u.lateTrips++;
				return true;
			}
		}
	}
	
	return false;
	
}

public void unregister(Admin a,User u) {
a.unregisterUser(u, registeredUsers, registered);
	
}
}


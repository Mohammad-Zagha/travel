package software;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
	
	String IdforUser;
	String NameUser;
	String email;
	String address;
	String PostalCode;
	String city;
	int lateTrips;
	final Logger logger = Logger.getLogger(User.class.getName());
	
	
	public User() {
		 
	}
	
	public User(String id,String name,String e,String add,String postal,String c) {
		IdforUser=id;
		NameUser=name;
		email=e;
		address=add;
		PostalCode=postal;
		city=c;
		lateTrips=0;
	}
	
	
	public class DateServer {

		public LocalDate getDate() {
			return LocalDate.now();  
			
		}
		
			
	} 
	
	public boolean register(Trip t,List<Trip> trips,Map<String, ArrayList<Trip>> registered) {
		
		boolean TripSys=false;
		DateServer d=new  DateServer();
		Trip xx;
		
			for(int i=0;i<trips.size();i++) {
				xx=trips.get(i);
       			if(t.tripID.equals(xx.tripID)==true) {
				TripSys=true;
				break;
			}
			}
			if(TripSys==false) {
				return false;
			}
			else {
				if(t.registered==true) {
					return false;
				}
				else {
					ArrayList<Trip>tt=new ArrayList<Trip>();
					if(registered.containsKey(this.IdforUser)==false) {
						tt.add(t);
						registered.put(this.IdforUser, tt);
						t.registered=true;
						t.registeringDate=d.getDate();

						return true;
					}
					else {
						tt=registered.get(this.IdforUser);
						if(tt.size()==5) {
							return false;
						}
						else {
						tt.add(t);
						registered.put(this.IdforUser, tt);
						t.registered=true;
						t.registeringDate=d.getDate();
						return true;
					}
					
				}
					
			}
			
		}
		
	
	}
	
	
	public String returnTrip(Trip b,MyTrips l){
		ArrayList<Trip>w ;
		boolean f=false;
		for(int i=0;i<l.registeredUsers.size();i++) {
			
			if(this.IdforUser.equals(l.registeredUsers.get(i).IdforUser)) {
				f=true;
				if(l.registered.containsKey(this.IdforUser)) {
					w=l.registered.get(this.IdforUser);
					for(int j=0;j<w.size();j++) {
						if(b.tripID.equals(w.get(j).tripID)) {
							w.remove(i);
							b.registered=false;
							l.registered.put(this.IdforUser, w);
							return " user returned the trip successfully";
						}
						
					}
					
				}
				return "this trip is not registered by you";
			}
		}
		if(!f) {
		return "this user is not registered";
		}
		else
			return " " ;
	
		}
	
	public int countFine(int x) {
		return lateTrips*x;
		
	}
	}



	




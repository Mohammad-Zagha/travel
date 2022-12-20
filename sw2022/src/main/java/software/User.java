package software;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
	
	String UserId;
	String name_user;
	String email;
	String address;
	String postalCode;
	String city;
	int lateTrips;
	final Logger logger = Logger.getLogger(User.class.getName());
	
	
	public User() {
		 
	}
	
	public User(String id,String name,String e,String add,String postal,String c) {
		UserId=id;
		name_user=name;
		email=e;
		address=add;
		postalCode=postal;
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
       			if(t.tripID.equals(xx.tripID)) {
				TripSys=true;
				break;
			}
			}
			if(!TripSys) {
				return false;
			}
			else {
				if(t.registered) {
					return false;
				}
				else {
					ArrayList<Trip>tt=new ArrayList<>();
					if(!registered.containsKey(this.UserId)) {
						tt.add(t);
						registered.put(this.UserId, tt);
						t.registered=true;
						t.registeringDate=d.getDate();

						return true;
					}
					else {
						tt=registered.get(this.UserId);
						if(tt.size()==5) {
							return false;
						}
						else {
						tt.add(t);
						registered.put(this.UserId, tt);
						t.registered=true;
						t.registeringDate=d.getDate();
						return true;
					}
					
				}
					
			}
			
		}
		
	
	}
	
	
	public String returnTrip(Trip b, MyTrips l) {
	    ArrayList<Trip> w;
	    for (int i = 0; i < MyTrips.registeredUsers.size(); i++) {
	        if (this.UserId.equals(MyTrips.registeredUsers.get(i).UserId)) {
	            if (MyTrips.registered.containsKey(this.UserId)) {
	                w = MyTrips.registered.get(this.UserId);
	                for (int j = 0; j < w.size(); j++) {
	                    if (b.tripID.equals(w.get(j).tripID)) {
	                        w.remove(i);
	                        b.registered = false;
	                        MyTrips.registered.put(this.UserId, w);
	                        return "user returned the trip successfully";
	                    }
	                }
	                return "this trip is not registered by you";
	            }
	            else return "";
	        }
	    }
	    return "this user is not registered";
	}
	
	public int countFine(int x) {
		return lateTrips*x;
		
	}
	}



	




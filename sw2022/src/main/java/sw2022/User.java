package sw2022;
import io.cucumber.java.it.Date;
import java.util.Calendar;
import java.util.Hashtable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import testing.book;

public class User {
	String ID;
	String Name;
	String email;
	String address;
	String postal_code;
	String city;
	int lateTrips;
	
	
	public User() {
		System.out.println();
	}
	
	public User(String id,String name,String e,String add,String postal,String c) {
		ID=id;
		Name=name;
		email=e;
		address=add;
		postal_code=postal;
		city=c;
		lateTrips=0;
	}
	
	
	public class DateServer {

		public LocalDate getDate() {
			LocalDate today =  LocalDate.now();  
			return today;
		}
		
			
	} 
	
	public boolean register(Trip t,ArrayList<Trip> trips,Hashtable<String, ArrayList<Trip>> table) {
		//myLibrary Tt=new myLibrary();
		boolean User=false;
		boolean Trip=false;
		DateServer d=new  DateServer();
		Trip xx;
		
			for(int i=0;i<trips.size();i++) {
				xx=trips.get(i);
       			if(t.tripID.equals(xx.tripID)==true) {
				Trip=true;
				break;
			}
			}
			if(Trip==false) {
			//	JOptionPane.showInternalMessageDialog(null, "This trip is not available in the touristSystem", "Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			else {
				if(t.registered==true) {
				//	JOptionPane.showInternalMessageDialog(null, "you cant register this trip because it is fullRegistered", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				else {
					ArrayList<Trip>tt=new ArrayList<Trip>();
					if(table.containsKey(this.ID)==false) {
						tt.add(t);
						table.put(this.ID, tt);
						t.registered=true;
						t.registeringDate=d.getDate();
						JOptionPane.showInternalMessageDialog(null, "user registered the trip successfully", "success", JOptionPane.INFORMATION_MESSAGE);

						return true;
					}
					else {
						tt=table.get(this.ID);
						if(tt.size()==5) {
					//		JOptionPane.showInternalMessageDialog(null, "Sorry, this user registered 5 trips the maximum allowed number", "Error", JOptionPane.ERROR_MESSAGE);
							return false;
						}
						else {
						tt.add(t);
						table.put(this.ID, tt);
						t.registered=true;
						t.registeringDate=d.getDate();
						JOptionPane.showInternalMessageDialog(null, "user registered the trip successfully", "success", JOptionPane.INFORMATION_MESSAGE);
						return true;
					}
					
				}
					
			}
			
		}
		//return user;
		
	
	}
	
	
	public String returnTrip(Trip b,MyTrips l){
		ArrayList<Trip>w ;
		boolean f=false;
		for(int i=0;i<l.registeredUsers.size();i++) {
			
			if(this.ID.equals(l.registeredUsers.get(i).ID)) {
				f=true;
				if(l.registered.containsKey(this.ID)) {
					w=l.registered.get(this.ID);
					for(int j=0;j<w.size();j++) {
						if(b.tripID.equals(w.get(j).tripID)) {
							w.remove(i);
							b.registered=false;
							l.registered.put(this.ID, w);
					//		JOptionPane.showInternalMessageDialog(null, "user returned the trip successfully", "success", JOptionPane.INFORMATION_MESSAGE);
							return " user returned the trip successfully";
						}
						
					}
					
				}
				return "this trip is not registered by you";
			}
		}
		if(f==false) {
		return "this user is not registered";
		}
		else
			return " " ;
	
		
		}
	
	public int countFine(int x) {
		int fine=lateTrips*x;
		return fine;
	}
	}



	




package sw2022;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import sw2022.Trip;



public class Admin {

	boolean logState;
	String password;
	
	
	public Admin() {
		password="adminadmin";
		logState=false;
	}
	
	public void setLogState(boolean b) {
		logState=b;
	}

	
	public boolean login(String pass) {

		if(logState) {
			System.out.println("you are already logged in");
			return false;
		}
		else {
			if(this.password.equals(pass)) {
				System.out.println("successfull log in");
				logState=true;
				return true;
		
			}
			else {
				System.out.println("wrong password");
				return false;
			}
		}
	}

	public boolean getLogState() {
	
		return logState;
	}

	public void logout() {

			logState=false;
		
		}
		
	
	
	

	public String register(User u,MyTrips l) {
		if(logState==false)
		{
			return "Admin login is required";
		}
		
			for(int i=0;i<MyTrips.registeredUsers.size();i++) {
				if(u.ID.equals(MyTrips.registeredUsers.get(i).ID)) {

					return "user is alreay registered";
				}
			}
			MyTrips.registeredUsers.add(u);

			return "user registered succefully";
		}
		
	
	

	
	public void unregisterUser(User u,ArrayList<User>users,HashMap<String, ArrayList<Trip>>bb ) {
		
			if(bb.containsKey(u.ID)) {
				System.out.print("can't remove this user,he has registered Trip");
				
				return ;
			}
			else if(u.countFine(30)!=0) {
				System.err.print("can't remove this user,he has unpaid fines");
			}
			else {
				for(int i=0;i<users.size();i++) {
					if(u.ID.equals(users.get(i).ID)) {
						users.remove(i);

					}
				}
			}
		}

}

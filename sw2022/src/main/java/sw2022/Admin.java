package sw2022;




import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Admin {

	boolean logState;
	String password;
	
	
	public Admin() {
		password="adminadmin";
		logState=false;
	}
	
	public void setLogState(boolean b) {
		// TODO Auto-generated method stub
		logState=b;
	}

	
	public boolean login(String pass) {
		// TODO Auto-generated method stub
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
		if(logState) {
			//System.out.println("you are logged in now ");
		}
		//else
			//System.out.println("you are not logged in ");
		return logState;
	}

	public void logout() {
		// TODO Auto-generated method stub
		if(logState ==false ) {
		//	System.out.println("you are not logged in, you should log in first to log out ");
		}
		else {
			logState=false;
			//System.out.println("log out successfull");

		}
		
	}
	
	

	public String register(User u,MyTrips l) {
		
		if(logState==false) {
			
			JOptionPane.showInternalMessageDialog(null, "Admin login is required", "Error", JOptionPane.ERROR_MESSAGE);
			return "Admin login is required";
		}
		else {
			for(int i=0;i<l.registeredUsers.size();i++) {
				if(u.ID.equals(l.registeredUsers.get(i).ID)) {
					JOptionPane.showInternalMessageDialog(null, "user is alreay registered", "Error", JOptionPane.ERROR_MESSAGE);

					return "user is alreay registered";
				}
			}
			l.registeredUsers.add(u);
			JOptionPane.showInternalMessageDialog(null, "user registered succefully", "success", JOptionPane.INFORMATION_MESSAGE);

			return "user registered succefully";
		}
		
	}
	
	public void sendEmail(String email,String subject,String body) {
		
   }
	
	public void unregisterUser(User u,ArrayList<User>users,Hashtable<String, ArrayList<Trip>>bb ) {
		if(logState==true) {
			if(bb.containsKey(u.ID)) {
				JOptionPane.showInternalMessageDialog(null, "can't remove this user,he has registered Trip", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			else if(u.countFine(30)!=0) {
				JOptionPane.showInternalMessageDialog(null, "can't remove this user,he has unpaid fines", "Error", JOptionPane.ERROR_MESSAGE);

			}
			else {
				for(int i=0;i<users.size();i++) {
					if(u.ID.equals(users.get(i).ID)) {
						users.remove(i);
						JOptionPane.showInternalMessageDialog(null, "user unregistered succefully", "success", JOptionPane.INFORMATION_MESSAGE);

					}
				}
			}
		}
		else
			JOptionPane.showInternalMessageDialog(null, "admin login required", "Error", JOptionPane.ERROR_MESSAGE);

		
	}
	

}

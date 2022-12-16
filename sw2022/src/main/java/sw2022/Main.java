package sw2022;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		MyTrips l=new MyTrips();
		
		
//		
//		| 1234567 | Rosol | rosol@gmail.com |Rr street|H3H2T5|Nablus|
//		| 1478523 | Mohammd | mohammd@gmail.com |Mz|S3S1T5|Nablus|
//		| 1236547 | Amer | amer@gmail.com |Az street|Y3Y1T5|Nablus|
		
		
		User test=new User("1234567", "Rosol", "rosol@gmail.com", "Rr street", "H3H2T5", "Nablus");
		l.registeredUsers.add(test);
		test=new User("1478523", "Mohammd", "mohammd@gmail.com", "Mz", "S3S1T5", "Nablus");
		l.registeredUsers.add(test);
		
		
//		| Palestine | Casablanka |T1 |
//		| Chicago | Heathrow |T2 |
		
		Trip test2=new Trip("Palestine", "Casablanka", "T1" );
		l.trips.add(test2);
		test2=new Trip("Chicago", "Heathrow","T2" );
		l.trips.add(test2);
		User u=new User();
		Trip b=new Trip();
		Admin admin=new Admin();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
		while(true) {
			System.out.print("Please choose are you? "+"\n");
			System.out.print("1- User"+"\n");
			System.out.print("2- Admin "+"\n");
			System.out.print("3- Exit "+"\n");
			Scanner choice = new Scanner(System.in);
      		int a = choice.nextInt();
      		if(a==2) {
    			System.out.print("Please Enter the password:"+"\n");
    			String pass;
    			pass=choice.next();
    			if(admin.login(pass)) {
    				inter:while(true) {
    					
    		 	        System.out.print("1- Register user "+"\n");
    		 	        System.out.print("2- Search for a trip "+"\n");
    		 	        System.out.print("3- Add a trip "+"\n");
    		 	        System.out.print("4- Unregister user "+"\n");
    		 	        System.out.print("5- print all registered user "+"\n");
    		 	        System.out.print("6- print all trips in the touristSystem "+"\n");
    		 	        System.out.print("7- Back to main menue "+"\n");
    		 	       
    		 	        int aa;
    		 	        aa=choice.nextInt();
    		 	        
    		 	        switch(aa) {
    		 	        
    		 	        case 1:
    		 	        	System.out.print("please enter the user ID, name, email, address,postal code and city respectively and seperated by space:\n");
    		 	        	try {
    		 	        	String s=obj.readLine();
    		 	        	String ss[]=s.split(" ");
    		 	        	u=new User(ss[0],ss[1],ss[2],ss[3],ss[4],ss[5]);
    		 	        	System.out.println(admin.register(u, l));
    	
    		 	         }catch(Exception e) {
    		 	        	 e.printStackTrace();
    		 	         }
    		 	        	break;
    		 	        	
    		 	        case 2:
    		 	        	System.out.println("enter the string to search by:\n");
    		 	        	String st=choice.next();
    		 	        	ArrayList<Trip>bb;
    		 	        	bb=l.tripIDSearch(st);
    		 	        	if(bb.size()==0) {
    		 	        		System.out.println("no trips were found");
    		 	        	}
    		 	        	else {
    		 	        		//destination,airportNOW or tripID
    		 	        		System.out.println("these trips are found:");
	    		 	        	for(int i=0; i<bb.size();i++) {
	    		 	        		System.out.println("destination="+bb.get(i).destination+" airportNOW="+bb.get(i).airportNOW+" tripID="+bb.get(i).tripID);
	    		 	        	}
    		 	        	}
    		 	       
    		 	        break;
    		 	        
    		 	        case 3:
    		 	        	System.out.println("please enter trip destination,name of the airport you want to leave from and trip number respectively and seperated by space:\n");
    		 	        	try {
    		 	        		String Trip=obj.readLine();
    		 	        		String arrTrip[]=Trip.split(" ");
    		 	        		b=new Trip(arrTrip[0],arrTrip[1],arrTrip[2]);
    		 	        		l.add(b, admin);
    		 	        		
    		 	        	}catch(Exception e) {
    		 	        		e.printStackTrace();
    		 	        	}
    		 	        	
    		 	        	break;
    		 	        	
    		 	        case 4:
    		 	        	System.out.println("enter the user id:\n");
    		 	        	String id=choice.next();
    		 	        	u=new User(id,"","","","","");
    		 	        	if(l.checkUser(u)) {
	    		 	        	for(int i=0;i<l.registeredUsers.size();i++) {
	    		 	        		if(l.registeredUsers.get(i).ID.equals(id))
	    		 	        			u=l.registeredUsers.get(i);
	    		 	        	}
	    		 	        	l.unregister(admin, u);
    		 	        	}else System.out.println("This user is not registered before in the TouristSystem");
    		 	        		
    		 	        	l.unregister(admin, u);
    		 	        	break;
    		 	        	
    		 	        case 5:
    		 	        	for(int i=0;i<l.registeredUsers.size();i++) {
    		 	        		System.out.println(l.registeredUsers.get(i).ID+" "+l.registeredUsers.get(i).Name+" "+l.registeredUsers.get(i).email+" "+
    		 	        				l.registeredUsers.get(i).address+" "+l.registeredUsers.get(i).postal_code+" "+l.registeredUsers.get(i).city+" ");
    		 	        	}
    		 	        	
    		 	        	break;
    		 	        	
    		 	        case 6:
    		 	        	for(int i=0;i<l.trips.size();i++){
    		 	        		System.out.println("destination="+l.trips.get(i).destination+" airportNow="+l.trips.get(i).airportNOW+" code="+l.trips.get(i).tripID);
    		 	        	}
    		 	        	break;
    		 	        	
    		 	       case 7:
    		 	    	   admin.setLogState(false);
   		 	        	break inter;
   		 	        	
    		 	        }
    				}
    			}
      		}else if(a==1) {
      			Scanner choice2 = new Scanner(System.in);
      			 System.out.print("Enter your ID"+"\n");
      			 String id=choice2.next();
      			 u=new User(id,"","","","","");
      			 if(l.checkUser(u)) {
      				 for(int i=0;i<l.registeredUsers.size();i++) {
      					 if(l.registeredUsers.get(i).ID.equals(id))
      						 u=l.registeredUsers.get(i);
      				 }
      				 
      				 label:while(true) {
		      				 System.out.print("please choose a number:"+"\n");
		      				 System.out.print("1- Register a TRip "+"\n");
		         	         System.out.print("2- Return a Trip "+"\n");
		         	         System.out.print("3- Search for a Trip "+"\n");
		         	        System.out.print("4- show me all  trips i have registered for "+"\n");
		         	        System.out.print("5- Back to main menue "+"\n");
		         	        
		    	      		 int x = choice2.nextInt();
		    		    switch (x) {
		    		    case 1:
		    		    	boolean r=false;
		    		    	System.out.print("enter the tripID :\n");
		    		    	String code=choice2.next();
		    		    	for(int i=0;i<l.trips.size();i++) {
		    		    		if(l.trips.get(i).tripID.equals(code)) {
		    		    			r=true;
		    		    			b=l.trips.get(i);
		    		    		}	
		    		    	}
		    		    	if(r==false)
		    		    		b=new Trip("","",code);
		    		    	
		    		        l.register(b, u);
		    		        
		    		        break;
		    		        
		    		    case 2:
		    		    	System.out.print("enter the trip number:\n");
		    		    	String codd=choice2.next();
		    		    	b=new Trip("","",codd);
		    		    	u.returnTrip(b, l);
		    		    	
		    		    	break;
		    		    	
		    		    case 3:
		    		    	System.out.println("enter the string to search by:\n");
			 	        	String st=choice.next();
			 	        	ArrayList<Trip>bb;
			 	        	bb=l.tripIDSearch(st);
			 	        	if(bb.size()==0) {
			 	        		System.out.println("no trips were found");
			 	        	}
			 	        	else {
			 	        		System.out.println("these trips has been found:");
				 	        	for(int i=0; i<bb.size();i++) {
				 	        		System.out.println("destination="+bb.get(i).destination+" airportNOW="+bb.get(i).airportNOW+" tripID="+bb.get(i).tripID);
				 	        	}
			 	        	}
			 	        	
			 	        	break;
			 	        	
		    		    case 4:
		    		    	ArrayList<Trip>z=new ArrayList<Trip>();
		    		    	boolean f=l.registered.containsKey(u.ID);
		    		    	if(f==false)
		    		    		System.out.println("you dont have any registered trip yet :)");
		    		    	else {
		    		    		z=l.registered.get(u.ID);
			    		    	for(int i=0;i<z.size();i++) {
			    		    		System.out.println("destination="+z.get(i).destination+" airportNOW="+z.get(i).airportNOW+" tripID="+z.get(i).tripID);
			    		    	}
		    		    	}
		    		    	break;
			 	        	
		    		    case 5:
		    		    	break label;
		    		    }// had la switch 
      				 }//while
      			 }//user
      			 else
      				System.out.print("you are not part of our touristSystem yet please register "+"\n");
      			 
      			
      		}
      		else if(a==3) {
      			java.lang.System.exit(0);
      		}
      		else {
    			System.out.print("Invalid input please try again"+"\n");
    				
      		}
 			
		}
	}

}


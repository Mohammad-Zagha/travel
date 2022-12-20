package software;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import software.Admin;
import software.MyTrips;
import software.Trip;
import software.User;

public class UnRegisteredUserSteps {

	
		// TODO Auto-generated constructor stub
		User u;
		MyTrips Tt;
		Admin a;
	
	
	public UnRegisteredUserSteps(MyTrips Ttt,Admin aa) {
		// TODO Auto-generated constructor stub
		Tt=Ttt;
		a=aa;
	}

	
	@Given("a user with ID {string} , name {string} , email {string} , address {string} ,postal code {string} , and city {string} id registered in the touristSystem")
	public void a_user_with_id_name_email_address_postal_code_and_city_id_registered_in_the_tourist_system(String id, String name, String email, String address, String code, String city) {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new io.cucumber.java.PendingException();
		u=new User(id,name,email,address,code,city);
		Tt.registeredUsers.add(u);
		
	}

	@Given("admin is logged in")
	public void admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		a.setLogState(true);
	}

	@When("try to unregister the user")
	public void try_to_unregister_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Tt.unregister(a,u);
	}

	@Then("the user is out of the touristSystem")
	public void the_user_is_out_of_the_tourist_system() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(Tt.checkUser(u));
		// throw new io.cucumber.java.PendingException();
	}

	
	
//	@Given("a user with ID {string} , name {string} , email {string} , address {string} ,postal tripID {string} , and city \"Nablus\"id registered in the library")
//	public void a_user_with_id_name_email_address_postal_trip_id_and_city_nablus_id_registered_in_the_library(String string, String string2, String string3, String string4, String string5) {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//	}

	
	
	@Given("user has registered trip")
	public void user_has_registered_trip() {
	    // Write code here that turns the phrase above into concrete actions
		Trip b=new Trip();
		   ArrayList<Trip>trips=new ArrayList<Trip>();
		   Tt.registered.put(u.UserId, trips);
		
		// throw new io.cucumber.java.PendingException();
	}

	@Then("the user sould still in the touristSystem")
	public void the_user_sould_still_in_the_tourist_system() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		 assertTrue(Tt.checkUser(u));
		 }



	@Given("user has fine unpaid")
	public void user_has_fine_unpaid() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		  u.lateTrips++;
		    u.countFine(30);
		    }
	
}

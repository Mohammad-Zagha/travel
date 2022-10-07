package sw2022;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class login {
	User user;
	String username;
	String password;
	public login()
	{
		 user= new User("test123","usertest");
	}
	

	@Given("that the User is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    user.Logout();
	  
	}



	@Given("the password is {string} the username is {string}")
	public void thePasswordIsTheUsernameIs(String string, String string2) {
		this.password="usertest";
		this.username="test123";
	}


	@Then("the user login succeeds")
	public void theUserLoginSucceeds() {
		assertEquals( user.LoggedIn(username,password) , true );
	}
	@Then("the user is logged in")
	public void theUserIsLoggedIn() {
		assertEquals(user.LogInStatus,true);
		
	}




	@Given("that the user is not logged in")
	public void thatTheuserIsNotLoggedIn() {
		   user.Logout();
	}




	@Given("the password is {string} and\\/or username is {string}")
	public void thePasswordIsAndOrUsernameIs(String string, String string2) {
		this.password="test";
		this.username="user";
	}
	@Then("the user login fails")
	public void theUserLoginFails() {
		assertEquals( user.LoggedIn(username,password) , false );
		
	}
	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
		assertEquals(user.LogInStatus,false);
	}







}
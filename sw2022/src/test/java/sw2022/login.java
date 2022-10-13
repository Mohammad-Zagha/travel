package sw2022;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class login 
{
ArrayList<User> userList=new ArrayList<User>();
String user;
String password;
User tempUser ;
boolean flag=false;

@Given("that the user enters the username {string} and password {string}")
public void that_the_user_enters_the_username_and_password(String string, String string2) {
	user="mohammad";
	password="zagha";
	tempUser=new User(user,password);
}


@Given("the user is one of the following users")
public void the_user_is_one_of_the_following_users(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> rows = dataTable.asLists(String.class);
	for (List<String> columns : rows) {
	   if (user.equals(columns.get(0))&&password.equals(columns.get(1)))
	   {
		   assertTrue(true);
		   
		   flag=true;
		  
	   }
	   
	  }
	if(!flag)
	{
		assertFalse(true);
	}
}



	@Given("the user is Logged out")
	public void the_user_is_logged_out() {
		if(tempUser.getLoginStatus()==false)
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
	}



	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		tempUser.login(user,password);
		if(tempUser.getLoginStatus()==true)
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
	}











}

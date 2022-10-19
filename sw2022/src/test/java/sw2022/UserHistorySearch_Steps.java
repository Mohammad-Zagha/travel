package sw2022;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserHistorySearch_Steps {
ArrayList<User> UserList=new ArrayList<>();
Admin admin=new Admin("test");
Trip Amman=new Trip("Amman","","");
Trip Turky=new Trip("turky","","");
User user=new User("test","test");

Scanner sc=new Scanner(System.in);
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		admin.login("test");

	}
	@Given("that the user has the trips amman and turky in")
	public void that_the_user_has_the_trips_amman_and_turky_in() {
		user.UserTrips.add(Amman);
		user.UserTrips.add(Turky);
		UserList.add(user);
	}
	@Given("these users are contained")
	public void these_users_are_contained(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> columns : rows) 
		{
			User tempUser=new User(columns.get(0),columns.get(1));
			UserList.add(tempUser);
			
		}
	
		
	
	}
	

	@When("the Admin searches for the user {string}")
	public void the_admin_searches_for_the_user(String string) {
		System.out.print("Inter User Name: ");
		String temp=sc.next();
		 user=Controlls.isUser(temp,UserList);
		if(user !=null)
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
		
	}
	@Then("the Trips with the name {string} and {string} is found")
	public void the_trips_with_the_name_and_is_found(String string, String string2) {
	ArrayList<String> temp=Controlls.getTripNames(user, admin);
	if(temp.contains("turky") && temp.contains("Amman"))
	{
		assertTrue(true);
	}
	else
	{
		assertFalse(true);
	}
	}








}

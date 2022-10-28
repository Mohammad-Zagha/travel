package sw2022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_trips_steps {
ArrayList<Trip> list=new ArrayList<>();
User user=new User("test","test");
ArrayList<String> tempList;
	@Given("these Trips are contained in the System")
	public void these_trips_are_contained_in_the_system(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> columns : rows) 
		{
			Trip temp=new Trip(columns.get(0),columns.get(1),columns.get(2));
			list.add(temp);
		}

	}
	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
		user.login("test", "test");
	}
	@When("the user searches trips with keyword {string}")
	public void the_user_searches_trips_with_keyword(String string) {
		tempList=Controlls.search("all", list);
		
	}
	@Then("all Trips are displayd")
	public void all_trips_are_displayd() {
		if(tempList.size()!=0) //assuming there are for sure trips in the System
		{
			assertTrue(true);
		}
		else
		{
			assertFalse(true);
		}
	}


	@When("the user searches for trips useing the keyword {string} and inters the trip name {string}")
	public void the_user_searches_for_trips_yeasing_the_keyword_and_inters_the_trip_name(String string, String string2) {
		
		tempList=Controlls.search("Name", list);
		
		
	}
	@Then("the Trip or trips with name {string} are found")
	public void the_trip_or_trips_with_name_are_found(String string) {
		String FirstWord;
	
		for(int i=0;i<tempList.size();i++)
		{
			FirstWord=tempList.get(i).split(" ")[0]; // take First Word of all Trips (Trip name)
			System.out.print(FirstWord);
			if(!FirstWord.equals("Aqaba")){
				
				assertFalse(true);
				break;
			}
		}
		
		assertTrue(true);
	}





}

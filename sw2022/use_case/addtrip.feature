Feature: add trip by Admin
  admin want to add a trip to his trip website

Scenario: trip will be added successfully
 	Given that the Admin is logged in
 	And there is a trip with country "Maldive", airport "Malta", and id_trip "C20"
 	When the trip is added to the trip website
 	Then the trip with  country "Maldive", airport "Malta", and id_trip "C20"  added to trip website
 	
Scenario: Add a trip when the Admin is not logged in
	Given that the Admin is not logged in
 	And there is a trip with country "DC", airport "Washington", and id_trip "C33"
	When the trip is added to the trip website
	Then the error message "Admin login required" is given
	


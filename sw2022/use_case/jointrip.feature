Feature: User join a trip
  

Scenario: the user will join the trip successfully
 	Given that the User is logged in
 	And choose a trip with country "spain" , airport "qatar" , and TripCource "some Cource"
 	When the trip is added to the UsertripList
 	#Then the trip with  country "spain" , airport "qatar" , and and TripCource "some Cource" should show up
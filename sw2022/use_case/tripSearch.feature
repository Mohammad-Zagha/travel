Feature: Searching for Trips based on Nothing and based on Name 

Background: The System has a set of Trips 
	Given that the admin is logged in 
	And these Trips are contained in the System 
		| Aqaba | Queen Alia International Airport |Aqaba - wadiRam-.. |
		| Turky | Queen Alia International Airport |istanbul - Water park -... |
		
Scenario: Searching for trips
	Given that the user is logged in 
	When the user searches trips with keyword "all"
	Then all Trips are displayd
	
Scenario: Searching for a trip by the Name 
	When the user searches for trips useing the keyword "Name" and inters the trip name "Aqaba" 
	Then the Trip or trips with name "Aqaba" are found 
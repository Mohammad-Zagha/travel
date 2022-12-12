Feature: Available Dates:
  

  
  Scenario: searching for date successfuly
    Given that user enter the date of journey in dd-mm-yyyy format :
    And user is loged in to the system
    When user enters the date
    Then the flight with the date will appear 
    
    
    Scenario: searching for date unsuccessfuly
    Given that user enter the date of journey in different date format :
    And user is loged in to the system
    When user enters the date
    Then error messege "please,choose a date from the available dates in (dd-mm-yyyy) format :" 
   
    #
    #	| Palestine | Casablanka |T1 |
#		| Chicago | Heathrow |T2 |
#		| Istanbul | Jordan | T3 |
#		| Maldive | Cairo | T4 |
 

    Examples:                       
      | November 2017  | Mon     |Tue    |Wed    |Thu      |Fri     |Sat |Sun | 
      | days           | 24      |  25   |26     |27       |28      |29  |30  |
      |flights         |Palestine|Maldive|Chicago|         |Istanbul|    |    |
      

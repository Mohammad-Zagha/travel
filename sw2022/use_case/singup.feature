Feature: Register user

Background: The website has registered users 
	Given these usere are registered in the website 
|rosol   | tuhul  | rosol@gmail.com | 00 |
|mohammad | zagha | mohammad@gmail.com | 11 |
|amer     | zagha| amer@gmail.com | 22	 |
	

Scenario: user is already registered
Given that the admin is logged in
And there is a user with username "rosol" , password "tuhul" , email "rosol@gmail.com" , phoneNumber "00"
When user tries to register  
Then an error massage "user is alreay registered" should display

Scenario: user not registered before
Given there is a user with username "aseel" , password "zagha" , email "aseel@gmail.com" , phoneNumber "33"
When user tries to register 
Then an information message "user registered succefully" should displayed
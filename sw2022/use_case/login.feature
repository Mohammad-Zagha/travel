Feature: User Registration
Scenario: User registratioin with differnet data

Given User is on registration page

When User enters following user details
| rosol | tuhul | rosol@gmail.com |999 | Nablus |
| mohammad | zagha | mhm@gmail.com |939 | Nablus |
| amer | zagha | amer@gmail.com |959 | Nablus |


Then user registration should be successful



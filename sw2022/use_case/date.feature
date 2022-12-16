Feature: Available Dates

Scenario: Searching for date successfully
  Given the user has entered a date in the dd-mm-yyyy format
  And the date is listed in the available dates table
  When the user searches for the date
  Then the flight for that date should be displayed

Scenario: Searching for date unsuccessfully
  Given the user has entered a date in a different format
  When the user searches for the date
  Then an error message should be displayed, stating that the date must be in the dd-mm-yyyy format and must be one of the available dates

Examples:
  | Date       | Day | Flights     |
  | 24-11-2017 | Mon | Palestine   |
  | 25-11-2017 | Tue | Maldive     |
  | 26-11-2017 | Wed | Chicago     |
  | 27-11-2017 | Thu |             |
  | 28-11-2017 | Fri | Istanbul    |
  | 29-11-2017 | Sat |             |
  | 30-11-2017 | Sun |             |

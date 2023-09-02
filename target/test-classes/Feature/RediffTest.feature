Feature: validate Login Functionality for Rediff Application
Scenario Outline: Check the search functionality for valid data
Given user is on the home page of Rediff
When User enter keyword
|Manipur|
|Modi|
And User clicks on search btn
Then Search should be successful  

#Examples:
#|keyword|
#|Latest news|
#|News|
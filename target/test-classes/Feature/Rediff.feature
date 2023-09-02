@login
Feature: create account functionality
Background:
Given user should be on homepage
 
@log1
  Scenario: validate create account form
  #Given user should be on homepage
    When user should click create account link
    And user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1
    #|Gauri Tupe|gauri@gmail.com|gauri123|gauri123|gauri123@gmail.com|
    And click on create my account button
    Then The message box should display
    
    
#@log2
  #Scenario: validate create account form
  #Given user should be on homepage
    #When user should click create account link
    #And user enters invalid keyword,redmail1,pass1,conpass1,altmail1,mobno1
    #|Gauri Tupe|gauri@gmail.com|gauri123|gauri123|gauri123@gmail.com|9096692860|
    #And click on create my account button
    #Then The error should display


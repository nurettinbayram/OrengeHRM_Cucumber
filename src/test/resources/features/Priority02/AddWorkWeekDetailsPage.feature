

Feature: Add Work Week Details Page
	
  	
  	@AddWorkWeek @regression
	Scenario: As an admin I should be able to edit work week details.
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on WORK WEEK link
  	And Fill out WORK WEEK inputs 
  	And Click save button WORK WEEK
  	Then Admin able to see pup up Successfully Saved message 
  	
  	
 
  	
  	
  	
  	
  	
  	
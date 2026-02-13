

Feature: Add Immigration Details Page
	
	Background:
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on Immigration link
  	And Click on PLUS Immigration button right corner
  	
  	@AddImmigration @regression
	Scenario: As an admin I should be able to add an employee Immigration details
  	And Fill out Immigration inputs 
  	And Click save button Add Social Media
  	Then Admin able to see pup up Successfully Saved message 
  	
  	
  	
  	
  	
  	
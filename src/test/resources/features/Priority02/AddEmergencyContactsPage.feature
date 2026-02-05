

Feature: Add Emergency Contacts Page
	
	Background:
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on EMERGRCY CONTACTS link
  	
  	
  
  	
  	@AddEmergencyContact @regression
	Scenario: As an admin I should be able to add an employee Emergency Contact details
  	And Click plus button on right corner 
  	And Fill Add Emergency Contact form inputs
  	Then Click Add Emergency Contact button
  	And User should be able to see success message
  	
  	
  	
  	
  	
  	
  	
  	
  	
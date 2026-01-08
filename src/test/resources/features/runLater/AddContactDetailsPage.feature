# Author: Neotech Academy

Feature: Add Employee Contact Details
	

	
	@AddContactDetails @regression
  	Scenario: As an admin I should be able to change an employee contact details
  	Given Login with Admin credential
  	And Navigate to PIM and Employee List page
  	And User should be see list of employees
  	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on CONTACT DETAILS option
  	And Admin should be see contact details page
  	And Admin should fill out contact details 
  	And Admin should click save button in contact details page
  	Then Admin should able to see Successfully Updated pup up message
  	

	 		
	 		
	 		
	 		
	 		
	 		
	
@regression 
Feature: Add Personal Details Page
	
	
	@addPersonalDetail 
	Scenario:  The admin user should be able to add personal details
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
	And Click seach button
	And Should see employee in filter list
	When Click on employee name
	And Fill out personal page inputs and click save button
	Then shown pup up with Successfully Saved message 
	
	
	
	
	
	
	
	
	
	
	
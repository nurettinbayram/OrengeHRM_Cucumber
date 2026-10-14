@addEmployeefunctionality @regression @smoke
Feature: Add Employee functionality

	Background: 
	Given Login with Admin credential
	When Navigate to PIM and Add Employee page
	
	
	@addEmployee
	Scenario: Add New Employee Validation
	And Fill inputs 
	And Click Save button 
	Then Validate employee
	
	
	Scenario: Verification of cancel button
	Then Click Cancel button should close the pop up 
	
	
	Scenario: Verification of empty input
	When Leave empty fistname
	Then check error message
	
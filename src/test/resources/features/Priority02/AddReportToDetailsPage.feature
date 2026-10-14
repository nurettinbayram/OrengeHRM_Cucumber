
@regression
Feature: Add Report-To Details Page

	Background:
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on Report-to link
  	And Mause hover over plus icon
	
  	
  	@AddReportTo 
	Scenario: As an admin I should be able to edit work week details.
  	And Click Supervisor Icon
	And Fill inputs on Supervisur
  	And Click save button on Supervisor pop up
  	Then Admin able to see pup up Successfully Saved message 
  	
  	@AddReportTo 
	Scenario: As an admin I should be able to edit work week details.
  	And Click Subordinate Icon
	And Fill inputs on Subordinate
  	And Click save button on Supervisor pop up
  	Then Admin able to see pup up Successfully Saved message 
  	
  	
 
  	
  	
  	
  	
  	
  	
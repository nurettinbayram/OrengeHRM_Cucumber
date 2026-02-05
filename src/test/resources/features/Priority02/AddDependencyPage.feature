

Feature: Add Dependency Page
	
	Background:
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on DEPENDENS link
  	
  	
  
  	@AddDependencyPage @regression
	Scenario: As an admin I should be able to add an employee Dependency  details
  	And On Dependency Click plus button on right corner 
  	And Fill Dependency Contact form inputs
  	Then Click Add Dependency button
  	And User should be able to see success message
  	
  	
  	
  	
  	
  	
  	
  	
  	
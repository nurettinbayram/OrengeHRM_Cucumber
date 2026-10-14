@regression 
Feature: Employee List Validation
	
	Background:
	Given Login with Admin credential
	And User should be able to see Dashbord page
	When Navigate to PIM and Employee List page
	Then User should be see list of employees 
	
	@employeeList 
	Scenario: Validate list of employee
	And User should see fifty rows of list by defaults
	And User should be see that coloumn name
	|ColoumnName		|
	|Employee Id		|
	|Name				|
	|Job Title 			|
	|Employment Status	|
	|Sub Unit			|
	|Cost Center		|
	|Location			|
	|Supervisor			|
	
	@employeeList 
	Scenario: User should able to search an employee by employee name
	And Enter Employee Name to input 
	And Click seach button 
	And Should see employee in filter list
	
	@employeeList 
	Scenario: Click employee name to navigate amployee details page
	And Enter Employee Name to input 
	And Click seach button 
	And Should see employee in filter list
	And Click on employee name
	And Navigate to employee details page compare name
	
	
	
	
	
	
	
	
	
	
	
	
	
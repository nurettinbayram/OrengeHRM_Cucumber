@addQualifications @regresion
Feature: Add Qualifications Deatails

	Background:
		Given Login with Admin credential
		And Navigate to PIM and Employee List page
		And User should be see list of employees
		And Enter Employee Name to input
	  	And Click seach button
	  	And Should see employee in filter list
	  	And Click on employee name
	  	When Click on MORE dropdown in Personal Details Page
	  	And Click on QUALIFICATION link
	  	And Hover over plus button

	@workexperience 
	Scenario: Add Work Experience
		And Click WORK EXPERIENCE link
		And Fill Work experience field   
		And Click Work experience save button
		Then User should be able to see the Record on the work experiance table 
	
	@addEducation 
	Scenario: Add Education
		And Click EDUCATION link
		And Fill Edications inputs
		And Click Work experience save button
		Then User should be able to see the Record on the educarion table 
		
	@skill
	Scenario: Add Skill
	And Click SKILL link
	And Fill Skill link inputs
	And Click Work experience save button
	Then User should be able to see the Record on the skill table
	
	
	@lenguage
	Scenario: Add Language
	And Click LANGUAGE link
	And Fill Language link inputs
	And Click Work experience save button
	Then User should be able to see the Record on the Language table
	
	@license
	Scenario: Add Licence
	And Click LICENCE link
	And Fill LICENCE link inputs
	And Click Work experience save button
	Then User should be able to see the Record on the LICENCE table
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
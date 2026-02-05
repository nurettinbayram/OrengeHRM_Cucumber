

Feature: Add Social Media Details 
	
	Background:
	Given Login with Admin credential
	And Navigate to PIM and Employee List page
	And User should be see list of employees
	And Enter Employee Name to input
  	And Click seach button
  	And Should see employee in filter list
  	And Click on employee name
  	When Click on MORE dropdown in Personal Details Page
  	And Click on SOCIAL MEDIA DETAILS link
  	And Admin able to see social media page
  	And Click on PLUS button right corner
  	And Admin able to see Add Social Media Pup up page
  	
  	@AddSocialMedia @regression
	Scenario: As an admin I should be able to add an employee social media details
  	And Fill out Add Social Media inputs 
  	And Click save button Add Social Media
  	Then Admin able to see pup up Successfully Saved message 
  	And Entered information should be displayed on the Social Media table
  	
  	
  	@AddSocialMedia @regression
  	Scenario: Upon entering invalid Link user should see an error message Should be a valid url
  	And Fill out Add Social Media inputs with invalid url link
  	Then It should show Should be a valid url message
  	
  	
  	
  	
  	
  	
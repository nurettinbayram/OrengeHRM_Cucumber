
Feature: Login fonctionality 


	@login @regression
	Scenario: User should login succesfuly 
	When I should able to navigate 'https://hrm.neotechacademy.com/'
	And Enter Admin Credential 'Admin' 'Neotech@123'
	And Click Login button
	Then User should be able to see Dashbord page  
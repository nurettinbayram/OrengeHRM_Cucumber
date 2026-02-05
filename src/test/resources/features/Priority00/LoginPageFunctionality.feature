
Feature: Login fonctionality 


	@login @regression @smoke
	Scenario: User should login succesfuly 
	When I should able to navigate 'https://hrm.neotechacademy.com/'
	And Enter Admin Credential 'Admin' 'Neotech@123'
	And Click Login button
	Then User should be able to see Dashbord page  
	
	
	@login @regression @smoke
	Scenario: Nagative Test Empty password 
	When I should able to navigate 'https://hrm.neotechacademy.com/'
	And Enter Admin Credential 'Admin' ''
	And Click Login button
	Then User should be able to see 'Password cannot be empty' message for password
	
	@login @regression @smoke
	Scenario: Nagative Test Empty username 
	When I should able to navigate 'https://hrm.neotechacademy.com/'
	And Enter Admin Credential '' 'Neotech@123'
	And Click Login button
	Then User should be able to see 'Username cannot be empty' message for username
	

	
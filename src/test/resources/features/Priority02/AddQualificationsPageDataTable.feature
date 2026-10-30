@addQualifications @regresion
Feature: Add Qualifications Deatails Using Data Table

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

	@workexperienceDt 
	Scenario: Add Work Experience Using Data Table
		And Fill Work Experience Input with Data Table
		   |Company 				|JobTitle 			|From 			 |To 			  	|
		   |Epic System				|MyChart App		|Thu, 20 Apr 2023|Thu, 20 Aug 2026  |
		   |Verizone Comunication	|Verizon Navigator	|Sun, 10 May 2020| Wed, 15 Mar 2023	|
	

	@addEducationDt 
	Scenario: Add Education Using Data Table
		And Fill Edications inputs with Data Table
			| Lavel             | Institute     | Major    | Year     | Score | StartDate        | EndDate         |
			| Bachelor's Degree | Siirt Un.     | Engineer | 4        | 88    | Tue, 14 Oct 2014 | Thu, 17 Oct 2019|
			| Master's Degree   | Gaziantep Un. | Tecnicer | 2        | 81    | Thu, 15 Oct 2020 | Tue, 10 Oct 2023|
		
	
	@skillDt
	Scenario: Add Skill Using Data Table
		And Fill Skill link inputs with Data Table
			|	Skill 	| YearsOfExperience |
			|Accounting |	4				|
			|Programming|	2				|
			|Research	|	5  				|
			


	@lenguageSo
	Scenario Outline: Add Language Using Scenario Outline
		And Hover over plus button
		And Click LANGUAGE link
		And Enter language input "<Language>"
		And Enter skill input "<Skill>"
		And Enter fluency level input "<Level>"
		And Click Work experience save button
		Then User should be able to see the Record on the Language table
		
	Examples: 
		|Language	|Skill		|Level	|
		|English	|Reading	|Good	|
		|Japanese	|Speaking	|Basic	|	
		|Spanish	|Writing	|Poor	|

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
@regression
Feature: Test all the login scenarios

Background: 
	Given user opened the required browser
	When user launched the web browser
	
@smoke
Scenario: login with invalid user credentials
	Given user enters invalid user name "admin1"
	And user enters invalid password "admin1"
	When user clicks on Login button
	Then user gets error message on login page itself
	And Validates the error message "Username or Password is invalid. Please try again."

@newfeature
Scenario Outline:
	Given user enters valid username as "<username>"
	And user enters valid password as "<password>"
	When user clicks on Login button
	Then Validates the "actiTIME - Enter Time-Track" of the time track page
	
	Examples:
		| username | password |
		|	admin		|	manager	|
		|	trainee	|	trainee|
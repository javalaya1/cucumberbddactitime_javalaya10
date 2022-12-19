Feature: Customer creation test

Background: 
	Given user opened the required browser
	When user launched the web browser

#@smoke
Scenario Outline:
	Given user enters valid username as "<username>"
	And user enters valid password as "<password>"
	When user clicks on Login button
	And user clicks on TaskListPage
	And creates new customer
	Then validate the customer got created
	
	Examples:
		| username | password |
		|	admin		|	manager	|
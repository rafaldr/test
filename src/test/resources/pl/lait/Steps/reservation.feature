Feature: Reservation process

Scenario: Successfull reservation for one person
	Given I open main page
	When I click link "SIGN-ON"
	When I fill in login fields with "adam_qwe123" "qwe123"
	When I fill reservation first page
	
	
	Then I should see flights reservation page
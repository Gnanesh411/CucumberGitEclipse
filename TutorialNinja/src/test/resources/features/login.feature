@all
Feature: User Login
  Registered User should be able to login to access account details
  
  Background:
	Given User opens the Application URL

	@login @validcredentials @regression @dev
  Scenario Outline: Login with valid credentials
    
    When User enters valid email address <email>
    And User enters valid password <password>
    And clicks on Login button
    Then User should Login Successfully
    Examples:
    |email							|password|
    |demo123@gmail.com	|Demo@123|
    |demo1234@gmail.com	|Demo@123|
    |demo1235@gmail.com	|Demo@123|

	@login @invalidcredentials @smoke @regression
  Scenario: Login with Invalid credentials
    When User enters Invalid email address "demo@gmail.com"
    And User enters Invalid password "Demo@12"
    And clicks on Login button
    Then User should get a proper warning message
	
	@login @validemailandinvalidpassword @regression
  Scenario: Login with valid email address and Invalid password
    When User enters valid email address "demo123@gmail.com"
    And User enters Invalid password "Demo@"
    And clicks on Login button
    Then User should get a proper warning message
	
	@login @invalidemailandvalidpassword @regression @wip
  Scenario: Login with Invalid email address and valid password
    When User enters Invalid email address "demo23@gmail.com"
    And User enters valid password "Demo@123"
    And clicks on Login button
    Then User should get a proper warning message
	
	@login @nocredentials @regression @ignore
  Scenario: Login without providing any credentials
    When User dont enter any credentials
    And clicks on Login button
    Then User should get a proper warning message

@all
Feature: User Registeration

Background:
Given User navigate to Register Account page
	
	@register @mandatoryfields @smoke @regression
  Scenario: Register with mandatory fields
    When User enters below details into the fields
    |firstname		|Gnanesh|
    |lastname			|Damodara|
    |emailaddress	|gnaneshgaming411@gmail.com|
    |Telephone		|1234567890|
    |Password			|12345|
    And Selects Privacy Policy field
    And Clicks on Continue button
    Then Account should get successfully created

	@register @allfields @smoke @regression
  Scenario: Register with all fields
    When User enters below details into the fields
    |firstname		|Gnanesh|
    |lastname			|Damodara|
    |emailaddress	|gnaneshgaming411@gmail.com|
    |Telephone		|1234567890|
    |Password			|12345|
    And Selects Yes for newsletter
    And Clicks on Continue button
    Then Account should get successfully created

	@register @nodetails @regression
  Scenario: Register without providing any fields
    When User dont enter details into any fields
    And Clicks on Continue button
    Then Warning messages should be displayed for the mandatory fields

	@register @duplicatemail @regression
  Scenario: Register with duplicate email address
   When User enters below details into the fields
    |firstname		|Gnanesh|
    |lastname			|Damodara|
    |emailaddress	|gnanigaming411@gmail.com|
    |Telephone		|1234567890|
    |Password			|12345|
    And Selects Yes for newsletter
    And Clicks on Continue button
    Then Warning message informating the User about duplicate email should be displayed

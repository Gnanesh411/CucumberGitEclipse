@all
Feature: Search Functionality

#The below statement demonstrates the use of Background Gherkhin keyword

Background:
Given User open the Application

@search @validproduct @smoke @regression
Scenario: Search for a valid product
When User enter valid product into search field
And User Click on Search button
Then Valid Product should get displayed in search results
#But Invalid Product should not be displayed in search results

@search @nonexistingproduct @regression
Scenario: Search for a non-existing product
When User enter non-existing product into search field
And User Click on Search button
Then Proper text informing the User about no product matching should be displayed

@search @noproduct @regression
Scenario: Search without providing any product
When User dont enter any product into search field
And User Click on Search button
Then Proper text informing the User about no product matching should be displayed


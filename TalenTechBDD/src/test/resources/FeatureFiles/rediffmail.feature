@rediffmail
Feature: Rediffmail login feature

@regression
Scenario: User should be able to handle login error pop
Given Rediffmail login page launched
When User click Go button without userid and password
Then User should be displayed with an error popup
And User should be able to handle error pop message 
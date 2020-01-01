@ups
Feature: Ups Login Feature

@regression
Scenario: Ups login with wrong username and wrong password
Given Ups login page is launched
When User input wrong "UserID" and wrong "Password"
Then User should receive an error message

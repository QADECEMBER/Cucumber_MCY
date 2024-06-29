@LoginFeature @Regression
Feature: Codefios login functionality validation
@DbLoginScenario1

Scenario: 1 User should be able to login with valid credentialsnfrom MySQL database
Given User is on the codefios login page
When User enters "username" from database
When User enters "password" from database
When User clicks on the Sign in button 
Then User lands on dashboard page 
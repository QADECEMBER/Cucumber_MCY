@LoginFeature @Regression
Feature: Codefios login functionality validation
@LoginScenario1
Scenario:1 User should be able to login with valid credentials
Given User is on the codefios login page
When User enters password as "abc123"
When User enters username as"demo@codefios.com"
When User clicks on the Sign in button 
Then User lands on dashboard page 

@LoginScenario2 @Smoke


Scenario: 2 User should be able to login with valid credentials
Given User is on the codefios login page
When User enters username as"demo@codefios.com"
When User enters password as "abc123"
When User clicks on the Sign in button 
Then User lands on dashboard page 
@DashboardFeature @Regression
Feature: Codefios dashboard functionality validation
@DashboardScenario1
Scenario: User should be able to login with valid credentials
Given User is on the codefios login page
When User enters username as"demo@codefios.com"
When User enters password as "abc123"
When User clicks on the Sign in button 
Then User lands on dashboard page 
Then User validates dashboard button
Then User validates user profile button

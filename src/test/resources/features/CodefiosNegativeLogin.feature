@NegativeLoginFeature
Feature: Codefios negative login functionality validation
 Background:
Given User is on the codefios login page

@NegativeScenario1 @Smoke
Scenario Outline:1 User should not be able to login with invalid credentials

When User enters username as"<username>"
When User enters password as "<password>"
When User clicks on the Sign in button 
Then User lands on dashboard page 
Examples: 
|username                  |password|
|demo@codefios.com         |abc124|
|demo2@codefios.com        |abc123|
|demo2@codefios.com        |abc124|

# when you use scenario outline you need to use examples
#in Background you put the same entry that have no break and it is in all scenario




             
@NegativeScenario3
Scenario:3 User should not be able to login with invalid credentials
Given User is on the codefios login page
When User enters username as"demo2@codefios.com"
When User enters password as "abc124"
When User clicks on the Sign in button 
Then User lands on dashboard page 


@NegativeScenario4 @Smoke
Scenario:5 User should not be able to login with invalid credentials
Given User is on the codefios login page
When User enters username as""
When User enters password as ""
When User clicks on the Sign in button 
Then User lands on dashboard page 
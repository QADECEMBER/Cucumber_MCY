@CodeFiosAddAccountFeature @Regression
Feature: Codefios add account functionality validation

Scenario:1 User should be able to login with valid credentials
Given User is on the codefios login page
When User enters username as"demo@codefios.com"
When User enters password as "abc123"
When User clicks on the Sign in button 
Then User lands on dashboard page
And User clicks on List Accounts
#Then User should be able to land New Account page
And User clicks on Add Account
And User enters "<Saving>" in the "accountName" field in AddAccount page
And User enters "<MySaving>" in the "description" field in AddAccount page
And User enters "<75,000>" in the "initialBalance" field in AddAccount page
And User enters "<10203040>" in the "accountNumber" field in AddAccount page
And User enters "<Akazi Keza>" in the "contactPerson" field in AddAccount page
And User clicks on Save button
Then User should be able to validate account created successfully
              
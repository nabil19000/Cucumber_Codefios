
Feature:

@DbScenario1 @Smoke
Scenario: login functionality validations
Given user is the login page
When user enter "username" from mysql database
When user enter "password" from mysql database
When user click on signin button
Then user should land on dashboard page
Feature: add account negative functionality validation
  Background:

    Given user is the login page
    When user enter username as "demo1@codefios.com"
    When user enter password as "abc123"
    When user click on signin button
    Then user should land on dashboard page



@NegTest1
  Scenario: Add Account Functionality
    Given user click on List Account
    Then user should land on Account List
    When user click Add Account
    Then User should land on new Account pop up window
  When user click on save button
  Then user should get an account name error
  Then user should get an account balance error
  Then user should get an account number error



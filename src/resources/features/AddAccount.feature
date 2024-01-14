

@AddAccount
Feature: add account functionality validation
  Background:

    Given user is the login page
    When user enter username as "demo1@codefios.com"
    When user enter password as "abc123"
    When user click on signin button
    Then user should land on dashboard page




  Scenario: Add Account Functionality
    Given user click on List Account
    Then user should land on Account List
    When user click Add Account
    Then User should land on new Account pop up window
    When user enter Account Name as "Profile"
    When user enter Description as "saving"
    When user enter Initial Balance as "10000"
    When user enter AC number as "5656565656"
    When user enter Contact Person as "rome"
    When user click on save button

    Then user should see the added account on Account list

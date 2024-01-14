
@NegativeLogin @Regression
Feature:



Scenario: negative login functionality validations no username and no password
Given user is the login page
    When user enter username as ""
    When user enter password as ""
When user click on signin button
Then user should get an username alert message


  Scenario: login functionality validations no password
    Given user is the login page
    When user enter username as "demo1@codefios.com"
    When user click on signin button
    Then user should get an password alert message

  Scenario: login functionality validations no username
    Given user is the login page
    When user enter username as ""
    When user enter password as "abc123"
    When user click on signin button
    Then user should get an username alert message

  Scenario: login functionality validations wrong username
    Given user is the login page
    When user enter username as "demo5@codefios.com"
    When user enter password as "abc123"
    When user click on signin button
     Then user should get an error message


Feature: login  functionality validation

@smoke
  Scenario: login functionality validations
    Given user is the login page
    When user enter username as "demo1@codefios.com"
    When user enter password as "abc123"
    When user click on signin button
    Then user should land on dashboard page


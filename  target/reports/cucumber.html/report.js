$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/resources/features/NegativeAddAcount.feature");
formatter.feature({
  "name": "add account negative functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"demo1@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Account Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NegTest1"
    }
  ]
});
formatter.step({
  "name": "user click on List Account",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_List_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on Account List",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_Account_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Add Account",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_Add_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on new Account pop up window",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_new_Account_pop_up_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get an account name error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_name_error()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get an account balance error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_balance_error()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get an account number error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_number_error()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
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
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/nabil/chromedriver-mac-x64 2/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:137)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:132)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:156)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:346)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:91)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\n\tat pages.BasePages.initDriver(BasePages.java:21)\n\tat steps.StepDefinition.before(StepDefinition.java:28)\n",
  "status": "failed"
});
formatter.step({
  "name": "user is the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter username as \"demo1@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_username_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "user should land on Account List",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_Account_List()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click Add Account",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_Add_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should land on new Account pop up window",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_new_Account_pop_up_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should get an account name error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_name_error()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should get an account balance error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_balance_error()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should get an account number error",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_get_an_account_number_error()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.close()\" because \"steps.StepDefinition.driver\" is null\n\tat steps.StepDefinition.tearDown(StepDefinition.java:165)\n",
  "status": "failed"
});
});
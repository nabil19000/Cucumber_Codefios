package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.AddAccountPage;
import pages.BasePages;
import pages.DataBasePage;
import pages.LoginPage;

public class StepDefinition extends BasePages {
     String Name;


    AddAccountPage addAccountPage;

    DataBasePage  dataBasePage  ;
    LoginPage  loginPage;

 @Before
    public void before(){
        initDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dataBasePage = new DataBasePage();
    }

   @Given("user is the login page")
   public void user_is_the_login_page () {
     driver.get("https://qa.codefios.com/login");
   }

   @When("user enter username as {string}")
   public void user_enter_username_as (String username){
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    loginPage.enterUserName(username);
   }

   @When("user enter password as {string}")
   public void user_enter_password_as (String password){
    loginPage.enterPassword(password);
   }

   @When("user click on signin button")
   public void user_click_on_signin_button () {
    loginPage.clickOnSignInButton();
   }
   @When("user should land on dashboard page")
   public void user_should_land_on_dashboard_page () {
    String expected = "Codefios QA";
    String actual = loginPage.validationDashboard();
    takeScreenShot(driver);
    Assert.assertEquals(expected, actual);
   }

    @Given("user click on List Account")
    public void user_click_on_List_Account() {
      addAccountPage = PageFactory.initElements(driver , AddAccountPage.class);
      addAccountPage.ClickOnListAccountButton();
    }

    @Then("user should land on Account List")
    public void user_should_land_on_Account_List() {
     String expected = "Manage Account";
     String actual = addAccountPage.validationAccountList();
     Assert.assertEquals(expected,actual);
    }

    @When("user click Add Account")
    public void user_click_Add_Account() {
   addAccountPage.addAccount();
    }



    @When("user enter Account Name as {string}")
    public void user_enter_Account_Name_as(String aName) {
     addAccountPage.accountName(aName+generatedNumber(999));
       Name = (aName+generatedNumber(999));
    }

    @When("user enter Description as {string}")
    public void user_enter_Description_as(String description) {
    addAccountPage.description(description);
    }

    @When("user enter Initial Balance as {string}")
    public void user_enter_Initial_Balance_as(String inbal) {
    addAccountPage.InitialBalance(inbal+generatedNumber(99));
    }

    @When("user enter AC number as {string}")
    public void user_enter_AC_number_as(String acNumber) {
     addAccountPage.acNumber(generatedNumber(999)+acNumber);
    }

    @When("user enter Contact Person as {string}")
    public void user_enter_Contact_Person_as(String contactperson) {
     addAccountPage.contactPerson(contactperson);
    }

    @When("user click on save button")
    public void user_click_on_save_button() {
    addAccountPage.clickOnSaveButton();
    }

    @Then("user should get an username alert message")
    public void user_should_get_an_username_alert_message() {
       String expected = "Please enter your user name";
       String actualAlert = loginPage.alertmsg();

       Assert.assertEquals(expected,actualAlert);
       loginPage.acceptAlert();
    }

    @Then("user should get an password alert message")
    public void user_should_get_an_password_alert_message() {
String expected = "Please enter your password";
String actual = loginPage.alertmsg();
Assert.assertEquals(expected,actual);
loginPage.acceptAlert();
    }


    @Then("user should get an error message")
    public void user_should_get_an_error_message() {
        String expected = "username or password information doesn't exist!";
        String actualAlert = loginPage.getAlertmssg();

        Assert.assertEquals(expected,actualAlert);

    }




    @When("user enter {string} from mysql database")
    public void user_enter_from_mysql_database(String loginData) {




       switch ( loginData ) {
           case "username":
               loginPage.enterUserName(dataBasePage.getDataFromDatabase("user_name"));
               System.out.println(dataBasePage.getDataFromDatabase("user_name"));
               break;
           case "password":
               loginPage.enterPassword(dataBasePage.getDataFromDatabase("user_password"));
               System.out.println(dataBasePage.getDataFromDatabase("user_password"));
               break;
           default:
               System.out.println("unable to retrieve Login Data:"+ loginData);
       }

    }
    @After
    public void tearDown() throws InterruptedException {
     Thread.sleep(2000);
     driver.close();
     driver.quit();
    }
    @Then("User should land on new Account pop up window")
    public void user_should_land_on_new_Account_pop_up_window() {
    Assert.assertTrue("not found",addAccountPage.newAccountValidation());

    }
    @Then ("user should see the added account on Account list")
    public void user_should_see_the_added_account_on_Account_list(){
        String beforePath = "//*[@id=\"tBody\"]/tr[";
        String afterPath = "]/td[2]";
        for(int i = 1; i<=5 ;i++){
            String actualName = driver.findElement(By.xpath(beforePath+i+afterPath)).getText();
            if(actualName.contains(Name)){
                System.out.println(actualName);
            }
            break;
    }



    }



    @Then("user should get an account name error")
    public void user_should_get_an_account_name_error() {
       String expected = "Error: Account name field required";
       String actual = addAccountPage.nameError();
       Assert.assertEquals(expected,actual);
    }

    @Then("user should get an account balance error")
    public void user_should_get_an_account_balance_error() {
        String expected = "Error: Account balance field is required";
        String actual = addAccountPage.balanceError();
        Assert.assertEquals(expected,actual);

    }
    @Then("user should get an account number error")
    public void user_should_get_an_account_number_error() {
        String expected = "Error: Account Number field is required";
        String actual = addAccountPage.numberError();
        Assert.assertEquals(expected,actual);
    }

}









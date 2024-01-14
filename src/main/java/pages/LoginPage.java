package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver ;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]")
    WebElement username_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    WebElement password_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]")
    WebElement signinButton_field ;
   @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div") WebElement alertmssg;

    public void enterUserName(String username){
        username_field.sendKeys(username);
    }
    public void enterPassword(String password){
        password_field.sendKeys(password);
    }
    public void clickOnSignInButton(){
        signinButton_field.click();
    }
    public String validationDashboard(){
        return driver.getTitle();
    }

    public String alertmsg() {
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void tearDown(){
       if(driver!=null) {
        driver.quit();
       }
    }
    public String getAlertmssg(){
        return alertmssg.getText();
    }

}

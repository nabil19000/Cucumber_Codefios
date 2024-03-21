package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddAccountPage {
    WebDriver driver;
   public  AddAccountPage(WebDriver driver){
       this.driver = driver ;
   }
   @FindBy(how = How.XPATH, using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[3]/a")
    WebElement listAccount_field;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div/div[2]/header/button")
    WebElement addAccount_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accountModalLabel\"]")
    WebElement newAccount_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"account_name\"]")
    WebElement accountName_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
    WebElement description_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
    WebElement initialBalance_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
    WebElement aCNumber_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
    WebElement contactPerson_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accountSave\"]")
    WebElement saveButton_field ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"error_accountname\"]")
    WebElement nameErrorMsg ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"error_balance\"]")
    WebElement balanceErrorMsg ;
    @FindBy(how = How.XPATH, using = "//*[@id=\"error_accountNo\"]")
    WebElement numberErrorMsg ;


    public void ClickOnListAccountButton(){
       listAccount_field.click();
  }
  public String validationAccountList(){
     return   driver.getTitle();
  }
  public void addAccount(){
        addAccount_field.click();
  }

  public boolean newAccountValidation(){
         newAccount_field.isDisplayed();
      return true;
  }


  public void accountName(String accountName){
        accountName_field.sendKeys(accountName);
  }
  public void description(String description){
        description_field.sendKeys(description);
  }
  public void InitialBalance(String initialB ){
        initialBalance_field.sendKeys(initialB);
  }
  public void acNumber(String acnumber){
        aCNumber_field.sendKeys(acnumber);
  }
  public void contactPerson(String contactPerson){
        contactPerson_field.sendKeys(contactPerson);
  }
 public void clickOnSaveButton(){
        saveButton_field.click();
 }
 public String nameError(){
       return nameErrorMsg.getText();
 }
    public String balanceError(){
        return balanceErrorMsg.getText();
    }
    public String numberError(){
        return numberErrorMsg.getText();
    }




     public String ValidateAddedAccount() {
         String beforePath = "//*[@id=\"tBody\"]/tr[";
         String afterPath = "]/td[2]";
        for(int i = 1; i<=5 ;i++){
          String actualName = driver.findElement(By.xpath(beforePath+i+afterPath)).getText();
          if(actualName.contains("")){
              System.out.println(actualName);
          }
           break;
        }
        return null ;
     }




}
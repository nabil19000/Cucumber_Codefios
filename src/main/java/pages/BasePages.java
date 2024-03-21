package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePages {
    public static WebDriver driver ;
    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/nabil/chromedriver-mac-x64 2/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
    }
    public int generatedNumber(int upperbound){
        Random rdn = new Random();
        return rdn.nextInt(upperbound);

    }

    public void takeScreenShot(WebDriver driver){

        TakesScreenshot ts = (TakesScreenshot) driver ;
        File sourceFile =ts.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_hhmmss");
        Date date = new Date();
        String label = formatter.format(date);
        try {
            FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/"+label+".png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

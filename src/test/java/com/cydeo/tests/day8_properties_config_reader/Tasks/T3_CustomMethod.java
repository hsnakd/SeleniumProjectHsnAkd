package com.cydeo.tests.day8_properties_config_reader.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.T3_CustomMethod_Method.getTableGetEmail;

public class T3_CustomMethod {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/tables");


    }

    //We use the utility method we created.

    @Test
    public void test(){
        getTableGetEmail(driver,"1", "John");
        getTableGetEmail(driver,"2", "Jason");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
/*

            TC #3: Create a custom method
                1- Open a Chrome browser
                2- Go to: https://practice.cydeo.com/tables
                3- Write custom method:

                • Method name: getTableGetEmail()
                • Return type: void
                • Arg1: WebDriver driver
                • Arg2: String tableNum
                • Arg3: String firstName

 */
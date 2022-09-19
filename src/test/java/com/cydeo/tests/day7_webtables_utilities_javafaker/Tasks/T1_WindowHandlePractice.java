package com.cydeo.tests.day7_webtables_utilities_javafaker.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandlePractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
    }



    @Test
    public void informationAlert() {
        //  3. Copy & paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //   4. Create a logic to switch to the tab where Etsy.com is open

        /**
                 Set<String> allWindowsHandles = driver.getWindowHandles();
                 for (String each : allWindowsHandles) {
                    driver.switchTo().window(each);
                     System.out.println("Current URL: " + driver.getCurrentUrl());
                     if (driver.getCurrentUrl().contains(expectedInUrl)){
                     break;
                     }
                 }
         */

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current Tab = " + each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().equals("https://www.etsy.com/")) {
                break;
            }

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }
        }


        //  5. Assert: Title contains “Etsy”
        String expectedInTitle = "Etsy";
        String actualTitle = driver.getTitle();
        System.out.println("expectedInTitle = " + expectedInTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
/*
    TC #1: Window Handle practice
            1. Create new test and make setups
            2. Go to : https://www.amazon.com
            3. Copy & paste the lines from below into your class
            4. Create a logic to switch to the tab where Etsy.com is open
            5. Assert: Title contains “Etsy”

            Lines to be pasted:
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        These lines will simply open new tabs using something called JavascriptExecutor and get those pages.
        We will learn JavascriptExecutor later as well.

 */
package com.cydeo.tests.day2_locators_getText_getAttribute.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_Facebook_Task1 {
    public static void main(String[] args) throws InterruptedException {


        // TODO   TC #4: Practice Cydeo – Class locator practice

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://www.facebook.com"
        driver.navigate().to("https://www.facebook.com");

        // 3. Verify title: pageTitle
        //    Expected: “Facebook – log in or sign up"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("TITLE PASSED");
        } else {
            System.out.println("TITLE FAILED");
        }

        // this will close all of the opened windows
        driver.quit();
    }

}
/**
             TC #1: Facebook title verification
                 1. Open Chrome browser
                 2. Go to https://www.facebook.com
                 3. Verify title:
                    Expected: “Facebook - Log In or Sign Up”


             • Create new class for each task.
             • There are some tips in the 2nd page for whoever needs it.
             • Please try to solve yourself first before moving to the tips.


             TIPS FOR TASK #1:
                 1. Set up driver
                 2. Open browser
                 3. Get webpage: https://www.facebook.com
                 4. Use .getTitle() method, and store the actual title in a String
                 5. Create expectedTitle String
                 6. Create if conditions to do your verification

 */
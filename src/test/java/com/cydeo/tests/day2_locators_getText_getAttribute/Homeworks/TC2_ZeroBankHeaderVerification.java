package com.cydeo.tests.day2_locators_getText_getAttribute.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_ZeroBankHeaderVerification {
    public static void main(String[] args) {


        // TODO   TC #2: Zero Bank header verification

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to "http://zero.webappsecurity.com/login.html"
        driver.navigate().to("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text user_login
        //      Expected: “Log in to ZeroBank”

        String expectedText = "Log in to ZeroBank";
        WebElement actualText = driver.findElement(By.className("page-header"));


        if (actualText.getText().equals(expectedText)) {
            System.out.println("TITLE PASSED");
        } else {
            System.out.println("TITLE FAILED");
        }


        // this will close all of the opened windows
        driver.quit();
    }

}
/**
         TC #2: Zero Bank header verification
             1. Open Chrome browser
             2. Go to http://zero.webappsecurity.com/login.html
             3. Verify header text
                 Expected: “Log in to ZeroBank”
 */
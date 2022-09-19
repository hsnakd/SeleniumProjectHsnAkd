package com.cydeo.tests.day2_locators_getText_getAttribute.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_CydeoClassLocator {
    public static void main(String[] args) {


        // TODO   TC #4: Practice Cydeo – Class locator practice

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to "https://practice.cydeo.com/inputs"
        driver.navigate().to("https://practice.cydeo.com/inputs");

        //  3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();

        //4- Verify title is as expected:
        //   Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }

        // this will close all of the opened windows
        driver.quit();
    }

}
/**
             TC #4: Practice Cydeo – Class locator practice
                 1- Open a Chrome browser
                 2- Go to: https://practice.cydeo.com/inputs
                 3- Click to “Home” link
                 4- Verify title is as expected:
                    Expected: Practice

            PS: Locate “Home” link using “className” locator
 */
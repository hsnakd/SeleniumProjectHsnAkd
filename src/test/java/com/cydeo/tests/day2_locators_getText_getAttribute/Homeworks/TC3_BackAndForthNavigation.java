package com.cydeo.tests.day2_locators_getText_getAttribute.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_BackAndForthNavigation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.className("gb_d")).click();

        String expectedTitle = "Gmail";   // Gmail: Ücretsiz, Gizli ve Güvenli E-posta | Google Workspace
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }

        driver.navigate().back();
        expectedTitle = "Google";
        actualTitle = driver.getTitle();

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
        TC #3: Back and forth navigation
             1- Open a Chrome browser
             2- Go to: https://google.com
             3- Click to Gmail from top right.
             4- Verify title contains:
                Expected: Gmail
             5- Go back to Google by using the .back();
             6- Verify title equals:
                Expected: Google
 */
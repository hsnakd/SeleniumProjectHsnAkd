package com.cydeo.tests.day0_selenium_intro.Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
    public static void main(String[] args) {


        // TODO   TC #1: Etsy Title Verification

        // 1. Open Chrome browser
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://www.etsy.com"
        driver.navigate().to("https://www.etsy.com");

        // 3. Search for “wooden spoon”
        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("wooden spoon" + Keys.ENTER);

        // 4. Verify title:
        // Expected: “Wooden spoon | Etsy” Wooden spoon - Etsy
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

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
        TC #1: Etsy Title Verification
            1. Open Chrome browser
            2. Go to https://www.etsy.com
            3. Search for “wooden spoon”
            4. Verify title:
                Expected: “Wooden spoon | Etsy”
 */
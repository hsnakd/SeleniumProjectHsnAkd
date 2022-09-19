package com.cydeo.tests.day4_findElements_checkboxes_radio.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_xpathLocatorPractice {
    public static void main(String[] args) {
        //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //  3. Click on Button 1
        WebElement button1  = driver.findElement(By.cssSelector("button[onclick='button1()']"));    // cssSelector
        WebElement button2  = driver.findElement(By.xpath("//button[@onclick='button1()']")); // xpath

        System.out.println("button1.getText() = " + button1.getText());
        System.out.println("button2.getText() = " + button2.getText());

        button1.click();

        //  4. Verify text displayed is as expected:    Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        WebElement actualText1 = driver.findElement(By.cssSelector("p[id='result']"));
        WebElement actualText2 = driver.findElement(By.cssSelector("p[style='color:green']"));
        WebElement actualText3 = driver.findElement(By.xpath("//p[@style='color:green']"));

        if (actualText1.getText().equals(expectedText) && actualText2.getText().equals(expectedText) && actualText3.getText().equals(expectedText) ) {
            System.out.println("Text is PASSED");
        } else {
            System.out.println("Text is FAILED");
        }


        // quit
        driver.quit();
    }
}
/*
        XPATH Practice
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        TC #6: XPATH LOCATOR practice
            1. Open Chrome browser
            2. Go to http://practice.cydeo.com/multiple_buttons
            3. Click on Button 1
            4. Verify text displayed is as expected:
                Expected: “Clicked on button one!”
            USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS
 */
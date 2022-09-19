package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_LocateElementByClassName {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to goggle
        driver.get("https://google.com");

        // identify and save the "Gmail" element
        WebElement elementGmail = driver.findElement(By.className("gb_d"));

        //verify is value is " I'm Feeling Lucky "

        if (elementGmail.getText().equals("Gmail")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // close browser
        driver.quit();

    }
}

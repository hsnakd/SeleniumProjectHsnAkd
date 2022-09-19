package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9_LocateElementByLinkText {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to http://google.com
        driver.get("http://google.com");

        // identify and save the About link element on the top
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

        //Click on the link
        gmailLink.click();


        // close browser
        driver.quit();

    }
}

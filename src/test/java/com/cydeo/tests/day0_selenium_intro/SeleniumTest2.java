package com.cydeo.tests.day0_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
    public static void main(String[] args) {

        // 1- Setting up the web driver manager
        // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Users/HSN/Desktop/CYDEO/Document/E9-Test Automation/SELENIUM/DAY 0/chromedriver");


        // 2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- Test if driver is working as expected
        driver.get("https://www.hakdogan.com");

    }


}

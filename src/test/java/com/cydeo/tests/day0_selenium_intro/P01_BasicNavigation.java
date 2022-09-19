package com.cydeo.tests.day0_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(URL)
        driver.navigate().to("https://www.google.com");

        // driver.get(URL)
        driver.get("https://www.google.com");

        //navigate.back()
        driver.navigate().back();

        //navigate.forward()
        driver.navigate().forward();

        //navigate.refresh()
        driver.navigate().refresh();


    }
}

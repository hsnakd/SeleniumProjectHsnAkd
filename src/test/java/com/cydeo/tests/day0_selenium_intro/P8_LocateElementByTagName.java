package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_LocateElementByTagName {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to http://practice.cydeo.com/
        driver.get("http://practice.cydeo.com/");

        // identify and save the "Test Automation Practice" element
        WebElement text = driver.findElement(By.tagName("h1"));

        //print out the text
        System.out.println("h1 tag name : " + text.getText());


        // close browser
        driver.quit();

    }
}

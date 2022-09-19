package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementById {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to cydeo
        driver.get("https://app.vytrack.com/user/login");

        // identify " Programs " element and save the element
        WebElement actualText = driver.findElement(By.id("_submit"));


        // find value of attribute
        String expectedText = "LOG IN";

        //verify is value is " I'm Feeling Lucky "

        if (actualText.getText().equals(expectedText)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // close browser
        driver.quit();


    }
}

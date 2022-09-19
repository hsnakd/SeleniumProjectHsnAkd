package com.cydeo.tests.day0_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_LocateElementByName {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to goggle
        driver.get("https://google.com");

        // identify and save the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        // enter text "selenium" and search for it
        searchBox.sendKeys("selenium" + Keys.ENTER);

        // close browser
        driver.quit();

    }
}

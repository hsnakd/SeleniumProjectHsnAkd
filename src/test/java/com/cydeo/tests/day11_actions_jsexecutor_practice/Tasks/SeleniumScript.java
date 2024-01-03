package com.cydeo.tests.day11_actions_jsexecutor_practice.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class SeleniumScript {

    public static void main(String[] args) throws InterruptedException {

        // your code here
        // todo
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://coderbyte.com/challenges");

        WebElement searchBox = driver.findElement(By.id("searchBox"));
        searchBox.sendKeys("front-end");

        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        Thread.sleep(1000);




        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1200)");

        System.out.println("Contents of the file: ");


        driver.quit();
    }

}

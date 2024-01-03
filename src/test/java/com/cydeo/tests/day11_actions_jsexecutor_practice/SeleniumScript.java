package com.cydeo.tests.day11_actions_jsexecutor_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumScript {

    public static void main(String[] args) throws InterruptedException{

        // your code here
        // todo
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://coderbyte.com/challenges");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("front-end");

        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();

        Thread.sleep(1000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");

        System.out.println("Content of the Bash file");

        driver.quit();
    }

}

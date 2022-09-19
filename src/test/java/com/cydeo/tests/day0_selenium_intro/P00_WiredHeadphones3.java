package com.cydeo.tests.day0_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P00_WiredHeadphones3 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void mouseoverElement(){
        WebElement removeLoginPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        removeLoginPopup.click();

        WebElement electronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).perform();
        WebElement wired = driver.findElement(By.xpath("(//a[contains(@class, '6WOcW9')])[17]"));
        String actualResult = wired.getText();
        String expectedResult = "Wired Headphones";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}




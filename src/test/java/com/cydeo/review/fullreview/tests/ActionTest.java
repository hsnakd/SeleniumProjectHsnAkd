package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;
import com.cydeo.review.week4.*;

public class ActionTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void hover(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(By.id("sub-menu"));
        actions.moveToElement(hover).perform();
        System.out.println(driver.findElement(By.id("link1")).getText());
    }

    @Test
    public void dClick(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        Actions actions = new Actions(driver);
        WebElement dClick = driver.findElement(By.id("double-click"));
        actions.doubleClick(dClick).perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You double clicked me!!!, You got to be kidding me");

    }


}

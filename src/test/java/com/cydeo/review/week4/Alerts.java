package com.cydeo.review.week4;

import com.cydeo.review.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;

public class Alerts extends TestBase {

//
//
//    @BeforeClass
//    public void setUp(){
//        driver = Driver.getDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @BeforeMethod
    public void goToPage(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void warning() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        String actual = driver.findElement(By.id("result")).getText();
        String expected = "You successfully clicked an alert";
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void confirmation() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();
        String actual = driver.findElement(By.id("result")).getText();
        String expected = "You clicked: Cancel";
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void prompt() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        String msg = "Cydeo EU9 Review";
        alert.sendKeys(msg);
        alert.accept();
        String actual = driver.findElement(By.id("result")).getText();
        String expected = "You entered: " + msg;
        Assert.assertEquals(actual,expected);


    }

}

package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertTest extends TestBase {

    @Test
    public void alertTest(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("alert")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        driver.findElement(By.name("confirmation")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();

        driver.findElement(By.name("prompt")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("EU9 Selenium Review");
        alert3.accept();


    }


}

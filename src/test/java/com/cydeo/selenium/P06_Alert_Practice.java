package com.cydeo.selenium;

import com.cydeo.base.TestBase_ShortVideo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class P06_Alert_Practice extends TestBase_ShortVideo {


    @Test
    public void alertTest(){
        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String expectedText = "You successfully clicked an alert";
        WebElement actualText = driver.findElement(By.xpath("//p[@id='result']"));

        assertEquals(actualText.getText() , expectedText);

        assertTrue(actualText.isDisplayed());

    }
}

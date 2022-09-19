package com.cydeo.selenium;

import com.cydeo.base.TestBase_ShortVideo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class P07_IFrames_Practice extends TestBase_ShortVideo {

    @Test
    public void iFrameTest(){
        driver.get("https://practice.cydeo.com/iframe");
/*
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        driver.switchTo().frame(0);

 */
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();

    }
}

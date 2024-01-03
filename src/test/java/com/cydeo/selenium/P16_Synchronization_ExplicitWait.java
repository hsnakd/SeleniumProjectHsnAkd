package com.cydeo.selenium;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.testng.Assert.assertTrue;

public class P16_Synchronization_ExplicitWait {
    @Test
    public void waitForExpectedTitle(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");
        Driver.getDriver().findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(titleIs("Dynamic title"));

        WebElement expectedText = Driver.getDriver().findElement(By.id("alert"));
        assertTrue(expectedText.isDisplayed());
    }
}

package com.cydeo.selenium;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchBetweenIframes {
    @Test
    public void SwitchBetweenIframes(){
        Driver.getDriver().get("http://example.com/page-with-iframes.html");

        // Switch to the first iframe
        Driver.getDriver().switchTo().frame(0);

        // Perform actions on elements within the first iframe
        Driver.getDriver().findElement(By.id("element-in-first-iframe"));

        // Switch back to the main content
        Driver.getDriver().switchTo().defaultContent();

        // Switch to the second iframe
        Driver.getDriver().switchTo().frame(1);

        // Perform actions on elements within the second iframe
        Driver.getDriver().findElement(By.id("element-in-second-iframe"));

        // Close the driver
        Driver.getDriver().quit();
    }
}

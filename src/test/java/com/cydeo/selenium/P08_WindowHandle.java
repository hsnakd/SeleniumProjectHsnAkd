package com.cydeo.selenium;

import com.cydeo.base.TestBase_ShortVideo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class P08_WindowHandle extends TestBase_ShortVideo {
    @Test
    public void windowsTest() throws InterruptedException {
        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickButton = driver.findElement(By.xpath("//a[@target='_blank']"));
        clickButton.click();

        Thread.sleep(3000);
        System.out.println("after clicking driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("after clicking driver.getWindowHandles() = " + driver.getWindowHandles());


        for (String eachHandle : allHandles) {
            System.out.println("eachHandle = " + eachHandle);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
}

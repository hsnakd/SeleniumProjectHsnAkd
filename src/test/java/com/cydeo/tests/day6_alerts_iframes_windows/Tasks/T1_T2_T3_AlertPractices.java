package com.cydeo.tests.day6_alerts_iframes_windows.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class T1_T2_T3_AlertPractices {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void informationAlert() {
        //  3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();
        //  4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //  5. Verify “You successfully clicked an alert” text is displayed.
        String expectedText = "You successfully clicked an alert";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        assertEquals(actualText, expectedText,"Actual result is not expected");
    }

    @Test
    public void confirmationAlertOk() {
        // 3. Click to “Click for JS Confirm” button
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 5. Verify “You clicked: Ok” text is displayed.
        String expectedText = "You clicked: Ok";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        assertEquals(actualText, expectedText,"Actual result is not expected");
    }

    @Test
    public void confirmationAlertCancel() {
        // 3. Click to “Click for JS Confirm” button
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        // 5. Verify “You clicked: Cancel” text is displayed.
        String expectedText = "You clicked: Cancel";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        assertEquals(actualText, expectedText,"Actual result is not expected");
    }

    @Test
    public void promptAlert() {
        // 3. Click to “Click for JS Prompt” button
        WebElement jsPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptButton.click();
        // 4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        // 5. Click to OK button from the alert
        alert.accept();
        // 6. Verify “You entered: hello” text is displayed.
        String expectedText = "You entered: hello";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        assertEquals(actualText, expectedText,"Actual result is not expected");
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}
/*
            TC #1: Information alert practice
                    1. Open browser
                    2. Go to website: http://practice.cydeo.com/javascript_alerts
                    3. Click to “Click for JS Alert” button
                    4. Click to OK button from the alert
                    5. Verify “You successfully clicked an alert” text is displayed.

            TC #2: Confirmation alert practice
                    1. Open browser
                    2. Go to website: http://practice.cydeo.com/javascript_alerts
                    3. Click to “Click for JS Confirm” button
                    4. Click to OK button from the alert
                    5. Verify “You clicked: Ok” text is displayed.

            TC #3: Information alert practice
                    1. Open browser
                    2. Go to website: http://practice.cydeo.com/javascript_alerts
                    3. Click to “Click for JS Prompt” button
                    4. Send “hello” text to alert
                    5. Click to OK button from the alert
                    6. Verify “You entered: hello” text is displayed.
 */
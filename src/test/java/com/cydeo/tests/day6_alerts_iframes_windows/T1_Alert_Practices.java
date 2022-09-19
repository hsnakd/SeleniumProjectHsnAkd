package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.*;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));


        informationAlertButton.click();
        Thread.sleep(1000);

        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");
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
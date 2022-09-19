package com.cydeo.selenium;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P14_JSExecuter {
    @Test
    public void scrollingTest () throws IOException {
        /** configuration.properties */
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");  //Path From Content Root

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        /** Task Solution */
        Driver.getDriver().get(properties.getProperty("scrollingTestURL"));
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", cydeoLink);

    }
}
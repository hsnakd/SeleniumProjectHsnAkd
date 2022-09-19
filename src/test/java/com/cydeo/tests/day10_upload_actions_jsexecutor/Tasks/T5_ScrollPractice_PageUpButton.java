package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T5_ScrollPractice_PageUpButton {
    @Test
    public void crmLogin() throws IOException {
        /** configuration.properties */
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");  //Path From Content Root

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        /** Task Solution */
        // 1. Open a Chrome browser
        // 2. Go to https://practice.cydeo.com/
        Driver.getDriver().get(properties.getProperty("scrollingTestURL"));

        // 3-4 Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(cydeoLink).perform();



        //  5- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

    }

}

/*
        TC #4: Scroll practice
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/
            3- Scroll down to “Powered by CYDEO”
            4- Scroll using Actions class “moveTo(element)” method


        TC #5: Scroll practice 2
            1-2-3-4 Continue from where the Task 4 is left in the same test.
            5- Scroll back up to “Home” link using PageUP button
 */
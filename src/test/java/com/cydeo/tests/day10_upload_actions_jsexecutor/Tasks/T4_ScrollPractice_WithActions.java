package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T4_ScrollPractice_WithActions {
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
        // 2. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(properties.getProperty("scrollingTestURL"));

        // 4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        BrowserUtils.sleep(2);
        actions.moveToElement(cydeoLink).pause(4000).perform();

    }

}

/*

        TC #4: Scroll practice
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/
            3- Scroll down to “Powered by CYDEO”
            4- Scroll using Actions class “moveTo(element)” method


 */
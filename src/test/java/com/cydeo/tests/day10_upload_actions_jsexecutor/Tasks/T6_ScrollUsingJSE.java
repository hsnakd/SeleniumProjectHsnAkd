package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T6_ScrollUsingJSE {
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
        Driver.getDriver().get(properties.getProperty("scrollJSEURL"));

        //3- Use below JavaScript method and scroll

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scroll(0,750)");

        //            a. 750 pixels down 10 times.      JavaScript method to use : window.scrollBy(0,0)
        for (int i = 1; i <= 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scroll(0,750)");
        }

        //            b. 750 pixels up 10 times.      JavaScript method to use : window.scrollBy(0,-0)
        for (int i = 1; i <= 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scroll(0,-750)");
        }        //

    }

}

/*

        TC #6: Scroll using JavascriptExecutor
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/infinite_scroll
            3- Use below JavaScript method and scroll
            a. 750 pixels down 10 times.
            b. 750 pixels up 10 times

            JavaScript method to use : window.scrollBy(0,0)

 */
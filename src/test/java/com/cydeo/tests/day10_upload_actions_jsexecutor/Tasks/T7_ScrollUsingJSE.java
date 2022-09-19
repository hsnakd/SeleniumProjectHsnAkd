package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T7_ScrollUsingJSE {
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
        // 2. Go to https://practice.cydeo.com/large
        Driver.getDriver().get(properties.getProperty("scrollLargeJSEURL"));

        // 3- Scroll down to “Cydeo” link

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        // 4- Scroll up to “Home” link


        // 5- Use below provided JS method only     JavaScript method to use : arguments[0].scrollIntoView(true)
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);



    }

}

/*


        TC #7: Scroll using JavascriptExecutor
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/large
            3- Scroll down to “Cydeo” link
            4- Scroll up to “Home” link
            5- Use below provided JS method only

            JavaScript method to use : arguments[0].scrollIntoView(true)

        Note: You need to locate the links as web elements and pass them as arguments into executeScript() method


 */
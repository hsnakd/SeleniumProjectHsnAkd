package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T2_FileUploadTest {
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
        // 1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(properties.getProperty("uploadURL"));

        // 2. Find some small file from your computer, and get the path of it.
        String filePath = "/Users/HSN/Desktop/hsn.txt";
        Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']")).sendKeys(filePath);

        //3. Upload the file.
        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();

        //4. Assert:
        String expectedFileName = "hsn.txt";
        String actualFileName = Driver.getDriver().findElement(By.xpath("//div[@id='uploaded-files']")).getText();
        Assert.assertEquals(expectedFileName, actualFileName);

        //-File uploaded text is displayed on the page
        String expectedText = "File Uploaded!";
        String actualText = Driver.getDriver().findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

}

/*
        TC #2 Upload Test
            1. Go to https://practice.cydeo.com/upload
            2. Find some small file from your computer, and get the path of it.
            3. Upload the file.
            4. Assert:

            -File uploaded text is displayed on the page

 */
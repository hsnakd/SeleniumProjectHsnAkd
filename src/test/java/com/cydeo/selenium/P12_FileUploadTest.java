package com.cydeo.selenium;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P12_FileUploadTest {
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

        Driver.getDriver().get(properties.getProperty("registrationUpload"));

        String filePath = "/Users/HSN/Desktop/hsn.txt";
        Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']")).sendKeys(filePath);


        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();

    }
}

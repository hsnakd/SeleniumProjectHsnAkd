package com.cydeo.tests.day8_properties_config_reader.Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.cydeo.utilities.Driver.closeDriver;

public class T4_GoogleSearch_ConfigurationProperties {

    @Test
    public void googleSearch() throws IOException {
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");  //Path From Content Root

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        System.out.println("properties.getProperty(\"browser4\") = " + properties.getProperty("browser4"));
        System.out.println("properties.getProperty(\"URL4\") = " + properties.getProperty("URL4"));
        System.out.println("properties.getProperty(\"searchKeyword4\") = " + properties.getProperty("searchKeyword4"));
        System.out.println("properties.getProperty(\"expectedTitle4\") = " + properties.getProperty("expectedTitle4"));




        //2- Go to: https://google.com
        Driver.getDriver().get(properties.getProperty("URL4"));

        //3- Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(properties.getProperty("searchKeyword4") + Keys.ENTER);

        //4- Verify title:            Expected: apple - Google Search
        String expectedTitle1 = properties.getProperty("searchKeyword4");
        String expectedTitle2 = properties.getProperty("expectedTitle4");
        String expectedTitle = expectedTitle1 + " " + expectedTitle2;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        closeDriver();
    }

}

/*

            TC #4: Google search
                1- Open a Chrome browser
                2- Go to: https://google.com
                3- Write “apple” in search box
                4- Verify title:            Expected: apple - Google Search

                Use `configuration.properties` for the following:

                1. The browser type
                2. The URL
                3. The search keyword
                4. Make title verification dynamic. If search value changes, title assertion should not fail.



 */
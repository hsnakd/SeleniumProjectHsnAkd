package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_Dropdown_Multiple {
    // TC #8: Selecting value from multiple select dropdown

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdownDate() {
        // 3. Select all the options from multiple select dropdown.

        Select selectLanguages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        selectLanguages.selectByValue("java");
        selectLanguages.selectByValue("js");
        selectLanguages.selectByValue("c#");
        selectLanguages.selectByValue("python");
        selectLanguages.selectByValue("ruby");
        selectLanguages.selectByValue("c");

        // 4. Print out all selected values.
        List<WebElement> languages = driver.findElements(By.xpath("//select[@name='Languages']"));

        for (WebElement each : languages) {
            System.out.println(each.getText());
        }

        // 5. Deselect all values.



    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}

/*
            TC #8: Selecting value from multiple select dropdown
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/dropdown
                3. Select all the options from multiple select dropdown.
                4. Print out all selected values.
                5. Deselect all values.
 */
package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class T6_Dropdown_Date {
    // TC #6: Selecting date on dropdown and verifying

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
        // 3. Select “December 1st, 1923” and verify it is selected.

        //Select year
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1923");

        //Select month
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByValue("11");


        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(0);


        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = selectYear.getFirstSelectedOption().getText();
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String actualDay = selectDay.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}

/*
            TC #6: Selecting date on dropdown and verifying
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/dropdown
                3. Select “December 1st, 1923” and verify it is selected.
            Select year using : visible text
            Select month using : value attribute
            Select day using : index number
 */
package com.cydeo.review.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDowns {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void getUrl(){
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void firstDropDown() {
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void defaultOption(){
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        String actualDefault = select.getFirstSelectedOption().getText();
        String expectedDefault = "Please select an option";
        Assert.assertEquals(actualDefault, expectedDefault);
    }

    @Test
    public void selectDate(){
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        selectYear.selectByVisibleText("2020");
        selectMonth.selectByValue("7");
        selectDay.selectByIndex(9);
    }

}

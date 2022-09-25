package com.cydeo.review.fullreview.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.cydeo.review.utilities.*;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }



}

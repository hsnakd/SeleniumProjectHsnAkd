package com.cydeo.review.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.cydeo.review.utilities.*;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

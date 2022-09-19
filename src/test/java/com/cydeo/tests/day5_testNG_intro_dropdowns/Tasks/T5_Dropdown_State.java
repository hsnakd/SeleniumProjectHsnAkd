package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class T5_Dropdown_State {
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
    public void dropdownState() {
        // 3. Select Illinois
        //WebElement dropdownState = driver.findElement(By.id("state"));
        //Select selectState = new Select(dropdownState);
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        selectState.selectByValue("IL");
        // 4. Select Virginia
        selectState.selectByValue("VA");
        // 5. Select California
        selectState.selectByValue("CA");
        selectState.selectByVisibleText("California");
        selectState.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = selectState.getFirstSelectedOption().getText();
        assertEquals(actualOptionText, expectedOptionText);
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}

/*
            TC #5: Selecting state from State dropdown and verifying result
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/dropdown
                3. Select Illinois
                4. Select Virginia
                5. Select California
                6. Verify final selected option is California.
            Use all Select options. (visible text, value, index)
 */
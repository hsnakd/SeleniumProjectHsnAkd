package com.cydeo.tests.day5_testNG_intro_dropdowns.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class T7_Dropdown_NonSelect {
    // TC #7: Selecting value from non-select dropdown

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
    public void dropdownNonSelect() {
        // 3. Click to non-select dropdown
        WebElement nonSelectMenu = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectMenu.click();

        // 4. Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.xpath("(//a[@href='https://www.facebook.com/'])"));
        facebook.click();

        // 5. Verify title is “Facebook – log in or sign up”
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}

/*
            TC #7: Selecting value from non-select dropdown
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/dropdown
                3. Click to non-select dropdown
                4. Select Facebook from dropdown
                5. Verify title is “Facebook - Log In or Sign Up”
 */
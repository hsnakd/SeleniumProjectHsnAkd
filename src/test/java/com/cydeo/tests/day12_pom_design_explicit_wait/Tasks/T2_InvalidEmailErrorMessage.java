package com.cydeo.tests.day12_pom_design_explicit_wait.Tasks;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_InvalidEmailErrorMessage {


    @BeforeMethod
    public void setupMethod(){
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com");
    }

    @Test
    public void required_field_error_message_test(){
        //3- Enter invalid email format
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys("fefwwef");

        //Click to “Sign in” button
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:    Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();
    }



}
/*

        TC #2: Invalid email format error message test
            1- Open a Chrome browser
            2- Go to: https://library1.cydeo.com
            3- Enter invalid email format
            4- Verify expected error is displayed:
        Expected: Please enter a valid email address.
        NOTE: FOLLOW POM DESIGN PATTERN

 */
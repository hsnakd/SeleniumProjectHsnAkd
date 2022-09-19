package com.cydeo.tests.day12_pom_design_explicit_wait.Tasks;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_NegativePasswordLogin {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        // TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test(){
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("hsn@akd.com");
        //4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:    Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        Driver.closeDriver();
    }



}
/*

       TC #3: Library negative login
            1- Open a Chrome browser
            2- Go to: https://library1.cydeo.com
            3- Enter incorrect username or incorrect password
            4- Verify title expected error is displayed:
        Expected: Sorry, Wrong Email or Password
        NOTE: FOLLOW POM DESIGN PATTERN


 */
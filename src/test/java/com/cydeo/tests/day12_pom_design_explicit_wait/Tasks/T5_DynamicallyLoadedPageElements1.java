package com.cydeo.tests.day12_pom_design_explicit_wait.Tasks;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_DynamicallyLoadedPageElements1 {

    // TC#5 : Dynamically Loaded Page Elements 1



    @BeforeMethod
    public void setupMethod(){

        //1- Open a Chrome browser & Go to: https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
    }







    @Test
    public void required_field_error_message_test(){
        // 2. Click to start
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        dynamicLoad1Page.startButton.click();

        // 3. Wait until loading bar disappears

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        // 4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());


        // 5. Enter username: tomsmith


        // 6. Enter password: incorrectpassword


        // 7. Click to Submit button


        // 8. Assert “Your password is invalid!” text is displayed.


        Driver.closeDriver();
    }



}
/*


        TC#5 : Dynamically Loaded Page Elements 1
            1. Go to https://practice.cydeo.com/dynamic_loading/1
            2. Click to start
            3. Wait until loading bar disappears
            4. Assert username inputbox is displayed
            5. Enter username: tomsmith
            6. Enter password: incorrectpassword
            7. Click to Submit button
            8. Assert “Your password is invalid!” text is displayed.
        Note: Follow POM Design Pattern



 */
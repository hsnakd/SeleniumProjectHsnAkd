package com.cydeo.tests.day13_review_and_practices.Tasks;

import com.cydeo.tests.day13_review_and_practices.Tasks.Pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_ExplicitWaitEnableButton {

    // TC#5 : Dynamically Loaded Page Elements 1



    @BeforeMethod
    public void setupMethod(){

        // 1/2- Open a Chrome browser & Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    }


    @Test
    public void ExplicitWaitEnableButton(){
        // 3- Click to “Enable” button
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.enableButton.click();

        // 4- Wait until “loading bar disappears”

        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        // 5- Verify:
        // a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());


        // b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.itIsDisabled.isDisplayed());

        Driver.closeDriver();
    }



}
/*

        TC #3: Explicit wait practice
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/dynamic_controls
            3- Click to “Enable” button
            4- Wait until “loading bar disappears”
            5- Verify:
                a. Input box is enabled.
                b. “It’s enabled!” message is displayed.
        NOTE: FOLLOW POM


 */
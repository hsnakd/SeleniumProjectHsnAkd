package com.cydeo.tests.day13_review_and_practices.Tasks;

import com.cydeo.tests.day13_review_and_practices.Tasks.Pages.DynamicControlsPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_ExplicitWaitRemoveButton {

    // TC#5 : Dynamically Loaded Page Elements 1



    @BeforeMethod
    public void setupMethod(){

        // 1/2- Open a Chrome browser & Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    }


    @Test
    public void ExplicitWaitRemoveButton(){
        // 3- Click to “Remove” button
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.removeButton.click();


        // 4- Wait until “loading bar disappears”

        // If we use implicitlyWait and explicitlyWait  together the system will be slow.
        // We can set implicitlyWait time 0
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        // 5- Verify:
        // a. Checkbox is not displayed


        try {
            //assertFalse method will pass the test if the boolean value returned is: false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
            //Assert.assertTrue(!(dynamicControlsPage.checkbox.isDisplayed()));
        }catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }


        // b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.itIsGone.isDisplayed());

        Driver.closeDriver();
    }



}
/*

        TC #2: Explicit wait practice
            1- Open a Chrome browser
            2- Go to: https://practice.cydeo.com/dynamic_controls
            3- Click to “Remove” button
            4- Wait until “loading bar disappears”
            5- Verify:
                a. Checkbox is not displayed
                b. “It’s gone!” message is displayed.
        NOTE: FOLLOW POM

 */
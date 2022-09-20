package com.cydeo.tests.day13_review_and_practices.Tasks;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.tests.day13_review_and_practices.Tasks.Pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_DoubleClickTest {

    // TC#5 : Dynamically Loaded Page Elements 1



    @BeforeMethod
    public void setupMethod(){

        // 1- Open a Chrome browser & Go to: https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
    }


    @Test
    public void doubleClick(){
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        // 2. Switch to iframe.

        //Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']")));
        Driver.getDriver().switchTo().frame(doubleClickPage.iframe);        // WebElement
        //Driver.getDriver().switchTo().frame("iframeResult");             // String - name/id
        //Driver.getDriver().switchTo().frame(1);        // Int - Index


        // 3. Double-click on the text “Double-click me to change my text color.”

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickPage.DoubleClickText).perform();


        // 4. Assert: Text’s “style” attribute value contains “red”.
        String expectedColor = "red";
        String actualColor = doubleClickPage.DoubleClickText.getAttribute("style");


        Assert.assertTrue(actualColor.contains(expectedColor));

        //Driver.closeDriver();
    }



}
/*

        TC #1: Double Click Test
            1. Go to  https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
            2. Switch to iframe.
            3. Double click on the text “Double-click me to change my text color.”
            4. Assert: Text’s “style” attribute value contains “red”.
        NOTE: FOLLOW POM





 */
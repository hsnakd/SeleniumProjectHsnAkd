package com.cydeo.tests.day11_actions_jsexecutor_practice.Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class T1_DragAndDrop {
    @Test
    public void crmLogin() throws IOException {

        /** Task Solution */
        // 1. Open a Chrome browser & Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        //Locate "Accept Cookies" button and click
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();


        // 2. Drag and drop the small circle to bigger circle.

        WebElement circle1 = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement circle2 = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(circle1).clickAndHold().moveToElement(circle2).click().perform();
/**     second solution
        // actions.dragAndDrop(circle1, circle2).perform();
*/

/**     third solution
        actions.clickAndHold(circle1)
                .pause(2000)
                .moveToElement(circle2)
                .pause(2000)
                .release()
                .perform();

*/
        // 3. Assert:       - Text in big circle changed to: “You did great!”
        String expectedText = "You did great!";
        String actualText = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']")).getText();


        Assert.assertEquals(expectedText, actualText);

    }

}

/*

        TC #: Drag and drop
            1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
            2. Drag and drop the small circle to bigger circle.
            3. Assert:

            - Text in big circle changed to: “You did great!”


 */
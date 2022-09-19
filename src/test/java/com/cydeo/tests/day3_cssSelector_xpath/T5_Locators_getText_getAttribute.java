package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_Locators_getText_getAttribute {
    public static void main(String[] args) {
    //  TC #5: NextBaseCRM, locators, getText(), getAttribute() practice

    //  1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    //  2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

    //  3- Enter incorrect username into login box:
        WebElement incorrectUsername = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        incorrectUsername.sendKeys("incorrect username");

    //  4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();

    //  5- Verify “error” label is as expected.    Expected: Login or E-mail not found
        String expectedErrorMessage = "Login or E-mail not found";
        WebElement actualErrorMessage = driver.findElement(By.cssSelector("div[class='errortext']"));

        if (actualErrorMessage.getText().equals(expectedErrorMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");

        }

    //  6- Close
        driver.quit();
    }
}

/*
        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
            1- Open a Chrome browser
            2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
            3- Enter incorrect username into login box:
            4- Click to `Reset password` button
            5- Verify “error” label is as expected.
                Expected: Login or E-mail not found

            PS: Inspect and decide which locator you should be using to locate web elements.

            PS2: Pay attention to where to get the text of this button from
 */
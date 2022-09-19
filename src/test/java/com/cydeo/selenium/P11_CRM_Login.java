package com.cydeo.selenium;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P11_CRM_Login {
    @Test
    public void crmLogin(){
        // driver.get("https://qa.azulcrm.com/");
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        //4. Enter valid password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        //5. Click to Log In Button
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
}

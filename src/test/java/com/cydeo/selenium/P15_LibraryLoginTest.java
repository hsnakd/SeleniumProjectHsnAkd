package com.cydeo.selenium;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class P15_LibraryLoginTest {
    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();
/**
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("library3.student.username"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.signInButton.click();
*/
        loginPage.login(ConfigurationReader.getProperty("library3.student.username"),ConfigurationReader.getProperty("library3.student.password"));
    }

    @Test
    public void negativeLoginTEst(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        /**
        loginPage.inputUsername.sendKeys("asnjxnas@lcsdncsldk.com");
        loginPage.inputPassword.sendKeys("wqdkllqwnd234");
        loginPage.signInButton.click();
        */

        loginPage.login("asnjxnas@lcsdncsldk.com", "wqdkllqwnd234");



    }

}

package com.cydeo.review.fullreview.tests;

import com.github.javafaker.Faker;
import com.cydeo.review.fullreview.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cydeo.review.utilities.*;

public class RegistrationTest {

    RegistrationPage rsPage;
    SuccessPage scPage;
    WebDriver driver;

    Faker faker = new Faker();

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        rsPage = new RegistrationPage();
        scPage = new SuccessPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void regTest() throws InterruptedException {

        driver.get(ConfigurationReader.getProperty("registration.form.url"));
        Thread.sleep(1000);
        rsPage.firstName.sendKeys(faker.name().firstName());
        rsPage.lastName.sendKeys(faker.name().lastName());
        rsPage.userName.sendKeys(faker.bothify("##??##??"));
        rsPage.emailInput.sendKeys(faker.internet().emailAddress());
        rsPage.passwordInput.sendKeys(faker.internet().password());
        rsPage.phoneInput.sendKeys(faker.numerify("###-###-####"));
        rsPage.radioBtns.get(faker.number().numberBetween(0,3)).click();
        rsPage.birthDayInput.sendKeys("12/12/2020");

        Select select = new Select(rsPage.departDrop);
        select.selectByIndex(faker.number().numberBetween(1,11));

        Select select1 = new Select(rsPage.jobDrop);
        select1.selectByIndex(faker.number().numberBetween(1,9));

        rsPage.cPlus.click();
        rsPage.javaLanguage.click();

        rsPage.loginBtn.click();

        String expectedMsg = "You've successfully completed registration!";
        Assert.assertEquals(scPage.successMsg.getText(),expectedMsg);

    }

}

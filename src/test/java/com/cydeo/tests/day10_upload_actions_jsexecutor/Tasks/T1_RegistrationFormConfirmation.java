package com.cydeo.tests.day10_upload_actions_jsexecutor.Tasks;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class T1_RegistrationFormConfirmation {

    @Test
    public void registrationForm() throws IOException {
        /** Faker */
        //Create the object of Faker
        Faker faker = new Faker();

        /** configuration.properties */
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");  //Path From Content Root

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        /** Task Solution */

        //            1. Open browser
        //            2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(properties.getProperty("registrationFormURL"));



        //            3. Enter first name
        WebElement inputFistName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String firstName = faker.name().firstName();
        inputFistName.sendKeys(firstName);

        //            4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String lastName = faker.name().lastName();
        inputLastName.sendKeys(lastName);

        //            5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String userName = faker.bothify("??????##");
        //String userName = faker.name().username();
        //String userName = faker.name().username().replaceAll(".","");
        inputUsername.sendKeys(userName);

        //            6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        String eMail = faker.internet().emailAddress();
        inputEmail.sendKeys(eMail);
        //inputEmail.sendKeys(userName + "@email.com");

        //            7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        String passWord = faker.internet().password();
        inputPassword.sendKeys(passWord);
        inputPassword.sendKeys(faker.bothify("??????##"));

        //            8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        String phoneNumber = faker.numerify("###-###-####");
        inputPhoneNumber.sendKeys(phoneNumber);
        //inputPhoneNumber.sendKeys(faker.phoneNumber(););
        //inputPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());

        //            9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        inputGender.click();


        //            10. Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        int M = faker.number().numberBetween(1,12);
        int D = faker.number().numberBetween(1,31);
        int Y = faker.number().numberBetween(1900,2022);
        String birthDay = M + "/" + D  + "/" + Y;
        inputBirthday.sendKeys(birthDay);

        //String birthDay = String.valueOf(faker.date().birthday());
        //birthday.sendKeys(birthDay + Keys.ENTER);

        //            11. Select Department/Office
        WebElement inputDepartment = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        Select department = new Select(inputDepartment);
        department.selectByIndex(faker.number().numberBetween(1,9));


        //            12. Select Job Title
        WebElement inputJobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select jobTitle = new Select(inputJobTitle);
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));
        //            13. Select programming language from checkboxes
        WebElement inputProgrammingLanguage = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        inputProgrammingLanguage.click();
        //            14. Click to sign up button
        WebElement inputSignupButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        inputSignupButton.click();

        //            15. Verify success message “You've successfully completed registration!” is displayed.
        String expectedText = "You've successfully completed registration!";
        String actualText = Driver.getDriver().findElement(By.xpath("//p")).getText();
        Assert.assertEquals(actualText, expectedText);

    }
}
/*
        TC#1: Registration form confirmation

        Note: Use JavaFaker OR read from configuration.properties file when possible.

            1. Open browser
            2. Go to website: https://practice.cydeo.com/registration_form
            3. Enter first name
            4. Enter last name
            5. Enter username
            6. Enter email address
            7. Enter password
            8. Enter phone number
            9. Select a gender from radio buttons
            10. Enter date of birth
            11. Select Department/Office
            12. Select Job Title
            13. Select programming language from checkboxes
            14. Click to sign up button
            15. Verify success message “You’ve successfully completed registration.” is displayed.

        Note:
            1. Use new Driver utility class and method
            2. User JavaFaker when possible
            3. User ConfigurationReader when it makes sense


 */
package com.cydeo.review.week6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cydeo.review.utilities.*;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement nameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginBtn;

    @FindBy(id = "flash")
    public WebElement successMsg;

    public void loginMethod(String username, String password){

        nameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }




}

package com.cydeo.review.fullreview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class SuccessPage {

    public SuccessPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@role=\"alert\"]/p")
    public WebElement successMsg;
}

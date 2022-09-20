package com.cydeo.tests.day13_review_and_practices.Tasks.Pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//button[.='Remove']
    @FindBy(xpath = "//button[@type='button']")
    public WebElement removeButton;

    @FindBy(xpath = "//div[@id='loading']")
    public WebElement waitForIt;

    @FindBy(xpath = "//div[@id='loading']//img")
    public WebElement loadingBar;

    //@FindBy(css = "input[label='blah']")
    @FindBy(xpath = "//div[@id='checkbox']")
    public WebElement checkbox;

    //@FindBy(xpath = "//p[@id='message']")
    @FindBy(css = "p[id='message']")
    public WebElement itIsGone;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy(css = "input[type='text']")
    public WebElement inputBox;

    @FindBy(css = "p[id='message']")
    public WebElement itIsDisabled;

}

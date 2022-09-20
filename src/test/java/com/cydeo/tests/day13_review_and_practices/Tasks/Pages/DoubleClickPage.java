package com.cydeo.tests.day13_review_and_practices.Tasks.Pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {

    public DoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "demo")
    public WebElement DoubleClickText;

    @FindBy(xpath = "//iframe[@id='iframeResult']")
    public WebElement iframe;



}

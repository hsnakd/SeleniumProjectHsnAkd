package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Page {
    //#1-Create constructor and instantiate driver and object of the class

    public N11Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='setCookieBtn clearAll']")
    public WebElement rejectCookies;

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement siginButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "(//span[@class='followBtn'])[3]")
    public WebElement thirdProductFavorite;

    @FindBy(xpath = "(//h2[@class='accTitle']")
    public WebElement favoriteList;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement account;

    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement accountFL;

    @FindBy(xpath = "//span[@class='icon-base heart-favorites-black']")
    public WebElement favorite;

    @FindBy(xpath = "//span[@class='deleteProFromFavorites']")
    public WebElement delete;

    @FindBy(xpath = "//span[@class='message']")
    public WebElement deleteMessage;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement okButton;

    @FindBy(xpath = "//a[@class='logoutBtn']")
    public WebElement logoutButton;

    @FindBy(xpath = "")
    public WebElement price3;

}
/**
 * For using Pause Function
 * select "Sources"
 press F8+Ctrl+/ for Windows or  F8+Command+/  for Mac (or fn + F8).
 */
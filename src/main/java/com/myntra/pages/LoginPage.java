package com.myntra.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SB00430588 on 8/26/2016.
 */
public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//p[@class='login-title']")
    public WebElement loginTitle;

    @FindBy(xpath = "//p[contains(text(),'Signup')]")
    public WebElement signUpTitle;
}

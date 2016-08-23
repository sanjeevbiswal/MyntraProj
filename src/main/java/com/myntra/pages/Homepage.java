package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by SB00430588 on 8/22/2016.
 */
public class Homepage {
    public WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class,'logo')]")
    public WebElement myntraLogo;

    @FindBy(xpath = "//div[@class='navbar']//a")
    public List<WebElement> navbar;

    @FindBy(id = "q")
    public WebElement searchInputBox;

    @FindBy(xpath = "//span[contains(@class,'icon-search')]")
    public WebElement searchButton;

}

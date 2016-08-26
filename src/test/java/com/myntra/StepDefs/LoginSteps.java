package com.myntra.StepDefs;

import com.myntra.TestUtils.BeforeAfter;
import com.myntra.pages.Homepage;
import com.myntra.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SB00430588 on 8/26/2016.
 */
public class LoginSteps {

    public WebDriver driver;
    public Homepage homepage;
    public LoginPage loginpage;

    public LoginSteps(){
        driver= BeforeAfter.driver;
        homepage= PageFactory.initElements(driver,Homepage.class);
        loginpage=PageFactory.initElements(driver,LoginPage.class);

    }
    @When("^User mouse hover on user icon$")
    public void user_MouseHover_On_UserIcon() throws Throwable {
        Actions action=new Actions(driver);
        action.moveToElement(homepage.userIcon).perform();
    }

    @And("^User clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String buttonName) throws Throwable {
        switch (buttonName.toLowerCase()){
            case "log in":
                homepage.loginButton.click();
                break;
            case "sign up":
                homepage.signUpButton.click();
                break;
        }

    }


    @Then("^\"([^\"]*)\" page should be displayed$")
    public void pageShouldBeDisplayed(String pageName) throws Throwable {
       switch ((pageName.toLowerCase())){
           case "log in":
               Assert.assertTrue(loginpage.loginTitle.getText().contains("Login"));
               break;
           case "sign up":
               Assert.assertTrue(loginpage.signUpTitle.getText().contains("Signup"));
               break;
       }
    }
}

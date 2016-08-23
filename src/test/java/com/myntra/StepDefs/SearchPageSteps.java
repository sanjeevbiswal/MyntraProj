package com.myntra.StepDefs;

import com.myntra.TestUtils.BeforeAfter;
import com.myntra.pages.Homepage;
import com.myntra.pages.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SB00430588 on 8/23/2016.
 */


public class SearchPageSteps {

    public WebDriver driver;
    public Homepage homepage;
    public SearchPage searchpage;
        public SearchPageSteps(){
            driver= BeforeAfter.driver;
             homepage= PageFactory.initElements(driver,Homepage.class);
            searchpage=PageFactory.initElements(driver,SearchPage.class);

}
    @When("^User search for \"([^\"]*)\" using search input box$")
    public void userSearchForUsingSearchInputBox(String itemName) throws Throwable {
        homepage.searchInputBox.sendKeys(itemName);
    }

    @And("^User clicked 'Search' button in the homepage$")
    public void userClickedSearchButtonInTheHomepage() throws Throwable {
        homepage.searchButton.click();
    }

    @Then("^User should navigate to \"([^\"]*)\" search page$")
    public void userShouldNavigateToSearchPage(String itemName) throws Throwable {
        Assert.assertTrue(searchpage.itemTitle.getText().toLowerCase().contains(itemName.toLowerCase()));
    }
}

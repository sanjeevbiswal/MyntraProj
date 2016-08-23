package com.myntra.StepDefs;

import com.myntra.TestUtils.BeforeAfter;
import com.myntra.pages.Homepage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by SB00430588 on 8/22/2016.
 */


public class HomepageTest {
    public WebDriver driver;
    public Homepage homepage;

public HomepageTest(){
    driver=BeforeAfter.driver;
    homepage= PageFactory.initElements(driver,Homepage.class);
}


    @Given("^User navigate to 'Myntra' homepage$")
    public void userNavigateToMyntraHomepage() throws Throwable {
       driver.get("http://www.myntra.com/");
    }

    @When("^User clicked 'Myntra' logo$")
    public void user_clicked_Myntra_logo() throws Throwable {
        homepage.myntraLogo.click();
    }

    @Then("^User should see 'Myntra' homepage$")
    public void user_should_see_Myntra_homepage() throws Throwable {
        Assert.assertTrue(driver.getCurrentUrl().contains("http://www.myntra.com/?src=logo"));
    }


    @Given("^User sees below mentioned links available$")
    public void user_sees_below_mentioned_links_available(DataTable arg1) throws Throwable {
        List<WebElement> displayedLinks = homepage.navbar;
        List<String> actualValue=new ArrayList<String>();
        List<String> failData=new ArrayList<>();
        for(WebElement ele:displayedLinks){
            actualValue.add(ele.getText());
        }

        List<String> expectedValue = arg1.asList(String.class);
        failData=actualValue.stream().filter((String value)->!expectedValue.contains(value)).collect(Collectors.toList());
        System.out.println(failData.size());
        Assert.assertTrue(failData.size()==0);
    }

}

package com.myntra.TestUtils;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by SB00430588 on 8/22/2016.
 */
public class BeforeAfter {

    public static WebDriver driver;

    @Before
    public void getBrowser(){
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        driver.close();
    }

    public static void takeScreenshot(){
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
    }
}

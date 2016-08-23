package com.myntra.TestUtils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SB00430588 on 8/22/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "com.myntra",
        format = { "pretty", "html:target/site/cucumber-pretty"},
        monochrome = true,
        tags = "@headertest"
        //,dryRun = true
)

public class TestRunner {
}

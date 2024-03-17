package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml"

        },
        features = "/Users/mustafa/IdeaProjects/com.cucumberPrj/src/test/resources/GridFeatures",
        glue = {"stepDefinitions"},
        tags="@CrosBrowserTest",
        dryRun = false

)



public class RunnerSeleniumGrid {




}

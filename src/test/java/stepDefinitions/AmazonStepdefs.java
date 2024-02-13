package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepdefs {
    AmazonPages amazonPages=new AmazonPages();
    @Given("user goes  to Amazon")
    public void userGoesToAmazon() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amzUrl"));
    }

    @Then("user searchs  nutella")
    public void userSearchsNutella() {
        amazonPages.searchBox.sendKeys("nutella", Keys.ENTER);

    }

    @And("user checks if the result include nutella")
    public void userChecksIfTheResultIncludeNutella() {
        String expectedResult="nutella";
        String actualResult=amazonPages.writingOfResult.getText();
        Assert.assertTrue(expectedResult.contains(actualResult));

    }

    @And("user closes the Amazon")
    public void userClosesTheAmazon() {
        Driver.quitDriver();
    }

    @Then("user searchs  Selenium")
    public void userSearchsSelenium() {

        amazonPages.searchBox.sendKeys("Selenium",Keys.ENTER);


    }

    @And("user checks if the result include Selenium")
    public void userChecksIfTheResultIncludeSelenium() {
        String expectedResult=amazonPages.writingOfResult.getText();
        Assert.assertTrue(expectedResult.contains("Selenium"));


    }
}

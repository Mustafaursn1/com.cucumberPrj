package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EbayPages;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;

public class EbayStepdefs {
    EbayPages ebayPages = new EbayPages();

    @Given("User goes to ebay")
    public void user_goes_to_ebay() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));


    }

    @Then("user search the smartphone")
    public void user_search_the_smartphone() {
        ebayPages.searchBox.sendKeys("smartphone", Keys.ENTER);

    }

    @Then("User check the result of the result if that inclueds smartphone")
    public void user_check_the_result_of_the_result_if_that_inclueds_smartphone() {
        String expectedResult = "smartphone";
        String actuallResult = ebayPages.resultText.getText();
        System.out.println(actuallResult);


        Assert.assertTrue(expectedResult.contains(actuallResult));


    }

    @Then("User close ebay")
    public void user_close_ebay() {
        Driver.quitDriver();

    }

}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepdefs {
    AmazonPages amazonPages = new AmazonPages();

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
        String expectedResult = "nutella";
        String actualResult = amazonPages.writingOfResult.getText();
        Assert.assertTrue(expectedResult.contains(actualResult));

    }

    @And("user closes the Amazon")
    public void userClosesTheAmazon() {
        Driver.quitDriver();
    }

    @Then("user searchs  Selenium")
    public void userSearchsSelenium() {

        amazonPages.searchBox.sendKeys("Selenium", Keys.ENTER);


    }

    @And("user checks if the result include Selenium")
    public void userChecksIfTheResultIncludeSelenium() {
        String expectedResult = amazonPages.writingOfResult.getText();
        Assert.assertTrue(expectedResult.contains("Selenium"));


    }

    @Then("user search {string} by Amazon")
    public void userSearchByAmazon(String arananKelime) {
        amazonPages.searchBox.sendKeys(arananKelime, Keys.ENTER);
    }

    @And("User check the result of the result if that inclueds {string}")
    public void userCheckTheResultOfTheResultIfThatInclueds(String arananKelime) {
        String actualResult = amazonPages.writingOfResult.getText();
        String expectedResult = arananKelime;

        Assert.assertTrue(actualResult.contains(arananKelime));


    }

    @Given("user goes {string}")
    public void userGoes(String arananUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(arananUrl));


    }

    @When("user checks that if {string} includes currentUrl")
    public void userChecksThatIfIncludesCurrentUrl(String url) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("url:"+url);

        Assert.assertTrue(url.equals(actualUrl));


    }

    @And("user closes the {string}")
    public void userClosesThe(String arg0) {
        Driver.quitDriver();

    }

    @Then("User waits {int} moments")
    public void userWaitsMoments(int beklemeSüresi) throws InterruptedException {
        Thread.sleep(beklemeSüresi*1000);




    }

    @And("user closes the page")
    public void userClosesThePage() {
        Driver.quitDriver();
    }
}

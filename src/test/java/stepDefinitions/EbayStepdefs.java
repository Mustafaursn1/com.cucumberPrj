package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EbayPages;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;

public class EbayStepdefs {
    EbayPages ebayPages = new EbayPages();
    Faker faker=new Faker();

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



    @Then("user search the iphone")
    public void userSearchTheIphone() {

        ebayPages.searchBox.sendKeys("Iphone",Keys.ENTER);



    }

    @And("User check the result of the result if that inclueds iphone")
    public void userCheckTheResultOfTheResultIfThatIncluedsIphone() {
        String expectedResult="Iphone";
        String actuallResult=ebayPages.resultText.getText();
        Assert.assertTrue(expectedResult.contains(actuallResult));


    }

    @Then("user search the Samsung")
    public void userSearchTheSamsung() {
        ebayPages.searchBox.sendKeys("Samsung", Keys.ENTER);
    }

    @And("User check the result of the result if that inclueds Samsung")
    public void userCheckTheResultOfTheResultIfThatIncluedsSamsung() {
        String expectedResult="Samsung";
        String actuallResult=ebayPages.resultText.getText();
        Assert.assertTrue(expectedResult.contains(actuallResult));
    }

    @Then("User close ebay")
    public void user_close_ebay() {
        Driver.quitDriver();

    }

    @When("User click einlogin button")
    public void userClickEinloginButton() {
        ebayPages.einLogin.click();
        ebayPages.cookies.click();

    }

    @Then("User enters  invalid email and enter")
    public void userEntersInvalidEmailAndEnter() {
        String invalidEmail=faker.internet().emailAddress();
        ebayPages.emailBox.click();


    }

    @Then("User enters invalid password and enter")
    public void userEntersInvalidPasswordAndEnter() {
        String invalidPass=faker.internet().password();
        ebayPages.passwortBox.click();

    }

    @And("User verifies that there is no login with incorrect user information.")
    public void userVerifiesThatThereIsNoLoginWithIncorrectUserInformation() {
        Assert.assertTrue(ebayPages.textOfInvalidUser.isDisplayed());

    }
}

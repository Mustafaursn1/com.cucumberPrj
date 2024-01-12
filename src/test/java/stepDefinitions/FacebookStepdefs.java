package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FacebookPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FacebookStepdefs {
    FacebookPages facePage=new FacebookPages();

    @Given("User goes to facebook")
    public void user_goes_to_facebook() {
        Driver.getDriver().get(ConfigurationReader.getProperty("faceUrl"));

    }
    @Then("user enters email")
    public void user_enters_email() {



    }
    @Then("User enters password")
    public void user_enters_password() {

    }
    @Then("It tests whether the user entered with incorrect data")
    public void it_tests_whether_the_user_entered_with_incorrect_data() {

    }

}

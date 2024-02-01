package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.FacebookPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepdefs {
    FacebookPages facePage=new FacebookPages();
    Faker faker=new Faker();

    @Given("User goes to facebook")
    public void user_goes_to_facebook() {
        Driver.getDriver().get(ConfigurationReader.getProperty("faceUrl"));

    }
    @Then("user enters email")
    public void user_enters_email() {
        String  userEmail=faker.internet().emailAddress();
        facePage.email.sendKeys(userEmail);





    }
    @Then("User enters password")
    public void user_enters_password() {
        facePage.password.sendKeys(faker.internet().password(), Keys.ENTER);

    }
    @Then("It tests whether the user entered with incorrect data")
    public void it_tests_whether_the_user_entered_with_incorrect_data() {

        Assert.assertTrue(facePage.basarisizGiris.isDisplayed());


    }

}

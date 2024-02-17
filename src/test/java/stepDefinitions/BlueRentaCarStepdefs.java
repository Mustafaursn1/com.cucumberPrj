package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentalCarsPages;
import utilities.Driver;

public class BlueRentaCarStepdefs {
    BlueRentalCarsPages blueRentalCarsPages = new BlueRentalCarsPages();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("User clicks the logintext")
    public void userClicksTheLogintext() {
        blueRentalCarsPages.loginText.click();


    }

    @And("User enter the invalid Email")
    public void userEnterTheInvalidEmail() {
        String invalidEmail = faker.internet().emailAddress();
        blueRentalCarsPages.userEmail.sendKeys(invalidEmail);


    }

    @And("User enter the invalid Password")
    public void userEnterTheInvalidPassword() {
        String invalidPassword = faker.internet().password();
        blueRentalCarsPages.userPassword.sendKeys(invalidPassword);

    }

    @And("User clicks login button")
    public void userClicksLoginButton() {

        blueRentalCarsPages.loginButton.click();
    }

    @And("User sees the alerttext")
    public void userSeesTheAlerttext() {
        Assert.assertTrue(blueRentalCarsPages.warningMessage.isDisplayed());


    }

    @And("User writes on consol the alerttext")
    public void userWritesOnConsolTheAlerttext() {
        String alertText = blueRentalCarsPages.warningMessage.getText();
        System.out.println("AlertText: " + alertText);
    }

    @And("Detects no user login")
    public void detectsNoUserLogin() {
        Assert.assertTrue(blueRentalCarsPages.loginButton.isDisplayed());
    }

    @And("user closes {string}")
    public void userCloses(String arg0) {
        Driver.quitDriver();
    }

    @And("User tries to enter {string}")
    public void userTriesToEnter(String invalidCredential) {
        blueRentalCarsPages.userEmail.sendKeys(invalidCredential);


    }

    @And("User tries to enter with {string}")
    public void userTriesToEnterWith(String invalidPass) {
        blueRentalCarsPages.userPassword.sendKeys(invalidPass);

    }
}

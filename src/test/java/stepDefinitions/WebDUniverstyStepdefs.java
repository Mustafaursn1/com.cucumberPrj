package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebPages;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Stack;

public class WebDUniverstyStepdefs {
    Actions actions = new Actions(Driver.getDriver());
    WebPages webPages = new WebPages();
    ArrayList<String> windows;
    String firstWindows;

    @Then("User goes the loginPortal")
    public void userGoesTheLoginPortal() {

        firstWindows = Driver.getDriver().getWindowHandle();

        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @And("User clicks loginPortal")
    public void userClicksLoginPortal() {
        webPages.loginPortal.click();

    }

    @And("User goes ohher Window")
    public void userGoesOhherWindow() {
        windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());


        Driver.getDriver().switchTo().window(windows.get(1));


    }

    @And("User enters Username to  box of  {string}")
    public void userEntersUsernameToBoxOf(String userName) {
        webPages.usernameBox.sendKeys(userName);


    }

    @And("User enters password to box of {string}")
    public void userEntersPasswordToBoxOf(String password) {
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("User clicks loginButton")
    public void userClicksLoginButton() {
        webPages.loginButton.click();
    }

    @And("User makes a test what writing is validation failed")
    public void userMakesATestWhatWritingIsValidationFailed() {
        String actualPopUpText = Driver.getDriver().switchTo().alert().getText();
        String expectedPopUpText = "validation failed";
        Assert.assertEquals(expectedPopUpText, actualPopUpText);
    }

    @And("User write ok and closes the PopUp")
    public void userWriteOkAndClosesThePopUp() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("user returns the first page")
    public void userReturnsTheFirstPage() {
        Driver.getDriver().switchTo().window(windows.get(0));


    }

    @And("User makes a test what user is on first page")
    public void userMakesATestWhatUserIsOnFirstPage() {

        String windowHandelsNummer = Driver.getDriver().getWindowHandle();
        System.out.println("WindowsHandlsUrl:" + windowHandelsNummer);
        Assert.assertEquals(windowHandelsNummer, firstWindows);

    }
}

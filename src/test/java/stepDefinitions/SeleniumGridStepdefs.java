package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGridStepdefs {

    WebDriver driver;


    @Given("user is on the application_url {string}")
    public void userIsOnTheApplication_url(String url) throws MalformedURLException {
       driver=new RemoteWebDriver(new URL("http://192.168.178.21:4444"),new EdgeOptions());

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get(url);






    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String titel) {
        String expectedTitel=titel;
        String actualTitel=driver.getTitle();
        Assert.assertEquals(expectedTitel,actualTitel);
        System.out.println("expected Titel:"+expectedTitel+"\n"+"actualTitel:"+actualTitel);



    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {


    }



    @Given("user is in fire fox on the application_url {string}")
    public void userIsInFireFoxOnTheApplication_url(String url) throws MalformedURLException {

        driver=new RemoteWebDriver(new URL("http://192.168.178.21:4444"),new ChromeOptions());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }
    }

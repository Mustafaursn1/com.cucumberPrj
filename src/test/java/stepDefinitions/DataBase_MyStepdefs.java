package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataBasePages;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;

public class DataBase_MyStepdefs {
     DataBasePages dataBasePages = new DataBasePages();
     Actions action=new Actions(Driver.getDriver());


    @Given("Kullanici {string}")
    public void kullanici(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty("dataBaseUrl"));


    }

    @Then("new butonuno basar")
    public void newButonunoBasar() {
        dataBasePages.newButton.click();


    }



    @And("soyisim bolumune{string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        dataBasePages.lastName.sendKeys(lastName);

    }

    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        dataBasePages.position.sendKeys(position);


    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        dataBasePages.extension.sendKeys(extension);


    }

    @And("startdate bolume {string} girer")
    public void startdateBolumeGirer(String startDate) {
        dataBasePages.startDate.sendKeys(startDate);



    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        dataBasePages.salary.sendKeys(salary);

    }

    @And("creat butonuna tiklar")
    public void creatButonunaTiklar() {
        dataBasePages.createButton.click();


    }

    @When("Kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataBasePages.searchButton.sendKeys(firstName, Keys.ENTER);


    }

    @Then("isim bolumunde {string} oldugunu dogrulur")
    public void isimBolumundeOldugunuDogrulur(String arg0) {

        Assert.assertFalse(dataBasePages.noMachName.isDisplayed());


    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {


        dataBasePages.firstName.sendKeys(firstName);
    }

    @And("ofis bilgisi {string} girilir")
    public void ofisBilgisiGirilir(String ofisBilgisi) {
        dataBasePages.ofisBilgisi.sendKeys(ofisBilgisi);

    }
}

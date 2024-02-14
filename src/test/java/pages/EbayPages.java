package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class EbayPages {
    public EbayPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()='Electronics'])[2]")
    public WebElement electronict;

    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement searchBox;
    @FindBy(xpath = "//div[@class='srp-controls__control srp-controls__count']")
    public WebElement resultText;
    @FindBy(xpath = "//*[text()='Einloggen']")
    public WebElement einLogin;
    @FindBy(xpath = "//*[@id='userid']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement passwortBox;
    @FindBy(xpath = "//*[@id='get-user-intro-sub-header']")
    public WebElement textOfInvalidUser;

    @FindBy(xpath = "//*[@id='gdpr-banner-decline']")
    public WebElement cookies;

}

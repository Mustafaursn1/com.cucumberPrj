package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPages {

    public BlueRentalCarsPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginText;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement userEmail;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement userPassword;

    @FindBy(xpath = "//button[text()=' Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class=' Toastify__toast-body']")
    public WebElement warningMessage;



}

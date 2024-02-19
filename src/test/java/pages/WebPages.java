package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebPages {

    public WebPages() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortal;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passBox;
    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;

}

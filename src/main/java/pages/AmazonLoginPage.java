package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {

	WebDriver driver = null ;
	
    @FindBy(id = "ap_email")
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    private WebElement passwordTextBox;

    @FindBy(xpath="//input[@id=\"signInSubmit\"]")
    private WebElement signInButton;

    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLoginEmail(String emailId) {
        emailTextBox.sendKeys(emailId);
    }

    public void enterLoginPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}

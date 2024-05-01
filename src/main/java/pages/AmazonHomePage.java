package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebElement element = null;
    WebDriver driver = null;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }   
    
    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;
    
    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;
    
    @FindBy(linkText="Apple iPhone 15 (128 GB) - Black")
    public WebElement product;
    
    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);     
    }
    
    public void clickSearchButton() {
        searchButton.click();
    }
    
    public void clickOnProduct() {
        product.click();
    }
}

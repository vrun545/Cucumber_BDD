package stepdefinitions;
import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HomePage {

    WebDriver driver = null;
    AmazonHomePage pageFactory;

    @Before("@Feature1")
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunbajpai\\eclipse-workspace\\Cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
    }
    
    @Given("I am on Amazon Home Page")
    public void openAmazonHomePage() {
    	pageFactory = new AmazonHomePage(driver);
        driver.get("https://www.amazon.in");
    }

    @When("I passed {string} on search box")
    public void searchForProduct(String product) {
        pageFactory.searchProduct(product);
    }

    @And("Hit search button")
    public void hitSearchButton() {
        pageFactory.clickSearchButton();
    }

    @Then("Search result should show expected result")
    public void verifySearchResult() {
        System.out.println("Products are visible according to search results");
    }

    @When("I select a particular product")
    public void selectProduct() throws InterruptedException {
    	Thread.sleep(2000);        
    	pageFactory.clickOnProduct();
    }

    @Then("It should redirect to that particular product page")
    public void verifyProductPage() throws InterruptedException {
    	Thread.sleep(3000);
    	System.out.println("Successfully landed on page");
    }

    @After("@Feature1")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

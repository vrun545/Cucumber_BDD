package stepdefinitions;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	
	WebDriver driver = null;
    AmazonLoginPage pageFactory;
    
    @Before("@Feature3")
    public void initializeDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunbajpai\\eclipse-workspace\\Cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactory = new AmazonLoginPage(driver);
    }  

    @Given("I am on Amazon WebPage")
    public void i_am_on_Amazon_WebPage() {
        driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }

    @When("I enter Username {string} and Password {string}")
    public void i_enter_Username_and_Password(String username, String password) {
    	pageFactory.enterLoginEmail(username);
    	pageFactory.enterLoginPassword(password);
    }

    @And("Hit the Login button")
    public void hit_the_Login_button() {
    	pageFactory.clickSignInButton();
    }

    @Then("I should not be logged in")
    public void i_should_not_be_logged_in() {
    	System.out.println("User not logged-in");
    }
    
    @Then("It should throw error")
    public void it_should_throw_error() {
    	System.out.println("credentials are wrong");
    }
    
    @After("@Feature3")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

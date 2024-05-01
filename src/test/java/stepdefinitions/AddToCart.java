package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.AmazonAddToCart;


public class AddToCart {

	WebDriver driver = null;
	AmazonAddToCart pageFactory;

    @Before("@Feature2")
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunbajpai\\eclipse-workspace\\Cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
	@Given("I am on the Product Page")
	public void i_am_on_the_product_page() {
		pageFactory = new AmazonAddToCart(driver);
		String url = pageFactory.getProductLink();
		driver.get(url);
	}

	@When("I hit the add to cart button")
	public void i_hit_the_add_to_cart_button() {
		pageFactory.clickAddToCart();
	}

	@Then("Proceed to Checkout page will appear")
	public void proceed_to_checkout_page_will_appear() {
		System.out.println("Proceed to checkout appear");
	}

	@When("I hit Proceed to Checkout button")
	public void i_hit_proceed_to_checkout_button() {
	    pageFactory.clickOnProceed();
	}
	
	@Then("Product should add to the cart")
	public void product_should_add_to_the_cart() {
	    System.out.println("Item added successfully");
	}
	
	@After("@Feature2")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

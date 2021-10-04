package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.ProductListing;


public class Steps {
	WebDriver driver;
	HomePage home;
	ProductListing productListing;
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David-Net Engineer\\Documents\\Chrome Driver 93\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://aspiration.com/");
	}
	
	@When("^user clicks on spend & save$")
	public void user_clicks_on_spend_save() {
		home = new HomePage (driver);
		home.select_SpendSave();
		
	}
	
	@Then("^user moves to product listing$")
	public void user_moves_to_product_listing() {
		productListing = new ProductListing(driver);
		productListing.original_Plan();
		productListing.plus_Plan();
		
	}
	
	@When("^user clicks on get aspiration$")
	public void user_clicks_on_get_aspirations() {
		productListing.get_Asipration();
		productListing.mod_Email();
	}
	
	@When("^user clicks on get aspiration plus$")
	public void user_clicks_on_get_aspiration_plus() {
		productListing.get_ApsirationPlus();
		productListing.monthly_Plan();
		productListing.yearly_Plan();
	}
	
	
	
	
	
	

}

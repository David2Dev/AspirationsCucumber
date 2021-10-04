package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	
	public void navigateTo_HomePage() {
		driver.get("https://aspiration.com");
	}
	

	
	@FindBy(linkText = "Spend & Save")
	private WebElement lnktxt_SpendSave;
	
	
	public void select_SpendSave() {
		lnktxt_SpendSave.click();
		System.out.println("Landed on product Page ");
		
		
	}
	
	

}

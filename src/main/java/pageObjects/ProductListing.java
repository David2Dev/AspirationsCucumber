package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


public class ProductListing {
	
	WebDriver driver;
	
	public ProductListing(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = "plan plan-original")
	private WebElement oriPlan; 
	
	@FindBy (className = "plan plan-a-plus")
	private WebElement plusPlan;
	
	/*
	 * 	public void select_SpendSave() {
		lnktxt_SpendSave.click();
		System.out.println("Landed on product Page ");
		
		
	}
 
	 */
	
	
	
	public void original_Plan() {
		
		Boolean isOriPlan = driver.findElements(By.className("plan plan-original")).size() > 0;
		
		if (isOriPlan) {
			System.out.println("User can view Original Plan");
		}
		else {
			System.out.println("User cannot view Original Plan");
		}
		
	
		
	}
	
	public void plus_Plan() {
		Boolean isPlusPlan = driver.findElements(By.className("plan plan-a-plus")).size() > 0;
		
		if (isPlusPlan) {
			System.out.println("User can view Plus Plan");
		}
		else {
			System.out.println("User cannot view Plus Plan");
		}
		
	}
	
	@FindBy (xpath = "//*[@id=\\\"join-waitlist-input\\\"]")
	private WebElement aspirOrign;
	
	public void get_Asipration() {
		aspirOrign.click();
		System.out.println("Get Aspiration button clicked");
	}
	
	@FindBy (xpath = "//*[@id=\"join-waitlist-input\"]")
	private WebElement modEmail;
	
	public void mod_Email() {
		Boolean isModEmail = driver.findElements(By.xpath("//*[@id=\"join-waitlist-input\"]")).size() > 0;
		
		if (isModEmail) {
			System.out.println("User can view modal with email address to sign up");
		}
		else {
			System.out.println("modal not showing for user to sign up with email");
		}
	}
	
	@FindBy (xpath = "//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/button")
	private WebElement aspirPlus;
	
	public void get_ApsirationPlus() {
		aspirPlus.click();
		Boolean isYrPlans = driver.findElements(By.xpath("/html/body/div[1]/div/div/div")).size() > 0;
		
		if (isYrPlans) {
			System.out.println("User can view modal with Subscription plans");
		}
		else {
			System.out.println("User cannot view modal with Subscription plans");
		}
		
	}
	
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]/p")
	private WebElement yearlyPay;
	
	public void yearly_Plan() {
		Boolean isYearlyPay = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/p")).size() > 0;
		
		if (isYearlyPay) {
			System.out.println("Yearly radio option is 71.88 paid once yearly");
		}
		else {
			System.out.println("Yearly radio option not displaying correctly");
		}
	}
	
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/p")
	private WebElement monthlyPlan;
	
	public void monthly_Plan() {
		Boolean isMonthlyPay = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p")).size() > 0;
		
		if (isMonthlyPay) {
			System.out.println("Monthly radio option is 7.99 once monthly");
		}
		else {
			System.out.println("Monthly radio option is not displaying correctly");
		}
		
	}
	
	
	

}

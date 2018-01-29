package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public WebDriver driver;

	@FindBy(id="account")
	public WebElement MyAccount;
	
	@FindBy(linkText="Your Account")
	public WebElement footerYourAccount;
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
		
	}
}

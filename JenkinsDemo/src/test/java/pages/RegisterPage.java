package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	public WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	@FindBy(id="user_login")
	public WebElement user;
	
	@FindBy(id= "user_email")
	public WebElement email;
	
	
}

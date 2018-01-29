package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@name='log']")
	public WebElement username;
	
	@FindBy(id="pwd")
	public WebElement password;
	
	@FindBy(name="submit")
	public WebElement login;
	
	@FindBy(linkText="Register")
	public WebElement register;
	
	
	public void accountlogin(){
		
		utility.Highlighter.elementHighlight(driver, username);
		username.sendKeys(DataProviderFactory.getExcel().getData(0, 3, 0));
		
		utility.Highlighter.elementHighlight(driver, password);
		password.sendKeys(DataProviderFactory.getExcel().getData(0, 3, 1));
		
		utility.Highlighter.elementHighlight(driver, login);
		login.click();
				
	}
	
	public void loginToSite(String username_creds, String pwd){
		
		utility.Highlighter.elementHighlight(driver, username);
		username.sendKeys(username_creds);
		
		utility.Highlighter.elementHighlight(driver, password);
		password.sendKeys(pwd);
		
		login.click();
		
	}
	

}

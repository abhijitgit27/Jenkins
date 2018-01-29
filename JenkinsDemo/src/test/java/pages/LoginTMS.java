package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class LoginTMS {
	
	public WebDriver driver;

	@FindBy(id="username")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="btnSubmit")
	public WebElement Login_Btn;
	
	
	public LoginTMS(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void tms_account_login(){
		
		// fetching data from excel for username field
		utility.Highlighter.elementHighlight(driver, UserName);
		UserName.sendKeys(DataProviderFactory.getExcel().getData(0, 0, 0));

		
		// fetching data from excel for username field
		utility.Highlighter.elementHighlight(driver, Password);
		Password.sendKeys(DataProviderFactory.getExcel().getData(0, 0, 1));
		
		utility.Highlighter.elementHighlight(driver, Login_Btn);
		Login_Btn.click();
		
		
		
	}
}

package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import factory.DataProviderFactory;

public class SignIn {
	
	public WebDriver driver;
	
	public SignIn(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	@FindBy(name="loginid")
	public WebElement clientID;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath=".//span[@title='Click here to show/hide password']")
	public WebElement eyeIcon;
	
	@FindBy(linkText="Forgot Password ?")
	public WebElement forgot_Pwd_Link;
	
	@FindBy(xpath=".//button[text()='SIGN IN']")
	public WebElement signIn_btn;
	
	@FindBy(linkText="Click Here")
	public WebElement click_Here;
	
	public void mf_web_login(){
		
		// fetching data from excel for clientID field
		
		utility.Highlighter.elementHighlight(driver, clientID);
		clientID.clear();
		clientID.sendKeys(DataProviderFactory.getExcel().getData(1, 2, 0));
		
		utility.Highlighter.elementHighlight(driver, password);
		password.clear();
		password.sendKeys(DataProviderFactory.getExcel().getData(1, 2, 1));
		
		utility.Highlighter.elementHighlight(driver, eyeIcon );
		eyeIcon.click();
		
		utility.Highlighter.elementHighlight(driver, signIn_btn);
		signIn_btn.click();
	}
	
	
}

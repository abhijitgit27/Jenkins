package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class SignUp {

	
	public WebDriver driver;
	
	public SignUp(WebDriver driver){
		
		this.driver= driver;
	}
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="mobileNo")
	public WebElement mobile_no;
	
	@FindBy(name="dob")
	public WebElement dob;
	
	@FindBy(name="panNo")
	public WebElement pan_no;
	
	@FindBy(name="ReferralCode")
	public WebElement referral_code;
	
	@FindBy(id="isCheck")
	public WebElement checkbox;
	
	@FindBy(partialLinkText="terms")
	public WebElement clickHere;
	
	//.//*[text()='Continue']
	@FindBy(xpath=".//button[@type='submit']")
	public WebElement Continue_btn;
	
	public void setUserDetails() throws InterruptedException{
		
		email.clear();
		utility.Highlighter.elementHighlight(driver, email);
		email.sendKeys(DataProviderFactory.getExcel().getData(1, 6, 0));
		Thread.sleep(2000);
		
		mobile_no.clear();
		utility.Highlighter.elementHighlight(driver, mobile_no);
		mobile_no.sendKeys(DataProviderFactory.getExcel().getData(1, 6, 1));
		Thread.sleep(2000);
		
		dob.clear();
		utility.Highlighter.elementHighlight(driver, dob);
		dob.sendKeys(DataProviderFactory.getExcel().getData(1, 6, 2));
		Thread.sleep(2000);
		
		pan_no.clear();
		utility.Highlighter.elementHighlight(driver, pan_no);
		pan_no.sendKeys(DataProviderFactory.getExcel().getData(1, 6, 3));
		Thread.sleep(2000);
		
		referral_code.clear();
		utility.Highlighter.elementHighlight(driver, referral_code);
		referral_code.sendKeys(DataProviderFactory.getExcel().getData(1, 6, 4));
		Thread.sleep(2000);
		
		utility.Highlighter.elementHighlight(driver, checkbox);
		checkbox.click();
		Thread.sleep(2000);
		
		//need to handle click here link which opens in another tab
		
		utility.Highlighter.elementHighlight(driver, Continue_btn);
		Continue_btn.click();
		
		
		
	}
}

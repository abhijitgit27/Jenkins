package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Aadhaarcard_OTP 
{
	public WebDriver driver;
	
	public  Aadhaarcard_OTP(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="aadhaarNo")
	public WebElement Aadhaarcard_Number;
	
	@FindBy(xpath=".//*[@id='SignUpaadhar']/div[2]/button")
	public WebElement GenerateOTP_Button;
	
	@FindBy(partialLinkText="Skip")
	public WebElement SKIP_Button;
		
}

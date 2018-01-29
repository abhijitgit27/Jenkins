package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ESign_OTP 
{
	public WebDriver driver;
	
	public  ESign_OTP(WebDriver driver)
	{
		this.driver=driver;
	} 
	
	@FindBy(className="green-button btn btn-success font14 width-left49 p-tb-15")
	public WebElement Yes_Button;
	
	@FindBy(name="aadhaarNo")
	public WebElement Aadhaarcard_Number;
	
	@FindBy(className="btn btn-outline-default font14 mb20 width100")
	public WebElement Generate_OTP;
	
	@FindBy(className="green-clr")
	public WebElement Skip_Button;
	
	@FindBy(xpath=".//*[@id='SignUpaadharotp']/div[3]/a")
	public WebElement Resend_OTP;
	
	@FindBy(id="form1")
	public WebElement Enter_OTPLine;
	
	@FindBy(xpath=".//*[@id='SignUpaadharotp']/div[12]/a")
	public WebElement Exit_button;
	
	@FindBy(className="green-button btn btn-success font14 width-right49 p-tb-15")
	public WebElement No_Button;
	
	@FindBy(xpath=".//*[@id='SignUpaadharotp']/div[11]/button")
	public WebElement Continue_Button;
	
	
}
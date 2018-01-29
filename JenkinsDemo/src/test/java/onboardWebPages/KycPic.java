package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KycPic

{
	public WebDriver driver;
	
	public  KycPic(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@id='kycphoto']/div/div/a/i")
	public WebElement Upload_arrow;
	
	@FindBy(xpath=".//*[@id='kycphoto']/div/div/span")
	public WebElement Upload_Text;
	
	@FindBy(xpath=".//*[@id='kycphoto']/div/span[2]/button")
	public WebElement Click_button;
	
	@FindBy(xpath=".//*[@id='kycphoto']/div/span[3]/button")
	public WebElement Reset_button;
	
	@FindBy(xpath=".//*[@id='kycphoto']/div/span[2]/button")
	public WebElement OK_button;
	
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/div/div/div/div/div/a")
	public WebElement Exit_button;
	
	
	
	
	
	
	

}

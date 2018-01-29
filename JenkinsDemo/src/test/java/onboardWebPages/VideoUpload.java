package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoUpload 
{
	public WebDriver driver;
	
	public  VideoUpload(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@id='KycVideo']/div[6]/button[2]")
	public WebElement Fullscreen_button;
	
	@FindBy(xpath=".//*[@id='kycvideo']/div/div[2]/a/i")
	public WebElement Upload_arrow;

	@FindBy(xpath=".//*[@id='kycvideo']/div/div[2]/span")
	public WebElement click_Upload;
	
	@FindBy(xpath=".//*[@id='kycvideo']/div/div[4]/button")
	public WebElement continue_button;
	
	@FindBy(xpath=".//*[@id='kycvideo']/div/div[5]/a")
	public WebElement Exit_button;
	
	
	

	
	
	
	
}

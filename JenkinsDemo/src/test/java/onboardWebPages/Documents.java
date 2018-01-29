package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Documents 
{
	public WebDriver driver;
	
	public  Documents(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="nomproof")
	public WebElement Address_proof;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[2]/div[3]/a/i")
	public WebElement Upload_arrow;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[3]/div/a/i")
	public WebElement cancle_check;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[4]/div/a/i")
	public WebElement PAN_Card;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[5]/div/a/i")
	public WebElement User_Pic;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[6]/div/a/i")
	public WebElement User_sign;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[7]/div/button")
	public WebElement Next_Button;
	
	@FindBy(xpath=".//*[@id='documentsScreen']/div/div[8]/a")
	public WebElement Exit_Button;
	
	@FindBy(xpath=".//*[@id='SignUpnominee']/div/div/button")
	public WebElement Lets_Invest;
		
}


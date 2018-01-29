package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopFunds
{
	public WebDriver driver;
	
	public TopFunds(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/a")
	public WebElement Top_Funds;
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[1]/a")
	public WebElement Tax_SavingsELSS;
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[2]/a")
	public WebElement Multicap_Funds;

	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[3]/a")
	public WebElement Liquid_Funds;
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[4]/a")
	public WebElement LargeCap_Funds;
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[5]/a")
	public WebElement SmallCap_Funds;
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[2]/ul/li[6]/a")
	public WebElement MidCap_Funds;
	
	
}
	

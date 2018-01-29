package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class App
{
	public WebDriver driver;
	
	public App(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[5]/a")
	public WebElement App;
}
	
package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blogs
{
	public WebDriver driver;
	
	public Blogs(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=".//*[@id='homemenu']/nav/ul/li[4]/a")
	public WebElement Blogs;
	
}
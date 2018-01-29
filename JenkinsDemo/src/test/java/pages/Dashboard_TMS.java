package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_TMS {
	
public WebDriver driver;
	
	public Dashboard_TMS(WebDriver driver){
		
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[contains(text(),'DashBoard')]")
	public WebElement Dashboard_text;
	
	

}

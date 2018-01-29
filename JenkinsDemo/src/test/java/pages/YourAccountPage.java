package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class YourAccountPage {
	
	public WebDriver driver;
	
	public YourAccountPage(WebDriver driver){
		
		this.driver = driver;	
	}
	
	@FindBy(xpath="//td[@colspan='4']")
	public WebElement transc_msg;
	
	public String getTranscMsg(){
		
		utility.Highlighter.elementHighlight(driver, transc_msg);
		return transc_msg.getText();
	}

}

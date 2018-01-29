package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;

public class BrokenLinksVerification {

	WebDriver driver;
	
	@Test
	
	public void brokenLinks(){
		
		driver= BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().geturl());
		utility.VerifyBrokenLinks.getAllLinks_OnPage(driver);
		utility.VerifyBrokenLinks.verifyLinkActive("https://investicastaging.choicebroking.in/");
		
	}
}

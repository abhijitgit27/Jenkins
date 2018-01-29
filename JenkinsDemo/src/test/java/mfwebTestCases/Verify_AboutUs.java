package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.AboutUs;
import mfwebPages.TopNav;

public class Verify_AboutUs {

	WebDriver driver;
	Actions act;
	
	@Test
	
	public void verify_Team_readMore(){
		
		try{
			
			driver= BrowserFactory.getBrowser("chrome");
			driver.get(DataProviderFactory.getConfig().geturl());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			TopNav topNav_obj= PageFactory.initElements(driver, TopNav.class);
			topNav_obj.About_Us.click();
			
			AboutUs aboutUs_obj = PageFactory.initElements(driver, AboutUs.class);
			aboutUs_obj.navigateToBoardOfDirectors();
			
		    
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	
	public void tearDown(){
		
		driver.quit();
		
	}
	
	
}

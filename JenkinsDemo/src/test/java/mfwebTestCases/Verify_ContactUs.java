package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.ContactUS;
import mfwebPages.TopNav;
import utility.HelperClass;

public class Verify_ContactUs {

	WebDriver driver;
	Actions act ;
	
	@Test
	
	public void verify_reqd_contactUs_validations(){
		
		try{
			
			driver= BrowserFactory.getBrowser("chrome");
			driver.get(DataProviderFactory.getConfig().geturl());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			TopNav topNav_obj= PageFactory.initElements(driver, TopNav.class);
			topNav_obj.Contact_Us.click();
			
			ContactUS contactUs_obj = PageFactory.initElements(driver, ContactUS.class);
			//scrolling till sen message button
			HelperClass.scrollIntoView(driver, contactUs_obj.send_message_button);
			Thread.sleep(2000);
			contactUs_obj.send_message_button.click();
			contactUs_obj.get_validation_messages();
		    
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	} 
	
	
	@Test
	public void verify_ContactUs_Submission(){
         
		try{
			
			driver= BrowserFactory.getBrowser("chrome");
			driver.get(DataProviderFactory.getConfig().geturl());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			TopNav topNav_obj= PageFactory.initElements(driver, TopNav.class);
			topNav_obj.Contact_Us.click();
			
			ContactUS contactUs_obj = PageFactory.initElements(driver, ContactUS.class);
			contactUs_obj.setContactUsData_Guest();
			//scrolling till send message button
			HelperClass.scrollIntoView(driver, contactUs_obj.send_message_button);
			Thread.sleep(2000);
			contactUs_obj.send_message_button.click();
		
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

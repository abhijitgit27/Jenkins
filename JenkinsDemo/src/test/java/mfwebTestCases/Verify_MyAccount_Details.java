package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.MyProfile;
import mfwebPages.SignIn;
import mfwebPages.TopNav;
import onboardWebPages.MyAccount;

public class Verify_MyAccount_Details {

	WebDriver driver;
	
	@Test
	
	public void verify_Myaccount_Details(){
		
		try{
			
			driver= BrowserFactory.getBrowser("chrome");
			driver.get(DataProviderFactory.getConfig().geturl());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
			myAccountObj.navigateSignIn();
			
			SignIn signInObj = PageFactory.initElements(driver, SignIn.class);
			signInObj.mf_web_login();
			
			Thread.sleep(2000);
			//logged in and on dashboard page
			
			TopNav topNav_obj = PageFactory.initElements(driver, TopNav.class);
			topNav_obj.navigate_myProfile();
			
			//PageFactory.initElements(driver, page);
			
			MyProfile myProfile_obj =PageFactory.initElements(driver, MyProfile.class);
			myProfile_obj.getMyProfileDetails();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}

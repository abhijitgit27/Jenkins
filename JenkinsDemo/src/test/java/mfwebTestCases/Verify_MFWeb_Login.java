package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.SignIn;
import onboardWebPages.MyAccount;

public class Verify_MFWeb_Login {
	
	WebDriver driver;
	
	@Test
	
	public void login_Mf_Web_login(){
		
		driver= BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().geturl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
		myAccountObj.navigateSignIn();
		
		SignIn signInObj = PageFactory.initElements(driver, SignIn.class);
		signInObj.mf_web_login();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
				
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}

package ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.YourAccountPage;

public class LoginToSite {
	
	WebDriver driver;

	@Test(dataProvider="logincredentials")
	public void login_to_site(String username, String password){
		
		/*
		   note :above String username and String password was passed to make realation between data from dataprovider and logintoSite(parameterised data method)
		
		   note : username ,password should be passed in same sequence as passed from dataprovider
		   
		   number of columns should match the the number of above string parameters passed
		   
		    */
		
		
		driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().geturl());
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		utility.Highlighter.elementHighlight(driver, home.MyAccount);
		
		home.MyAccount.click();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginToSite(username, password);
		
		//verification
		
		YourAccountPage account =PageFactory.initElements(driver, YourAccountPage.class);
		
		String tranc_msg_display= account.getTranscMsg();
		
		Assert.assertTrue(tranc_msg_display.contains("transactions for this month"));
		
		
		
	}
	
	//after method to close browser window after every loop
	@AfterMethod
	public void tearDown(){
		BrowserFactory.closeBrowser();
	}
	
	
	@DataProvider(name = "logincredentials")
	public Object[][] getLoginData(){
		
		//declaring array
		Object[][] loginData = new Object[2][2];
		
		//initialising array
		
		//1st row 1st column
		loginData[0][0] = "username1";
		
		//1st row 2nd column
		loginData[0][1] = "123456";
		
		//2nd row 1st column
		loginData[1][0] = "test20160";
		loginData[1][1]= "12345678";
		
		//will need to return the data to method
		return loginData;
				
		
	}
	
	
}

package ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.YourAccountPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class LoginToSiteUsingExcel {
	
	WebDriver driver;
	
@Test(dataProvider="logincredsadvance")
public void login_to_site(String username, String password){
		
		/*
		   note :above String username and String password was passed to make relation between data from dataprovider and logintoSite(parameterised data method)
		
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
	
    @DataProvider(name="logincredsadvance")
	public Object[][] getLoginDataAdvance(){
		
		//row changes but column is constant ie equal to fields passed
		
		//get rowCount using ExcelData where 0 is sheet index in getRowCount method
		int rowCount = DataProviderFactory.getExcel().getRowCount(0);
		
		//row changes but column is constant ie equal to fields passed
		Object[][] loginData = new Object[rowCount][2];
		
		//for loop for reading data from excel rows
		for(int i=0; i<rowCount; i++){
			
			//row will be i but column will be 0, sheet index 0
			
			//this will provide data displayed in column0 ie eg username
			loginData[i][0]= DataProviderFactory.getExcel().getData(0, i, 0);
			
			//this will provide data displayed in column1 ie eg password
			loginData[i][1] = DataProviderFactory.getExcel().getData(0, i, 1);
			
			//note: repeat above statement if data column are more eg column2 id 3 columns and make new Object[rowCount][3]
			
			
		}
		
		return loginData;
		
	}
    
    @AfterMethod
    public void tearDown(){
    	
    	BrowserFactory.closeBrowser();
    }
	
}
	

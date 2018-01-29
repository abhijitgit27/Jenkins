package mfwebTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.MyTransactions;
import mfwebPages.SignIn;
import mfwebPages.TopNav;
import onboardWebPages.MyAccount;
import utility.HandleTable;

public class Verify_MyTransactions {
	
	WebDriver driver;
	
	@Test
	
	public void verify1(){
		
		try{
			
			driver= BrowserFactory.getBrowser("chrome");
			driver.get(DataProviderFactory.getConfig().geturl());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//initialising My account objects and navigating to sign in page
			MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
			myAccountObj.navigateSignIn();
			
			//initialising sign in objects and log in to account
			SignIn signInObj = PageFactory.initElements(driver, SignIn.class);
			signInObj.mf_web_login();
			Thread.sleep(2000);
			
			//initialising top nav objects and navigating to my transactions
			TopNav top_nav_obj = PageFactory.initElements(driver, TopNav.class);
			top_nav_obj.navigate_myTransactions();
			Thread.sleep(2000);
			
			MyTransactions my_Transcations_obj = PageFactory.initElements(driver, MyTransactions.class);
			my_Transcations_obj.get_MyTransactions_Data();
			Thread.sleep(2000);
			
			//find column which you need to search the data
			List<WebElement> OrderNo = driver.findElements(By.xpath(".//div[@class='segment-table']/table/tbody/tr/td[2]"));
			
			//method matches orderid in orderNo column of Transactions page
			HandleTable.get_Data_of_Column(driver, OrderNo, "16913053");
			
			//method matches orderid in orderNo column of Transactions page from excel data
			HandleTable.get_Data_of_Column(driver, OrderNo, DataProviderFactory.getExcel().getData(1, 102, 1));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	/*@Test
	
	public void verify2(){
		
	}*/
	
	@AfterTest
	
	public void tearDown(){
		
		driver.quit();
		
	}

}

package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import onboardWebPages.AddressDetails;
import onboardWebPages.BankDetails;
import onboardWebPages.BasicDetails;
import onboardWebPages.MyAccount;
import onboardWebPages.Nominee;
import onboardWebPages.SignUp;

public class Verify_MFWeb_Onboard {

	WebDriver driver;
	
	@Test
	
	public void Onboard_Mf_Web() throws Exception{
		
		driver= BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().geturl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
		myAccountObj.navigateSignUp();
		
		SignUp signUpobj= PageFactory.initElements(driver, SignUp.class);
		signUpobj.setUserDetails();
		Thread.sleep(2000);
		
		BasicDetails basic_details_obj= PageFactory.initElements(driver, BasicDetails.class);
		basic_details_obj.verifyBasicDetailsPancard("GEETA MUKUL AHUJA","DINESH KUMAR SAJNANI","19/02/1985","CJYPS4126C");
		
		basic_details_obj.set_remainig_Basic_Details();

		
		AddressDetails address_details_obj= PageFactory.initElements(driver, AddressDetails.class);
		address_details_obj.verifySignUpAddress();
		address_details_obj.setupCurrentAddress();
		
		Nominee nominee_obj= PageFactory.initElements(driver, Nominee.class);
		//for setting nominee details of non-minor
		/*nominee_obj.setNomineeDetails();
		            or
		for setting nominee details of minor*/
		nominee_obj.setNomineeDetailsMinor();
		
		BankDetails bankDetails_obj = PageFactory.initElements(driver, BankDetails.class);
		bankDetails_obj.setBankDetails_Manual_Currentcount();
		
		
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.close();
	}
}

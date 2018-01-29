package mfwebTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import mfwebPages.CreateNewPassword;
import mfwebPages.ForgotPassword;

public class Verify_MFForgot_Password {

	WebDriver driver;
	
	/*
	@Test
	
	public void verify_invalid_clientId_forgotpwd() throws InterruptedException{
		
		driver = BrowserFactory.getBrowser("chrome");
	    driver.get("https://investica.choicebroking.in/forget");
		//driver.get(DataProviderFactory.getConfig().geturl());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
	    myAccountObj.navigateSignIn();
	
	    SignIn signIn_obj= PageFactory.initElements(driver, SignIn.class);
	    signIn_obj.forgot_Pwd_Link.click();
	     
	    ForgotPassword forgot_pwd_obj = PageFactory.initElements(driver, ForgotPassword.class);
	    forgot_pwd_obj.generate_Otp_ClientID_invalid();
	    Thread.sleep(3000);
	    String invalid_clientId_text = forgot_pwd_obj.getUserNotFound();
	    Assert.assertEquals(invalid_clientId_text, DataProviderFactory.getExcel().getData(1, 66, 1));
	    System.out.println(invalid_clientId_text);
	    forgot_pwd_obj.info_popup_Ok.click();
	    
	    
	}*/
	
	/*
	@Test
	public void verify_invalid_pan_forgotpwd() throws InterruptedException{
		
		driver = BrowserFactory.getBrowser("chrome");
	    driver.get("https://investica.choicebroking.in/forget");
		//driver.get(DataProviderFactory.getConfig().geturl());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   /* MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
	    myAccountObj.navigateSignIn();
	
	    SignIn signIn_obj= PageFactory.initElements(driver, SignIn.class);
	    signIn_obj.forgot_Pwd_Link.click();
	     
	    ForgotPassword forgot_pwd_obj = PageFactory.initElements(driver, ForgotPassword.class);
	    forgot_pwd_obj.generate_Otp_Panno_invalid();
	    Thread.sleep(5000);
	    String invalid_panID_text = forgot_pwd_obj.getUserNotFound();
	    Assert.assertEquals(invalid_panID_text, DataProviderFactory.getExcel().getData(1, 67, 1));
	    System.out.println(invalid_panID_text);
	    forgot_pwd_obj.info_popup_Ok.click();
	    
	    
	}

  
	
	@Test
	
	public void verify_clientId_forgotpwd() throws InterruptedException{
		
		driver = BrowserFactory.getBrowser("chrome");
	    driver.get("https://investica.choicebroking.in/forget");
		//driver.get(DataProviderFactory.getConfig().geturl());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   /* MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
	    myAccountObj.navigateSignIn();
	
	    SignIn signIn_obj= PageFactory.initElements(driver, SignIn.class);
	    signIn_obj.forgot_Pwd_Link.click();
	     
	    ForgotPassword forgot_pwd_obj = PageFactory.initElements(driver, ForgotPassword.class);
	    forgot_pwd_obj.generate_Otp_ClientID_valid();
	    Thread.sleep(3000);
	    String popup_otp_success_text = forgot_pwd_obj.verify_popupmessage_generate_Otp_ClientID();
	    Assert.assertEquals(popup_otp_success_text, DataProviderFactory.getExcel().getData(1, 70, 1));
	    System.out.println(popup_otp_success_text);
	    forgot_pwd_obj.info_popup_Ok.click();
	    
	    
	}
	
        */
	
	@Test
	
	public void verify_pannumber_forgotpwd() throws InterruptedException{
		
		driver = BrowserFactory.getBrowser("chrome");
	    driver.get("https://investica.choicebroking.in/forget");
		//driver.get(DataProviderFactory.getConfig().geturl());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   /* MyAccount myAccountObj= PageFactory.initElements(driver, MyAccount.class);
	    myAccountObj.navigateSignIn();
	
	    SignIn signIn_obj= PageFactory.initElements(driver, SignIn.class);
	    signIn_obj.forgot_Pwd_Link.click();*/
	     
	    ForgotPassword forgot_pwd_obj = PageFactory.initElements(driver, ForgotPassword.class);
	    forgot_pwd_obj.generate_Otp_Panno_valid();
	    Thread.sleep(5000);
	    String valid_panNumber_text = forgot_pwd_obj.verify_popupmessage_generate_Otp_ClientID();
	    Assert.assertEquals(valid_panNumber_text, DataProviderFactory.getExcel().getData(1, 71, 1));
	    System.out.println(valid_panNumber_text);
	    forgot_pwd_obj.info_popup_Ok.click();
	    
	    Thread.sleep(120000);
	    
	    //hold fold 3 mins to get otp and manually set otp in data sheet in location mentioned in set otp fields
	    
	    forgot_pwd_obj.set_Otp_fields();
	    
	    String otp_verification_success_text = forgot_pwd_obj.verify_popupmessage_generate_Otp_ClientID();
	    System.out.println(otp_verification_success_text);
	    Assert.assertEquals(otp_verification_success_text, DataProviderFactory.getExcel().getData(1, 72, 1));
	    Actions act = new Actions(driver);
	    act.moveToElement(forgot_pwd_obj.info_popup_Ok).click();
	    System.out.println("clicked");
	    //forgot_pwd_obj.button_x.click();
	    
	    //forgot_pwd_obj.info_popup_Ok.click();
	    
	    CreateNewPassword createnewpwd_obj= PageFactory.initElements(driver, CreateNewPassword.class);
	    createnewpwd_obj.setChangePassword();
	    
	    Thread.sleep(2000);
	    
	    String password_change_success = forgot_pwd_obj.verify_popupmessage_generate_Otp_ClientID();
	    System.out.println(password_change_success);
	    Assert.assertEquals(password_change_success, DataProviderFactory.getExcel().getData(1, 73, 1));
	    //act.moveToElement(forgot_pwd_obj.info_popup_Ok).keyDown(Keys.ENTER);
	    forgot_pwd_obj.button_x.click();
	    
	    System.out.println("clicked"); 
	    //forgot_pwd_obj.info_popup_Ok.click();
	    
	    Thread.sleep(2000);
	    
	        
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

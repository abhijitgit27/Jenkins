package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class ForgotPassword {

	public WebDriver driver;
	
	public ForgotPassword(WebDriver driver){
		
		this.driver = driver;
	}
	
	@FindBy(id= "username")
	public WebElement ClientID;
	
	@FindBy(id ="panNo")
	public WebElement PanNumber ;
	
	@FindBy(xpath=".//button[text()='GENERATE OTP']")
	public WebElement Generate_OTP ;
	
	@FindBy(xpath= ".//button[text()='Ok']")
	public WebElement info_popup_Ok;
	
	@FindBy(className= "close")
	public WebElement button_x;
	
	@FindBy(xpath= ".//p[@ng-bind='message']")
	public WebElement info_popup_usernot_found;
	
	@FindBy(xpath=".//p[@ng-bind='message']")
	public WebElement otp_sent_success_popup;
	
	@FindBy(xpath="(.//*[@ng-if='genOTP'])[1]")
	public WebElement otp_sent_success_msg;
	
	@FindBy(xpath="(.//*[@ng-if='genOTP'])[2]")
	public WebElement Resend_otp_button;
	
	@FindBy(id="form1")
	public WebElement otp_field1;
	
	@FindBy(id="form2")
	public WebElement otp_field2;
	
	@FindBy(id="form3")
	public WebElement otp_field3;
	
	@FindBy(id="form4")
	public WebElement otp_field4;
	
	@FindBy(xpath=".//button[text()='Verify OTP']")
	public WebElement verify_otp;
	
	
	
	
	
	public void close_info_popup(){
		try{
			
			info_popup_Ok.click();
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void generate_Otp_ClientID_invalid(){
		
		try{
			
			utility.Highlighter.elementHighlight(driver, ClientID);
			ClientID.clear();
			//ClientID.sendKeys("test");
			utility.Highlighter.elementHighlight(driver, Generate_OTP);
			Generate_OTP.click();
			Thread.sleep(5000);
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
public void generate_Otp_ClientID_valid(){
		
		try{
			
			utility.Highlighter.elementHighlight(driver, ClientID);
			ClientID.clear();
			ClientID.sendKeys(DataProviderFactory.getExcel().getData(1, 61, 0));
			utility.Highlighter.elementHighlight(driver, Generate_OTP);
			Generate_OTP.click();
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	

	public void generate_Otp_Panno_invalid(){
		
		try{
			
			utility.Highlighter.elementHighlight(driver, PanNumber);
			PanNumber.clear();
			PanNumber.sendKeys("ABCDE1234K");
			utility.Highlighter.elementHighlight(driver, Generate_OTP);
			Generate_OTP.click();
			
			
			}catch(Exception e){
			
				
			}
	}
	
	
	public void generate_Otp_Panno_valid(){
		
		try{
			
			utility.Highlighter.elementHighlight(driver, PanNumber);
			PanNumber.clear();
			PanNumber.sendKeys(DataProviderFactory.getExcel().getData(1, 63, 0));
			utility.Highlighter.elementHighlight(driver, Generate_OTP);
			Generate_OTP.click();
			
			
			}catch(Exception e){
			
				
			}
	}
	
	
	public String getUserNotFound(){
		
	   String invalid_clientid = info_popup_usernot_found.getText();
	   return invalid_clientid;
		
	}
	
	public String verify_popupmessage_generate_Otp_ClientID(){
		
		String otp_sent_success= otp_sent_success_popup.getText();
		return otp_sent_success;
		
	}
	
	public String verify_otp_success_clientID(){
		
		return otp_sent_success_msg.getText();
		
	}
	
	
	public void resend_otp(){
		
		Resend_otp_button.click();
		info_popup_Ok.click();
		
	}
	
	public void set_Otp_fields() throws InterruptedException{
		
		//note this method requires manual updation of otp in data sheet at below location and thread.sleep of 5 mins
		
		
		otp_field1.sendKeys(DataProviderFactory.getExcel().getData(1, 61, 1));
		
		otp_field2.sendKeys(DataProviderFactory.getExcel().getData(1, 61, 2));
		
		otp_field3.sendKeys(DataProviderFactory.getExcel().getData(1, 61, 3));
		
		otp_field4.sendKeys(DataProviderFactory.getExcel().getData(1, 61, 4));
		
		Thread.sleep(3000);
		
		utility.Highlighter.elementHighlight(driver, verify_otp);
		verify_otp.click();
		
		Thread.sleep(5000);
		
		
	}
	
	
	
	
}


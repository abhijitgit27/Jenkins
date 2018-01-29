package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import factory.DataProviderFactory;

public class MyProfile {

	public WebDriver driver;
	
	public MyProfile(WebDriver driver){
		
		this.driver = driver;
	}
	
	@FindBy (xpath= ".//div[@ng-bind='profile.FirstHolderName']")
	public WebElement name;
	
	@FindBy (xpath= ".//div[@ng-bind='profile.Email']")
	public WebElement email;
	
	@FindBy (xpath= ".//div[@ng-bind='profile.MobileNo']")
	public WebElement MobileNo;
	
	@FindBy (xpath= ".//div[@ng-bind='profile.InvCode']")
	public WebElement clientID;
	
	@FindBy (xpath= ".//div[@ng-bind='profile.FirstHolderPAN']")
	public WebElement FirstHolderPAN;
	
	@FindBy (xpath= ".//div[@ng-bind='profile.BankAccountNo']")
	public WebElement BankAccountNo;
	
	@FindBy (xpath= ".//div[@ng-bind='address']")
	public WebElement address;
	
	public void getMyProfileDetails(){
		
		String client_name= name.getAttribute("value");
		System.out.println(client_name);
		//Assert.assertEquals(client_name, DataProviderFactory.getExcel().getData(1, 80, 1));
		
		String client_emailid =email.getText();
		System.out.println(client_emailid);
		Assert.assertEquals(client_emailid, DataProviderFactory.getExcel().getData(1, 81, 1));
		
		String client_mobile_number= MobileNo.getText();
		System.out.println(client_mobile_number);
		Assert.assertEquals(client_mobile_number, DataProviderFactory.getExcel().getData(1, 82, 1));
		
		String clientID_username = clientID.getText();
		System.out.println(clientID_username);
		Assert.assertEquals(clientID_username, DataProviderFactory.getExcel().getData(1, 83, 1));
		
		String firstHolder_pan= FirstHolderPAN.getText();
		System.out.println(firstHolder_pan);
		Assert.assertEquals(firstHolder_pan, DataProviderFactory.getExcel().getData(1, 84, 1));
		
		String BankAccount= BankAccountNo.getText();
		System.out.println(BankAccount);
		Assert.assertEquals(BankAccount, DataProviderFactory.getExcel().getData(1, 85, 1));
		
		String client_address = address.getText();
		System.out.println(client_address);
		Assert.assertEquals(client_address, DataProviderFactory.getExcel().getData(1, 86, 1));
		
	}
	
}

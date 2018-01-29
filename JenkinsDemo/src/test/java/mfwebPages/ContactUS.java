package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import factory.DataProviderFactory;

public class ContactUS
{
	public WebDriver driver;
	
	public ContactUS(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="first_name")
	public WebElement name;
	
	@FindBy(name="email")
	public WebElement email_address;
	
	@FindBy(name="sub")
	public WebElement subject;
	
	@FindBy(id="textarea2")
	public WebElement message;
	
	@FindBy(xpath=".//button[text()='SEND MESSAGE']")
	public WebElement send_message_button;
	
	//validation message elements
	@FindBy(xpath="(.//ng-message[@class='ng-scope'])[1]")
	public WebElement name_reqd;
	
	@FindBy(xpath="(.//ng-message[@class='ng-scope'])[2]")
	public WebElement email_reqd;
	
	@FindBy(xpath="(.//ng-message[@class='ng-scope'])[3]")
	public WebElement subject_reqd;
	
	@FindBy(xpath="(.//ng-message[@class='ng-scope'])[4]")
	public WebElement message_reqd;
	
	
	public void setContactUsData_Guest(){
		
		name.sendKeys(DataProviderFactory.getExcel().getData(1, 90, 1));
		email_address.sendKeys(DataProviderFactory.getExcel().getData(1, 91, 1));
		subject.sendKeys(DataProviderFactory.getExcel().getData(1, 92, 1));
		message.sendKeys(DataProviderFactory.getExcel().getData(1, 93, 1));
		
	}
	
	public void setContactUsData_LoggedIn(){
		
		//name and email should be pre populated
		//name.sendKeys(keysToSend);
		//email_address.sendKeys(keysToSend);
		subject.sendKeys(DataProviderFactory.getExcel().getData(1, 92, 1));
		message.sendKeys(DataProviderFactory.getExcel().getData(1, 93, 1));
		
	}
	
	public void get_validation_messages(){
		
		String name_validation= name_reqd.getText();
		System.out.println(name_validation);
		Assert.assertEquals(name_validation, DataProviderFactory.getExcel().getData(1, 96, 1));
		
		String email_validation= email_reqd.getText();
		System.out.println(email_validation);
		Assert.assertEquals(email_validation, DataProviderFactory.getExcel().getData(1, 97, 1));
		
		String subject_validation= subject_reqd.getText();
		System.out.println(subject_validation);
		Assert.assertEquals(subject_validation, DataProviderFactory.getExcel().getData(1, 98, 1));
		
		String message_validation= message_reqd.getText();
		System.out.println(message_validation);
		Assert.assertEquals(message_validation, DataProviderFactory.getExcel().getData(1, 99, 1));
		
	}
	
	
	
}

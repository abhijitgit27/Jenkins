package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class CreateNewPassword {

	public WebDriver driver;
	
	public CreateNewPassword(WebDriver driver){
		
		this.driver=driver;
	}
	
	@FindBy(id= "password")
	public WebElement password;
	
	@FindBy(xpath= ".//button[text()='CHANGE PASSWORD']")
	public WebElement Change_Password;
	
	@FindBy(xpath=".//span[@title='Click here to show/hide password']")
	public WebElement eyeIcon;
	
	public void setChangePassword(){
		
		password.sendKeys(DataProviderFactory.getExcel().getData(1, 75, 0));
		
		Actions act = new Actions(driver);
		act.moveToElement(eyeIcon).click();
		Change_Password.click();
		
		
		
		
	}
}

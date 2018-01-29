package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNav {

	public WebDriver driver;
	
	public TopNav(WebDriver driver){
		
		this.driver= driver;
	}
	
	//pre login elements
	@FindBy(linkText="Contact Us")
	public WebElement Contact_Us;
	
	@FindBy(partialLinkText="About")
	public WebElement About_Us;
	
	
	//post login elements
	@FindBy(xpath=".//*[@title='My Account']")
	public WebElement my_Account_PostLogin;
	
	@FindBy(xpath=".//*[@id='myDropdown']/a[1]")
	public WebElement dashboard_link;
	
	@FindBy(xpath=".//*[@id='myDropdown']/a[2]")
	public WebElement my_Profile_link;
	
	@FindBy(xpath=".//*[@id='myDropdown']/a[3]")
	public WebElement my_Investments;
	
	@FindBy(xpath=".//*[@id='myDropdown']/a[4]")
	public WebElement my_Transactions;
	
	@FindBy(xpath=".//*[@id='myDropdown']/a[6]")
	public WebElement signOut_link;
	
	//post login methods
	
	public void navigate_Dashboard(){
		
		my_Account_PostLogin.click();
		dashboard_link.click();
		
	}
	
	public void navigate_myProfile(){
		
		my_Account_PostLogin.click();
		my_Profile_link.click();
	}
	
	public void navigate_myInvestments(){
		
		my_Account_PostLogin.click();
		my_Investments.click();
		
	}
	
	public void navigate_myTransactions(){
		
		my_Account_PostLogin.click();
		my_Transactions.click();
	}
	
	public void signOut(){
		
		my_Account_PostLogin.click();
		signOut_link.click();
	}
	
}

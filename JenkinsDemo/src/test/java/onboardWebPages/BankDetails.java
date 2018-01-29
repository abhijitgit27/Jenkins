package onboardWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class BankDetails 
{
	public WebDriver driver;
	
	public BankDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id=".//*[@id='bank_name']")
	public WebElement Bank_name;
	
	@FindBy(name="accNo")
	public WebElement Account_Number;
	
	@FindBy(name="branchName")
	public WebElement Branch_Name;
	
	@FindBy(id="ifscCode1")
	public WebElement IFSC_Code;
	
	@FindBy(id="pincode")
	public WebElement zipcode;
	
	@FindBy(xpath=".//*[@id='SignUpBank']/div/div[7]/div/label/div[1]")
	public WebElement Current_account;
	
	@FindBy(xpath=".//*[@id='SignUpBank']/div/div[7]/div/label/div[2]/span")
	public WebElement toggled_button;
	
	@FindBy(xpath=".//*[@id='SignUpBank']/div/div[7]/div/label/div[3]")
	public WebElement Savings_account;
	
	@FindBy(xpath=".//button[text()='CONTINUE']")
	public WebElement Continue;
	
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/div/div/div/div/div/a")
	public WebElement EXIT_button;
	
	
	public void setBankDetails_Manual_Currentcount() throws InterruptedException{
	
		/*utility.Highlighter.elementHighlight(driver, Bank_name);
		Bank_name.clear();
		Bank_name.sendKeys(DataProviderFactory.getExcel().getData(1, 34, 0));
		Thread.sleep(1000);*/
		
		utility.Highlighter.elementHighlight(driver, Account_Number);
		Account_Number.clear();
		Account_Number.sendKeys(DataProviderFactory.getExcel().getData(1, 34, 1));
		Thread.sleep(1000);
		
		Account_Number.sendKeys(Keys.SHIFT,Keys.TAB,"HDFC BANK");
		Thread.sleep(1000);
		
		utility.Highlighter.elementHighlight(driver, Branch_Name);
		Branch_Name.clear();
		Branch_Name.sendKeys(DataProviderFactory.getExcel().getData(1, 34, 2));
		Thread.sleep(1000);
		
		//using ifsc code
		utility.Highlighter.elementHighlight(driver, IFSC_Code);
		IFSC_Code.clear();
		IFSC_Code.sendKeys(DataProviderFactory.getExcel().getData(1, 34, 3));
		Thread.sleep(1000);
		
		utility.Highlighter.elementHighlight(driver, zipcode);
		zipcode.clear();
		zipcode.sendKeys(DataProviderFactory.getExcel().getData(1, 34, 4));
		Thread.sleep(1000);
		
		//by toggle is at default savings a/c
		
		utility.Highlighter.elementHighlight(driver, Current_account);
		Current_account.click();
		Thread.sleep(1000);
		
		Continue.click();
		
		
	}
		
}


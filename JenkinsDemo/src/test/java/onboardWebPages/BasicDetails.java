package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import factory.DataProviderFactory;

public class BasicDetails
{
	public WebDriver driver;
	public BasicDetails(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(name="fullName")
	public WebElement Full_Name;
	
	@FindBy(name="fatherName")
	public WebElement Father_Name;
	
	@FindBy(id="motherName")
	public WebElement Mother_Name;
	
	@FindBy(xpath=".//*[@id='BasicDetailsScreen']/div/div[4]/input")
	public WebElement DOB;
	
	@FindBy(id="panNo")
	public WebElement PAN_NO;
	
	@FindBy(id="aadhaarNo")
	public WebElement Aadhaar_No;
	
	@FindBy(xpath=".//input[@type='checkbox']")
	public WebElement Political_Party;
	
	
	@FindBy(id="male")
	public WebElement Male;
	
	@FindBy(id="female")
	public WebElement Female;
	
	
	@FindBy(id="Single")
	public WebElement Single;
	
	@FindBy(xpath=".//label[@for='Married']")
	public WebElement Married;
	
	
	@FindBy(xpath=".//*[@id='BasicDetailsScreen']/div/div[12]/a")
	public WebElement Exit;
	
	@FindBy(xpath=".//button[@type='submit']")
	public WebElement Continue_btn;
	
	

	//verifying basic details of user who's pancard is verified
	public void verifyBasicDetailsPancard(String FullName, String FatherName, String dob, String pannumber){
		
		Assert.assertEquals(Full_Name.getAttribute("value"), FullName);
		Assert.assertEquals(Father_Name.getAttribute("value"), FatherName);
		Assert.assertEquals(DOB.getAttribute("value"), dob);
		Assert.assertEquals(PAN_NO.getAttribute("value"), pannumber);
		System.out.println("female:"+Female.isSelected());
		System.out.println("Male:"+Male.isSelected());
		Assert.assertTrue(Female.isSelected());
		//Assert.assertFalse(Male.isSelected());
		
		
		}
	
	public void set_remainig_Basic_Details() throws Exception{
		
		Mother_Name.clear();
		utility.Highlighter.elementHighlight(driver, Mother_Name);
		Mother_Name.sendKeys(DataProviderFactory.getExcel().getData(1, 13, 2));
		Thread.sleep(2000);
		
		Aadhaar_No.clear();
		utility.Highlighter.elementHighlight(driver, Aadhaar_No);
		Aadhaar_No.sendKeys(DataProviderFactory.getExcel().getData(1, 13, 5));
		

		Political_Party.click();
		Thread.sleep(5000);
		
		utility.HelperClass.scrollIntoView(driver, Female);
		
		//utility.Highlighter.elementHighlight(driver, Married);
		Married.click();
		
		utility.HelperClass.scrollIntoView(driver, Continue_btn);
		Continue_btn.click();
	}
	
	
		
		
	}
	
	


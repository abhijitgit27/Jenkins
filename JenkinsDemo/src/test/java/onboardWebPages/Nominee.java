package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import utility.HandleDropdown;

public class Nominee
{
	public WebDriver driver;
	
	
	public Nominee(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="nomName")
	public WebElement Name;
	
	@FindBy(id="nomRel")
	public WebElement Nominee_Relation_Dropdown;
	
	@FindBy(id="IsNominee")
	public WebElement Checkbox_Minor;
	
	@FindBy(id="nomDob")
	public WebElement Minor_dob;
	
	@FindBy(xpath=".//button[text()='CONTINUE']")
	public WebElement Continue;
	
	@FindBy(linkText="Skip")
	public WebElement Nominee_Skip;
	
	//other field for other dd selected
	@FindBy(id="nomrelo")
	public WebElement other_relation;
	
	
	public void setNomineeDetails() throws InterruptedException{
		
		utility.Highlighter.elementHighlight(driver, Name);
		Name.clear();
		Name.sendKeys(DataProviderFactory.getExcel().getData(1, 26, 0));
		
		//dropdown selection using utility class
		utility.Highlighter.elementHighlight(driver, Nominee_Relation_Dropdown);
		HandleDropdown.selectDropdownValue(driver, Nominee_Relation_Dropdown, DataProviderFactory.getExcel().getData(1, 26, 1));
		Thread.sleep(4000);
		
		Continue.click();		
	}
	
	public void setNomineeDetailsMinor(){
		
		utility.Highlighter.elementHighlight(driver, Name);
		Name.clear();
		Name.sendKeys(DataProviderFactory.getExcel().getData(1, 29, 0));
		
		//dropdown selection
		HandleDropdown.selectDropdownValue(driver, Nominee_Relation_Dropdown, DataProviderFactory.getExcel().getData(1, 29, 1));
		
		Actions act = new Actions(driver);
		act.moveToElement(Checkbox_Minor).click();
		
		utility.Highlighter.elementHighlight(driver, Minor_dob);
		Minor_dob.clear();
		Minor_dob.sendKeys(DataProviderFactory.getExcel().getData(1, 29, 2));
		
		Continue.click();	
	}
	
	
	
	
}
	
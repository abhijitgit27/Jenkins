package onboardWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FatcaDeclaration 
{
	public WebDriver driver;
	
	public FatcaDeclaration(WebDriver driver)
	{
		this.driver=driver;
	}
		
	@FindBy(xpath=".//*[@id='income_slab']/div/input")
	public WebElement Incometax_slab;

	@FindBy(xpath=".//*[@id='occupation']/div/input")
	public WebElement Occupation;
	
	@FindBy(xpath=".//*[@id='birth_country']/div/input")
	public WebElement Country_Birth;
	
	@FindBy(xpath=".//*[@id='tax_country']/div/input")
	public WebElement Tax_residency;
	
	@FindBy(xpath=".//*[@id='fatcaForm']/div/div[5]/input")
	public WebElement Tin_number;
	
	@FindBy(xpath=".//*[@id='fatcaForm']/div/div[6]/button")
	public WebElement Continue_button;

	
	
	
	
	
	
	
	

	
	
	
	
	
	
}


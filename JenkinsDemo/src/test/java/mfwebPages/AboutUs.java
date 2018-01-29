package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AboutUs
{
	public WebDriver driver;
	Actions act;
	
	public AboutUs(WebDriver driver)
	{
		this.driver=driver;
	} 
	
	@FindBy(partialLinkText="CA KAMAL PODDAR")
	public WebElement director_name1;
	
	@FindBy(partialLinkText="MR. AJAY KEJARIWAL")
	public WebElement director_name2;
	
	@FindBy(partialLinkText="MRS. HEMLATA PODDAR")
	public WebElement director_name3;
	
	
	@FindBy(xpath="(.//img[@class='responsivemarginbottom'])[1]")
	public WebElement left_callout1_img;
	
	@FindBy(xpath="(.//img[@class='responsivemarginbottom'])[2]")
	public WebElement centre_callout2_img;
	
	@FindBy(xpath="(.//img[@class='responsivemarginbottom'])[3]")
	public WebElement right_callout3_img;
	
	@FindBy(xpath="(//div[@class='col-md-4'])[1]")
    public WebElement callout1;
	
    @FindBy(xpath="(//div[@class='col-md-4'])[2]")
    public WebElement callout2;
   
    @FindBy(xpath="(//div[@class='col-md-4'])[3]")
    public WebElement callout3;
    
    @FindBy(xpath="(.//*[text()='Read More'])[1]")
    public WebElement ReadMore1;
    
    @FindBy(linkText="Read More")
    public WebElement ReadMore2;
	
	public void navigateToBoardOfDirectors(){
		
		try{
			
			Thread.sleep(2000);
			director_name1.click();
			
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			director_name2.click();
			
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			director_name3.click();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
			
		
	}
	
}	
	

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

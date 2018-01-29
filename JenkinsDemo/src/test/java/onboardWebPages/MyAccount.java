package onboardWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class MyAccount
{
	public WebDriver driver;
	public MyAccount(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	/*@FindBy(xpath=".//*[@title='My Account']")
	public WebElement My_Account;
	
	@FindBy(linkText="Sign In")
	public WebElement signIn;
	
	
	@FindBy(linkText="Sign Up")
	public WebElement signUp;*/
	
	
	public void navigateSignIn(){
		
		
		
		driver.findElement(By.xpath(".//*[@title='My Account']")).click();
		
		for(int i=0;i<10; i++){
			
			try{

		        driver.findElement(By.xpath(".//*[@id='myDropdown']/a[1]")).click();
				//driver.findElement(By.linkText("Sign Up")).click();
				break;
				
			}catch(StaleElementReferenceException see){
				
			}
		}
		
		//driver.findElement(By.linkText("Sign In")).click();
		//My_Account.click();
		//signIn.click();
	}
	
	public void navigateSignUp(){
		
		
		driver.findElement(By.xpath(".//*[@title='My Account']")).click();
		
		for(int i=0;i<10; i++){
			
			try{

		        driver.findElement(By.xpath(".//*[@id='myDropdown']/a[2]")).click();
				//driver.findElement(By.linkText("Sign Up")).click();
				break;
				
			}catch(StaleElementReferenceException see){
				
			}
		}
		
	}
}	



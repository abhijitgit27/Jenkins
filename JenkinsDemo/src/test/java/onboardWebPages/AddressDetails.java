package onboardWebPages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import factory.DataProviderFactory;

public class AddressDetails
	{
		public WebDriver driver;
		
		
		
		public AddressDetails(WebDriver driver)
		{
			this.driver=driver;
		}
		
		@FindBy(name="paddresss")
		public WebElement Permanant_address;
		
		@FindBy(name="citys")
		public WebElement Citys;
		
		
		@FindBy(xpath=".//*[@id='state']/div/input")
		public WebElement State;
		
		@FindBy(id="zipcode")
		public WebElement Zip_code;

		//by default it is checked
		@FindBy(xpath=".//input[@type='checkbox']") 
		public WebElement Check_Box;
		
		
		@FindBy(name="caddress") 
		public WebElement current_address;
		
		@FindBy(name="city") 
		public WebElement City;

		@FindBy(xpath=".//*[@id='stateC']/div/input")
		public WebElement State_Name;
		
		@FindBy(id="zipcode")
		public WebElement Zipcode;
		
		@FindBy(xpath=".//button[text()='CONTINUE']")
		public WebElement Continue;
		
		@FindBy(xpath=".//*[@id='SignUpAddress']/div/div[12]/a") 
		public WebElement Exit;
		
		
		public void verifySignUpAddress(){
	    	
		
			//System.out.println(Permanant_address.getAttribute("value"));
			
			//System.out.println(Citys.getAttribute("value"));
		    Assert.assertEquals(Citys.getAttribute("value"), "MUMBAI");
			
			Assert.assertEquals(State.getAttribute("value"), "Maharashtra");
			//System.out.println(State.getAttribute("value"));
			
			Assert.assertEquals(Zip_code.getAttribute("value"), "400025");
			//System.out.println(Zip_code.getAttribute("value"));
			
			
	       }
		
		public void setupCurrentAddress() throws InterruptedException{
		
			if(Check_Box.isEnabled()){
				Actions act= new Actions(driver);
				act.moveToElement(Check_Box).click();
				//utility.Highlighter.elementHighlight(driver, Check_Box);
				
				
				utility.Highlighter.elementHighlight(driver, current_address);
				current_address.clear();
				current_address.sendKeys(DataProviderFactory.getExcel().getData(1, 20, 0));
				Thread.sleep(2000);
				
				utility.Highlighter.elementHighlight(driver, City);
				City.clear();
				City.sendKeys(DataProviderFactory.getExcel().getData(1, 20, 1));
				Thread.sleep(2000);
				
				utility.Highlighter.elementHighlight(driver, State_Name);
				State_Name.clear();
				State_Name.sendKeys(DataProviderFactory.getExcel().getData(1, 20, 2));
				Thread.sleep(2000);
				State_Name.sendKeys(Keys.TAB,"400026");
				Thread.sleep(2000);
				
				// or try this to implement full functionality e.g Mahar and down arrow
				//State_Name.sendKeys(DataProviderFactory.getExcel().getData(1, 22, 0));
				/*State_Name.sendKeys(Keys.ARROW_DOWN);
				State_Name.sendKeys(Keys.ENTER);*/
				
				
				//Zipcode.sendKeys(DataProviderFactory.getExcel().getData(1, 20, 3));	
			}
			
			
			Continue.click();
			
			
		}
		
		

	}

       



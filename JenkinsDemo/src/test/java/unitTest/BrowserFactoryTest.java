package unitTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BrowserFactory;

public class BrowserFactoryTest {

	@Test
	public void testFirefox(){
		//since getBrowser() is static method so classname.method name
		WebDriver driver= BrowserFactory.getBrowser("firefox");
		Assert.assertTrue(driver !=null);	
		BrowserFactory.closeBrowser();
		
	}
	
	@Test
	public void testchrome(){
		
		WebDriver driver = BrowserFactory.getBrowser("chrome");
		Assert.assertTrue(driver!=null);
		BrowserFactory.closeBrowser();
	
	}
	
	@Test
	public void testIE(){
		WebDriver driver = BrowserFactory.getBrowser("ie");
		Assert.assertTrue(driver!=null);
		BrowserFactory.closeBrowser();
	}
	
 	
}

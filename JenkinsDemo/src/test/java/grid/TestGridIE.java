package grid;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGridIE {
	private WebDriver driver;
//Note: test for grid using chrome was successful	
	
	@BeforeMethod
	public void setUp() throws Exception{

		DesiredCapabilities iecap= DesiredCapabilities.internetExplorer();
		iecap.setBrowserName("internet explorer");
		iecap.setPlatform(Platform.WINDOWS);
		iecap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), iecap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testgridchrome(){
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.linkText("Your Account")).click();
			
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}

}

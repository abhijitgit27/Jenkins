package grid;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGrid {
	private WebDriver driver;
//Note: test for grid using chrome was successful	
	
	@BeforeMethod
	public void setUp() throws Exception{

		DesiredCapabilities chromecap= DesiredCapabilities.chrome();
		chromecap.setBrowserName("chrome");
		chromecap.setPlatform(Platform.WINDOWS);
		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromecap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testgridchrome(){
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.id("account")).click();
			
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}

}

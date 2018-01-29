package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class TestFFOnGrid {
		
	public void test1() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities cap = new DesiredCapabilities();	
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium server3.0\\chromedriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.25.239.240:4444/wd/hub"), cap);
		driver.get("http://store.demoqa.com");
		Thread.sleep(5000);	
	}	
}

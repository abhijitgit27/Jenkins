package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class BrowserFactory {
	
    static WebDriver driver;
	public static WebDriver getBrowser(String browserName){
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			//ConfigDataProvider config = new ConfigDataProvider();
			
			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfig().getFirefoxPath());
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("moz:firefoxOptions", options);
			//set more capabilities as per your requirements
			
			driver = new FirefoxDriver(capabilities);		
		
		}else if(browserName.equalsIgnoreCase("chrome")){
			
			//ConfigDataProvider config = new ConfigDataProvider();
			
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")){
			
			//ConfigDataProvider config = new ConfigDataProvider();
			
			System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().getIEPath());
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
	
}

package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



//need to check why not coming import org.apache.commons.io.FileUtils;



public class CaptureScreenshot {
	
	static WebDriver driver;
	

	public static String takeScreenshot(WebDriver driver, String screenshotName){
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\Screenshots\\"+screenshotName+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));
			
		} catch (IOException e) {
			
			
		}
		
		return destination;
		
		
	}
	
	
}

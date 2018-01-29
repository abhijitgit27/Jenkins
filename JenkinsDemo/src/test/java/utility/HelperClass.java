package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperClass {

	// int horizontal and int vertical are pixels
	//+ is used to pass horizontal comma and brackets
	
	public static void scrollDown(WebDriver driver, int horizontal, int vertical){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll("+horizontal+","+vertical+")");
		
		
	}
	
	//it will check for specific element
	
	public static void scrollIntoView(WebDriver driver,WebElement element){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	

	

}

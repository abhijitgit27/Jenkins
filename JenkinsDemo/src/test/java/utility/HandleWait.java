package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWait {

	
	public static WebElement explicitWait(WebDriver driver, int waitPeriod, WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver, waitPeriod);
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		
		return ele;
		
	}
	
	
	
}
	


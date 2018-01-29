package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlePageIndicator {

	public static void clickPageIndicator(WebDriver driver, WebElement pagination, String pagination_value){
		
		//one less than page you want to be
		try{
			
			pagination.sendKeys(pagination_value);
			Thread.sleep(1000);
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
}

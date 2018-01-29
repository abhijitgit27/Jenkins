package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleSegmentedControl {

	public static void setSegmentedContro(WebDriver driver, WebElement segmentedControl){
		
		try{
			
			segmentedControl.click();
			
		}catch(Exception e){
			
			System.out.println(e);
		}
	}
}

package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleHiddenElements {

	//hidden elements are those which return x and y dimensions of element as zero
	//before calling this method identify elements and store in list
	
	
	
	public static void click_Hidden_Elements(WebDriver driver,List<WebElement> hiddenElements){
		
		//List<WebElement> hiddenElements = driver.findElements(By.id("a"));
		
		for(int i=0;i<hiddenElements.size();i++){
			
			int width_dim_x = hiddenElements.get(i).getLocation().getX();
			
			if(width_dim_x!=0){
				hiddenElements.get(i).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					
				}
				break;
			}
			
		}
		
	}
}

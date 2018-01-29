package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

	public static void elementHighlight(WebDriver driver,WebElement element){
		
		/*driver is Webdriver's reference;
		 * so type cast it to JavascriptExecutor which is interface and js is JavascripExecutor reference
		 */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px green');", element);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		
		
	}
}

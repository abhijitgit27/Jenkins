package mfwebTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.HandleDropdown;

public class Test {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement dropdown_day = driver.findElement(By.id("day"));
		Thread.sleep(4000);
		//HandleDropdown.selectDropdownValue(driver, dropdown_day, "4");
		HandleDropdown.selectDropdownValue(driver, dropdown_day, "7");
		
		
		


	}

}

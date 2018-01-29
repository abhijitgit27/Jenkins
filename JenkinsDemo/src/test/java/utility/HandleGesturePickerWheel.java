package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleGesturePickerWheel {

	public static void setPickerWheel(WebDriver driver, WebElement pickerWheel, String picker_wheel_value){
		
		try{
			
			pickerWheel.sendKeys(picker_wheel_value);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void setDatePickerWheel(WebDriver driver, List<WebElement> datePickerWheel, String picker_Wheel1_value,String picker_Wheel2_value,String picker_Wheel3_value,String picker_Wheel4_value){
		
		try{
			
			//getting the pickerwheel string format in which its needs to be send using sendkeys
			System.out.println(datePickerWheel.get(0).getAttribute("value"));
			System.out.println(datePickerWheel.get(1).getAttribute("value"));
			System.out.println(datePickerWheel.get(2).getAttribute("value"));
			System.out.println(datePickerWheel.get(3).getAttribute("value"));
			
			//comment it after you get values from picker wheel
			datePickerWheel.get(0).sendKeys(picker_Wheel1_value);
			Thread.sleep(1000);
			datePickerWheel.get(0).sendKeys(picker_Wheel2_value);
			Thread.sleep(1000);
			datePickerWheel.get(0).sendKeys(picker_Wheel3_value);
			Thread.sleep(1000);
			datePickerWheel.get(0).sendKeys(picker_Wheel4_value);
			Thread.sleep(1000);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

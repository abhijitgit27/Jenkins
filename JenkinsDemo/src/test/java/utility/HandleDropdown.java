package utility;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class HandleDropdown {
	
	public static void selectDropdownValue(WebDriver driver, WebElement dropdown, String dropdownValue){
		
		Select selectobj= new Select(dropdown);
		WebElement firstSelectedDD= selectobj.getFirstSelectedOption();
		String firstSelectedDDValue = firstSelectedDD.getText();
		
		if(firstSelectedDDValue.equalsIgnoreCase(dropdownValue)){
			System.out.println("Selected dropdown value :"+firstSelectedDDValue);
		}
		   else{
			   
			    List<WebElement> dropdownelements =selectobj.getOptions();
			    for(int i=0;i<dropdownelements.size();i++){
			    	String ddelementvalue= dropdownelements.get(i).getText();
			    	if(ddelementvalue.equalsIgnoreCase(dropdownValue)){
			    		dropdownelements.get(i).click();
			    		break;
			    	}
			    }
			    
			    /*for(WebElement ddelements:dropdownelements){
			    	
			    	String ddelement_value=ddelements.getText();
			    	
			    	
			    }*/
		       }
		
	}

}

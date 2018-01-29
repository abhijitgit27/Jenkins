package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleTable {
	
	
	
	public static void get_Data_of_Column(WebDriver driver, List<WebElement> column, String data_to_be_searched){
		
		int row_size= column.size();
		System.out.println("Number of rows in this table:"+row_size);
		
		for(int i=0; i<row_size; i++)
		{
			WebElement column_row = column.get(i);
			String row_data = column_row.getText();
			
			if(row_data.equalsIgnoreCase(data_to_be_searched)){
				
				System.out.println("row data "+ row_data+ " is displayed");
				
			}
			
		}
		
		
		
		
		
	}
	
	
}

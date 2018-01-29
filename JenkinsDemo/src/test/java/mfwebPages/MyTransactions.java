package mfwebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTransactions {

	public WebDriver driver;
	
	String trans_table_head_text;
	
	public MyTransactions(WebDriver driver){
		
		this.driver= driver;
	}
	
	@FindBy(xpath=".//div[@class='segment-table']/table/thead/tr/th")
	public WebElement trans_table_headerText;
	
	@FindBy(partialLinkText="A")
	public WebElement c;
	
	public void get_MyTransactions_Data(){
		
		List<WebElement>trans_table_head= driver.findElements(By.xpath(".//div[@class='segment-table']/table/thead/tr/th"));
		
		//printing table header text
		for(int i=0;i<trans_table_head.size(); i++){
			
			trans_table_head_text= trans_table_head.get(i).getText();
			System.out.println("Column header are listed below");
			System.out.println(trans_table_head_text);
			
		}
		
		//getting  table data of any row
		
		
		
		
	}
	
}

package mfwebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recommendation
{
	public WebDriver driver;
	
	public Recommendation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(partialLinkText="Recommendation")
	public WebElement Recommendation;
	
	@FindBy(partialLinkText="Consumption Story")
	public WebElement consumption_story;
	
	@FindBy(partialLinkText="Digital India")
	public WebElement Digital_India;
	
	@FindBy(partialLinkText="The Tax Saviour")
	public WebElement Tax_Saviour;
	
	@FindBy(partialLinkText="Go with Index")
	public WebElement Index;
	
	@FindBy(partialLinkText="Wealth Builder EMI")
	public WebElement Wealth_Builder;
	
	@FindBy(partialLinkText="Go with Index")
	public WebElement GoWith_Index;
	
	@FindBy(partialLinkText="Best of All")
	public WebElement BestOf_All;
	
	@FindBy(partialLinkText="Large Cap Heroes")
	public WebElement LargeCap_Heroes;
	
}



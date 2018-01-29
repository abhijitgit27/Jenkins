package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class Footers {

	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUp(){
		report = new ExtentReports("C:\\Scripts\\com.Companyname.Framework\\Reports\\QAEnv"+System.currentTimeMillis()+".html", true);
	}
	
	@Test
	public void testFooters(){
		
		logger = report.startTest("testFooters", "smoke tests footer");
		
		driver = BrowserFactory.getBrowser("chrome");
		
		logger.log(LogStatus.INFO, "opening browser");
		
		driver.get(DataProviderFactory.getConfig().geturl());
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		utility.HelperClass.scrollIntoView(driver,home.footerYourAccount);
		
		utility.Highlighter.elementHighlight(driver, home.footerYourAccount);
		
		String path1 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "youraccount_displayed"));
		
		logger.log(LogStatus.PASS, path1);
		
		home.footerYourAccount.click();
		
		String youraccount_title = driver.getTitle();
		
		Assert.assertTrue(youraccount_title.contains("Your Account"));
		
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			String pathn = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, result.getName()));
			logger.log(LogStatus.FAIL,pathn );
		}
		
		report.endTest(logger);
		report.flush();
	}
}

package testCases;



import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;
import pages.YourAccountPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class NavigateMyaccount {
	
	WebDriver driver;
	
	//adding extent reports
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUp(){
		//if you set it to true new report will be present with old reports
		report = new ExtentReports("C:\\Scripts\\com.Companyname.Framework\\Reports\\QAEnv"+System.currentTimeMillis()+".html",false);
	}
	
	@Test
	public void myAccountNavigate() throws InterruptedException{
		
		/*Extent reports need to be start and end separately for each test
		 */
		logger = report.startTest("myAccountNavigate()", "test desc:testing my Account Navigation");
			
		driver = BrowserFactory.getBrowser("chrome");
		
		logger.log(LogStatus.INFO, "opening browser");
		
		driver.get(DataProviderFactory.getConfig().geturl());
		
		logger.log(LogStatus.INFO, "opening site ");
		
		String path1= logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "Homepage"));
		
		logger.log(LogStatus.INFO, path1);
		//driver.get("http://store.demoqa.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		utility.Highlighter.elementHighlight(driver, home.MyAccount);
		home.MyAccount.click();
		
		logger.log(LogStatus.INFO, "login account page opened");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.accountlogin();
		
		String path2 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "logindetails"));
		logger.log(LogStatus.INFO, path2 );
		
		
		Thread.sleep(4000);
		
		YourAccountPage account =PageFactory.initElements(driver, YourAccountPage.class);
		
		String tranc_msg_display= account.getTranscMsg();
		
		String path3 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "youraccount page"));
		
		logger.log(LogStatus.INFO, path3 );
		
		Assert.assertTrue(tranc_msg_display.contains("transactions for this month"));
		
		
		//transactions for this month
		
		//driver.close();
		
				
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus() == ITestResult.FAILURE){
			
			String path4 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, result.getName()));
			logger.log(LogStatus.FAIL, path4);
		}
		
		report.endTest(logger);
		
		report.flush();
	}
	
	

}

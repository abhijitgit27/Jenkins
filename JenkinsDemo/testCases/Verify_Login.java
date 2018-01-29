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
import pages.Dashboard_TMS;
import pages.LoginTMS;

public class Verify_Login {

	WebDriver driver;
	
	//adding extent reports
	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	
	public void setUp(){
		
		//new reports will override old reports each time
		
	report = new ExtentReports("C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\Reports\\localenv"+System.currentTimeMillis()+".html", false);	
		
		
	}
	

	@Test
	public void loginTMS_account(){
		
		logger= report.startTest("LoginTMS", "test desc:Testing login to TMS Application");
		
		driver= BrowserFactory.getBrowser("chrome");
		
		logger.log(LogStatus.INFO, "Opening Browser");
		
		driver.get(DataProviderFactory.getConfig().geturl());
		
		logger.log(LogStatus.INFO, "opening site ");
		
		String image_path1= logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "LoginPage"));
		logger.log(LogStatus.INFO,image_path1 );
		
		
		
		//login
		LoginTMS loginTMS = PageFactory.initElements(driver, LoginTMS.class);
		loginTMS.tms_account_login();
		
		//screenshot of dashboard page
		String image_path2= logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, "dashboardPage"));
		logger.log(LogStatus.INFO,image_path2 );
		
		Dashboard_TMS dashboard = PageFactory.initElements(driver, Dashboard_TMS.class);
		Assert.assertTrue(dashboard.Dashboard_text.getText().contains("DashBoard"));
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus()== ITestResult.FAILURE){
			
			String path4 = logger.addScreenCapture(utility.CaptureScreenshot.takeScreenshot(driver, result.getName()));
			logger.log(LogStatus.FAIL, path4);
		}
		
		report.endTest(logger);
		report.flush();
		driver.close();
	}
	
	
	
	
}

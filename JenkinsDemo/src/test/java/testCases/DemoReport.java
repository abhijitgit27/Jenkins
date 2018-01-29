package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoReport {

	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void setUp(){
		
		report = new ExtentReports("C:\\ExtentReports\\Project-Name\\QaEnvReport.html", true);
	}
	
	
	@Test
	public void testAdvanceReport(){
		
		logger = report.startTest("demotest1", "testin demotest1");
		
		logger.log(LogStatus.INFO, "testing for info logs");
		
		String path = logger.addScreenCapture("C:\\Scripts\\com.Companyname.Framework\\Screenshots\\myAccountNavigate1473488071120.png");
		
		logger.log(LogStatus.INFO, path);
		
		report.endTest(logger);
		
	}
	
	@Test
	public void testAdvanceReportFailed(){
		
		logger = report.startTest("demotest2", "testing demo test2");
		
		logger.log(LogStatus.FAIL, "testubg for fail logs");
		
		String path1 = logger.addScreenCapture("C:\\Scripts\\com.Companyname.Framework\\Screenshots\\myacsuccess1473488070924.png");
		
		logger.log(LogStatus.FAIL, path1);
		
		report.endTest(logger);
	 
		
	}
	
	@AfterTest
	public void tearDown(){
		
		//will release memory
		report.flush();
		
		//could also use
		//report.close();
		
	}


}

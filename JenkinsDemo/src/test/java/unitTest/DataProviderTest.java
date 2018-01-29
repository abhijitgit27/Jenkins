package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderTest {

	//This class is used to test configdataprovider and exceldata provider if they are working fine

	@Test
	public void testExcelDataProvider(){
		
		//creating object of ExcelDataProvider
		ExcelDataProvider excel = new ExcelDataProvider();
		
		String username = excel.getData(0, 0, 0);
		String password = excel.getData(0, 0, 1);
		
		System.out.println(username);
		System.out.println(password);
		
		Assert.assertEquals(username, "tms");
		Assert.assertEquals(password, "choice@123");
	}
	
	@Test
	public void testConfigDataProvider(){
		
		ConfigDataProvider config = new ConfigDataProvider();
		
		//check if chromePath is provided
		String chrome_path = config.getChromePath();
		System.out.println(chrome_path);
		Assert.assertEquals(chrome_path, "C:\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		//Assert.assertEquals(chrome_path, "C:\\selenium server3.0\\chromedriver.exe");
		
		//check if IEPath is provided
		String ie_path = config.getIEPath();
		System.out.println(ie_path);
		Assert.assertEquals(ie_path, "C:\\Selenium softwares\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		//Assert.assertEquals(ie_path, "C:\\selenium server3.0\\IEDriverServer.exe");
		
		//check if ffPath is provided
		String firefox_path= config.getFirefoxPath();
		System.out.println(firefox_path);
		Assert.assertEquals(firefox_path, "C:\\Selenium softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//Assert.assertEquals(firefox_path, "C:\\selenium server3.0\\geckodriver-v0.10.0-win64\\geckodriver.exe");
	
		
		String env_url= config.geturl();
		System.out.println(env_url);
		Assert.assertEquals(env_url, "https://investica.choicebroking.in");
		//Assert.assertEquals(env_url, "http://www.finishline.com");
		
		//check if Timeout is provided
		String timeout= config.getTimeOut();
		System.out.println(timeout);
		Assert.assertEquals(timeout, "30000");
	}
}

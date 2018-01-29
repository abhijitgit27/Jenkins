package testRunner;



import org.testng.TestNG;

import factory.DataProviderFactory;

public class TestEngine {

	public static void main(String[] args) {
		
		//Note: Main purpose of TestEngine is to run multiple xmlfiles at one go
		
		//creation object of testNG class
		
		TestNG runner = new TestNG();
		
		//List<String> xmlFiles = new ArrayList<String>();
		
		/*xmlFiles.add("C:\\Scripts\\com.Companyname.Framework\\TestCases XML\\DataDriven.xml");
		xmlFiles.add("C:\\Scripts\\com.Companyname.Framework\\TestCases XML\\Sprint1.xml");
		xmlFiles.add("C:\\Scripts\\com.Companyname.Framework\\TestCases XML\\Sprint2.xml");
		*/
		
		
		/* 
		 * setTestSuites() method of TestNG requires list<String> suites
		   hence create a list of String for suites */
		
		//now dynamic code return in ConfigDataProvider, so now passing that method in below instead of runner.setTestSuites(xmlfiles);
		runner.setTestSuites(DataProviderFactory.getConfig().getXmlFile());
		
		//to execute run
		runner.run();
		
	
	}

}

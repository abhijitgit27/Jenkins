package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ConfigDataProvider {
	
	//global variable of Properties class
	Properties pro;
	
	//constructor to load config.properties file
	public ConfigDataProvider(){
	
		// File src = new File("C:\\Scripts\\com.Companyname.Framework\\Configuration\\config.properties");
		
		File src = new File("C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
			
		} catch (Exception e) {
			
		}
			
	//end of constructor ConfigDataProvider
	
	}
	
	//getchrome path from config.properties
	public String getChromePath(){
		
		String chrome_driver_path = pro.getProperty("chromePath");
		return chrome_driver_path;
		
	}
	
	//get IE path from config.properties
	public String getIEPath(){
		
		String ie_driver_path = pro.getProperty("iePath");
		return ie_driver_path;
		
	}
	
	//get firefox path from config.properties
	
	public String getFirefoxPath(){
		
		String firefox_path = pro.getProperty("firefoxPath");
		
		return firefox_path;
		
	}
	
	//get environment url from config.properties
	
	public String geturl(){
		String envurl= pro.getProperty("env_url");
		return envurl;
	}
	
	public String getTimeOut(){
		
		String timeout_value= pro.getProperty("timeout");
		return timeout_value;
	}
	
	/*method to read xmls given in config properties and split at comma
	return type is List of string is used
	since setTestSuite(List<String>)accepts list of string*/
	
	public List<String> getXmlFile(){
		
		String xmlfiles = pro.getProperty("XMLFiles");
		/*since xmlfiles will return string with more than xmlfiles with commma hence now split
		note: split method will return String array[]*/
		String[] arr= xmlfiles.split(",");
		// but we require list of string for setTestSuite(List<String>)
		List<String> xmlList = new ArrayList<String>();
		
		//running for loop to add any number of xmls dynamically
		for(int i=0;i<arr.length;i++){
			
			xmlList.add(arr[i]);
		}
		
		
		return 	xmlList;	
		
		
	}
	
}

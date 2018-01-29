package utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class VerifyBrokenLinks {
	
	public static void getAllLinks_OnPage(WebDriver driver){
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on page are:"+ links.size());
		
		for(int i=0; i<links.size();i++){
			
			WebElement link = links.get(i);
			
			//will provide all links href addresses
			String each_link_url = link.getAttribute("href");
			
			verifyLinkActive(each_link_url);
			
				
		}
			
	}
	
	public static void verifyLinkActive(String url_to_be_verified){
		
		try {
			
			URL url = new URL(url_to_be_verified);
			
			//open connection using url object and type cast to HttpURLConnection
			
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			
			//time out for each link set
			httpURLConnect.setConnectTimeout(3000);
			
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200){
				
				Reporter.log(url_to_be_verified+"-"+httpURLConnect.getResponseMessage(), true);
				
			}else if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				
				Reporter.log(url_to_be_verified+"-"+httpURLConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND, true);
				
			}
			
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

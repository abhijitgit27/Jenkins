package utility;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class HandleMultipleWindow {
	
         String parent_window;
         String child_window;
         
         public static String getParentwindowHandle(WebDriver driver){
        	 
        	
        	 Set<String> windows= driver.getWindowHandles();
        	 Iterator<String> window_Handles= windows.iterator();
        	 String parent_window = window_Handles.next();
        	 return parent_window;
        	 
         }

	public static void navigate_To_ChildWindow(WebDriver driver){
		
		try{
			
			String parent_window = driver.getWindowHandle();
			System.out.println("parent window is" +parent_window);
			Set<String> s1= driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();
			while(i1.hasNext()){
				
				String child_window =i1.next();
				if(!parent_window.equalsIgnoreCase(child_window)){
					driver.switchTo().window(child_window);
					driver.manage().window().maximize();
					System.out.println("child window is"+ child_window);
					System.out.println("current child window title is:"+ driver.switchTo().window(child_window).getTitle());
					
							
				}
				
			}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	

	
	
    

}

package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;
import factory.DataProviderFactory;

public class DataProviderFactoryTest {

	@Test
	public void testgetConfigObject(){
		
		ConfigDataProvider config = DataProviderFactory.getConfig();
		Assert.assertTrue(config!= null);
		
	}
	
	@Test
	public void testgetExcelObject(){
		
		ExcelDataProvider excel = DataProviderFactory.getExcel();
		Assert.assertTrue(excel!=null);
	}
	
	
}

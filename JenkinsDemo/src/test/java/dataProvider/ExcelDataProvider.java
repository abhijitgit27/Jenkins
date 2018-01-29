package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	
	//global variable
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	//constructor for ExcelDataProvider
	public ExcelDataProvider(){
		
		//File src = new File("C:\\Scripts\\com.Companyname.Framework\\TestData\\Data.xlsx");
		
		File src = new File("C:\\Softwares-Testing\\Framework1\\com.Companyname.Framework\\TestData\\Data.xlsx");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			
					
		} catch (Exception e) {
			
		}
	
		//end of constructor
	}

	//creating method to read data from excel
	public String getData(int Sheetindex, int rowNumber, int columnNumber){
		
		String data = wb.getSheetAt(Sheetindex).getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		return data;
		
	}
	
	//step: For testng data provider created in ddt package
	
	public int getRowCount(int sheetIndex){
		
		int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();
		
		//above statement will return count of entries in data sheet starting with zero for first row
		//hence if 10 rows of data then will return 9, hence need to increment it
		
		return rowCount+1;
		
	}
	
	//step: using sheet name For testng data provider created in ddt package
	   // method overloading
	
	public int getRowCount(String sheetName){
		
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		
		//above statement will return count of entries in data sheet starting with zero for first row
		//hence if 10 rows of data then will return 9, hence need to increment it
		return rowCount+1;
	}
	
}

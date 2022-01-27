package testNGAdvance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MobilePhones {
	@DataProvider(name="SearchProducts",parallel=true)
	public String[] sendMobileNames() throws InvalidFormatException, IOException {
		
			FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			
			Sheet dataSheet = workbook.getSheet("Sheet1");
			int rowCount = dataSheet.getPhysicalNumberOfRows();
			
			String[] arr = new String[rowCount];
			
			for(int i=0;i<rowCount;i++) {
				arr[i]=dataSheet.getRow(i).getCell(0).getStringCellValue();
			}
			return arr;
	}
	
	@Test(dataProvider = "SearchProducts")
	public void printOutput(String Mobile) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in");
		drive.findElement(By.id("twotabsearchtextbox")).sendKeys(Mobile,Keys.ENTER);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

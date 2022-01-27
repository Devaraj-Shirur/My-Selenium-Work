package testNGWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AnnotationInTestNG {
	// if there is no priority given it will execute alphabetically of method name
	@Test(priority = 1, invocationCount = 2, threadPoolSize = 2) 
	public void employeename() {
		Reporter.log("Name : Devaraj Shirur",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/5.1/getting-started/introduction/");
		driver.quit();
	}
	
	@Test(priority = 2, invocationCount = 2, threadPoolSize = 2)
	public void employeeID() {
		Reporter.log("ID : 123222",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.quit();
	}
	
	@Test(priority = 3, invocationCount = 2, threadPoolSize = 2, enabled = false)
	public void salary() {
		Reporter.log("SAL : 19500",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		driver.quit();
	}
	
	@Test(priority = 4, invocationCount = 2, threadPoolSize = 2, timeOut = 2000)
	public void department(){
		Reporter.log("DEPT : Testing",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		driver.quit();
	}
	

}

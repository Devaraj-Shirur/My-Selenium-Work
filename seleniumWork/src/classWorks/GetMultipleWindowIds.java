package classWorks;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMultipleWindowIds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwindowId= driver.getWindowHandles();
		for(String windowId : allwindowId)
		{
			System.out.println(windowId);		
		}
		Thread.sleep(30000);
		driver.quit();
		
		
	}
	

}

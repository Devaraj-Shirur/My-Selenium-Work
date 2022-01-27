 package locators;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsUsingFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentwindowid);
		for(String windowid : allwindowids) 
		{
			driver.switchTo().window(windowid);
			driver.close();
		}
		driver.navigate().to(parentwindowid);
		
		Thread.sleep(2000);
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Softwear Development Job");
		
	}

}

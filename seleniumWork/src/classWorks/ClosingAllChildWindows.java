package classWorks;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingAllChildWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentwindowid);
		allwindowids.size();
		for(String windowid : allwindowids) 
		{
			driver.switchTo().window(windowid);
			driver.close();
		}
	}

}

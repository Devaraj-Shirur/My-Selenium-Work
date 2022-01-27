 package classWorks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(30000);
		driver.navigate().to("https://www.swiggy.com/");
		URL url = new URL("https://www.skillrary.com/");
		driver.navigate().to(url);  
		driver.quit();
		
	}

}

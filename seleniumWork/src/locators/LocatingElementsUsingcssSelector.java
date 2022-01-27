package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsUsingcssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CATEGORIES")).click();
		driver.getCurrentUrl();
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.cssSelector("input[value=\"go\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

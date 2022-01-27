 package testNGWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElementsOfActitime {
	
	@Test
	public void loginActi() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(300);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(300);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(300);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(300);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(30000);
		Reporter.log("Loged in successfully");
		

	}

}

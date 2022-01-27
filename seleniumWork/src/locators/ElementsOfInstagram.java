package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsOfInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		WebElement usernameTextfield = driver.findElement(By.name("username"));
		usernameTextfield.sendKeys("devaraj_shirur");
		driver.findElementByName("password").sendKeys("Devaraj@316182");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.findElement(By.className("cmbtv")).click();
		Thread.sleep(5000);
		
	}

}

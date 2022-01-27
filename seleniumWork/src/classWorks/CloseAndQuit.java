package classWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.close();
		driver.quit();
	}

}

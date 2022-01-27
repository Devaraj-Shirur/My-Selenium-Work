package classWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettingSourceOfthePage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String page = driver.getPageSource();
		System.out.println(page);
	}

}

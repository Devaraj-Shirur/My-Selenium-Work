package classWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlOfTheWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		System.out.println(driver.getCurrentUrl());
	}

}

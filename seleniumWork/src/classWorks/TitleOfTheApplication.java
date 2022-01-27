package classWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfTheApplication {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://zomato.com/");
		System.out.println(driver.getTitle());
	}

}

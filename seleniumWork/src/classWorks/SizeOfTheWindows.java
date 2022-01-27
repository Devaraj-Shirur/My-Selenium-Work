package classWorks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfTheWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Dimension a = new Dimension(1200,780);
		driver.manage().window().setSize(a);
		System.out.println(driver.manage().window().getSize().width);
		driver.quit();
	

	}

}

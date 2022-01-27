package classWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingFullScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		

	}

}

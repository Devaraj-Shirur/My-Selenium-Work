package screenShots;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		File tempfile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile);
		File desfile = new File("./errorshots/scrnshot1.png");
		tempfile.renameTo(desfile);
		FileUtils.copyFile(tempfile, desfile);
		
		File weScrnshot = driver.findElement(By.cssSelector("span[class=\"nav-cart-icon nav-sprite\"]")).getScreenshotAs(OutputType.FILE);
		File  weDesScrnshot = new File("./errorshots/weScrnshot1.png");
		weScrnshot.renameTo(weDesScrnshot);
		FileUtils.copyFile(weScrnshot, weDesScrnshot);
	}

}

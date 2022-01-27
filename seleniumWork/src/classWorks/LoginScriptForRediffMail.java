package classWorks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptForRediffMail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("devarajelf28@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@321");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("devarajelf28@rediffmail.com");
		driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("Devaraj");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("Hello Sir");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("span[text()='Devaraj']/..//cite[@title='Select ,ail']")).click();
				driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del'")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
	}
	

}

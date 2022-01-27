package classWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsOfSeletClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Devaraj%20Shirur/Downloads/dropDown.html");
		WebElement singleSelect = driver.findElement(By.id("s1"));
		Select select = new Select(singleSelect);
		System.out.println(select.isMultiple());
		List<WebElement> singleSelectOptions = select.getOptions();
		for(WebElement ele : singleSelectOptions) {
			System.out.println(ele.getText());
		}

	}

}

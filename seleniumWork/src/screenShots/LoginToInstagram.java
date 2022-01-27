package screenShots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToInstagram {

	public static void main(String[] args) {
		  
		//Test Data
		String tesrUrl =ExcelLib.readStringData("Sheet1", 0, 0); 
		String username = ExcelLib.readStringData("Sheet1", 1, 0);
		String password = ExcelLib.readStringData("Sheet1", 2, 0);
		String expectedLoginPageTitle =ExcelLib.readStringData("Sheet1", 3, 0);
		String expectedHomePageTitle =ExcelLib.readStringData("Sheet1", 4, 0);
		 
		//Step 1 : Open the Browser and Enter URL	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized Succcessfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(tesrUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is displayed Successfully");
		}else  {
			System.out.println("Login Page is not displayed successfully");
		}
		
		//step2 Enter username in username textfield
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)){
			System.out.println("username entered successfully");
		}else {
			System.out.println("username is not entered successfully");
		}
		
		//step3 Enter Password in Password textfield
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if(actualPasswordEntered.equals(password)){
			System.out.println("Password entered successfully");
		}else {
			System.out.println("Password is not entered successfully");
		}
		
		//step4 click on login button
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		String actualPageTitle = driver.getTitle();
		if(actualPageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home Page is displayed successfully");
		}else {
			System.out.println("Home Page is not displayed successfully");
		}

	}

}

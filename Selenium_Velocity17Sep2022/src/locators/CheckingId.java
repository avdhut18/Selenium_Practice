package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium1stprogram.CodeForBrowserInitialization;

public class CheckingId {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		
		 WebElement userName = driver.findElement(By.id("m_login_email"));
		 userName.sendKeys("avdhut");
		 
		WebElement password = driver.findElement(By.id("m_login_password"));
		password.sendKeys("avdhut123");
		
		WebElement clickLogin = driver.findElement(By.name("login"));
		clickLogin.click();

	}
}

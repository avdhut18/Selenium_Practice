package loginlogout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToLogout {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");

		// arrangements for accessing properties file
		FileInputStream fileIn = new FileInputStream(
				"C:\\Users\\avdhu\\eclipse-workspace\\Velocity17Sep2022\\Selenium_Velocity17Sep2022\\config.properties");
		Properties prop = new Properties();
		prop.load(fileIn);
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		boolean verifyDashboardPgeIsOpen = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText()
				.equals("Dashboard");
		if (verifyDashboardPgeIsOpen == true)
			System.out.println("Test is pass - Dashboard page is appeared");
		else
			System.out.println("Test is fail - Dashboard page has not appeared");
		driver.findElement(By.xpath("//*[text()='Paul Collings']//parent::span//i")).click();
		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(2000);
		driver.close();
	}
}

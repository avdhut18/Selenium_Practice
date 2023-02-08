package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		WebElement txt = driver.findElement(By.xpath("//h5[text()='Login']"));
		String returnStr = txt.getText();
		System.out.println(returnStr);
		
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']"));
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		WebElement btn = driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		btn.click();
	}
}

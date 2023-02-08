package seleniumverifymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedddNotWorking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		Thread.sleep(1000);
		
		WebElement particularCheckBox = driver.findElement(By.xpath(
		"//*[contains(text(),'Alice')]//parent::div//following-sibling::div//*[contains(text(),'Duval')]//parent::div//preceding-sibling::div//span//i"));
		particularCheckBox.click();
		Thread.sleep(1000);
		System.out.println(particularCheckBox.isSelected());  //true 
	}
}

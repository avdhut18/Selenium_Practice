package switchingwindowstab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMoreThanTwoWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String winId1 = driver.getWindowHandle();
		System.out.println("Primary window id: " + winId1); /// current window id

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allWinId = driver.getWindowHandles();
		for(String eachWinId:allWinId) {
			driver.switchTo().window(eachWinId);
			if(driver.getTitle().contains("OrangeHRM HR Software |")) {
				Thread.sleep(500);
				driver.findElement(By.xpath("(//*[text()='Contact Sales'])[2]")).click();
			}
		}
		Thread.sleep(500);
		driver.switchTo().window(winId1);
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();	
	}
}

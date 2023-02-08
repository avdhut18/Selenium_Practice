package switchingwindowstab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String winId1= driver.getWindowHandle();
		System.out.println("Primary window id: "+winId1);   ///current window id
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allWinId = driver.getWindowHandles();
		for(String eachWinId:allWinId)
			System.out.println(eachWinId);   ///all tabs which are opened - window id 
		
		
//		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
	}
}

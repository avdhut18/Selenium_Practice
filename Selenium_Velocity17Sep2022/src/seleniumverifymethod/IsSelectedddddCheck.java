package seleniumverifymethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedddddCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.id("isAgeSelected")).click();
		boolean verifyCheckboxIsSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(verifyCheckboxIsSelected); //true
		
		driver.findElement(By.id("isAgeSelected")).click();
		boolean verifyCheckboxIsSelected1 = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(verifyCheckboxIsSelected1);//false
	}	
}

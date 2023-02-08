package basicseleniumcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("isAgeSelected")).click(); //checked
		driver.findElement(By.id("isAgeSelected")).click(); //unchecked
		driver.findElement(By.id("isAgeSelected")).click(); //checked
		String verifyAttValue = driver.findElement(By.id("txtAge")).getAttribute("style");
		System.out.println(verifyAttValue);
		if(verifyAttValue.contains("block"));
		System.out.println("checkbox is checked");
	}
}

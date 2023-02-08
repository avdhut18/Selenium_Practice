package selenium1stprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // cache not stored
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/"); // allows to store the cache
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}

//.get() method and .navigate().to() methods are two methods used in selenium to launch the url

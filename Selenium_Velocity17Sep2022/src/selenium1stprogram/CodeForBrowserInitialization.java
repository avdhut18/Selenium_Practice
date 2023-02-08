package selenium1stprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



/*
 * @author Avdhut Pawar
 * @date 2022-12-30  
 */
public class CodeForBrowserInitialization {

	public static WebDriver driver;    ///static variable

	
	/*
	 * @author avdhut.pawar
	 * @date 2022-12-30
	 */
	public static WebDriver browserInit(String browser) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\edgedriver_win64\\msedgedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\avdhu\\OneDrive\\Documents\\Do Not Delete\\chromedriver_win32\\chromedriver.exe");
		
		if(browser.equals("edge"))
			driver = new EdgeDriver();
		if(browser.equals("chrome"))
		 driver = new ChromeDriver();
		return driver;
	}
}

package waits;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitttt2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts();

		// using explicit wait - dynamic wait - (Thread.sleep not used)
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		
		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(source, 550, 0).release().build().perform();

		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Download Builder']")));

		WebElement verifyDownloadBuilder = driver.findElement(By.xpath("//*[text()='Download Builder']"));
		String text = verifyDownloadBuilder.getText();
		System.out.println(text);
		driver.quit();
	}
}

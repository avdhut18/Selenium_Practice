package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotttt {
	public static WebDriver driver;
	
	public void screenShot(String fileName) throws IOException {
		TakesScreenshot	scrnshot =  (TakesScreenshot)driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\avdhu\\OneDrive\\Pictures\\SSViman\\"+fileName+".png");
		FileHandler.copy(source, destination);
	}
}

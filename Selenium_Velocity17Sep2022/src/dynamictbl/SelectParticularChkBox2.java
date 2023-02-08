package dynamictbl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import selenium1stprogram.CodeForBrowserInitialization;

public class SelectParticularChkBox2 extends CodeForBrowserInitialization {

	public void login() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	public void clickOnParticularEmpName(String fName, String lName) {
		driver.findElement(By
				.xpath("//*[contains(text(),'" + fName + "')]//parent::div//following-sibling::div//*[contains(text(),'"
						+ lName + "')]//parent::div//preceding-sibling::div//span//i"))
				.click();
	}

	public static void main(String[] args) {
		CodeForBrowserInitialization.browserInit("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SelectParticularChkBox2 loginObj = new SelectParticularChkBox2();
		loginObj.login();
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		loginObj.clickOnParticularEmpName("Alice", "Duval");
		
		
	}
}

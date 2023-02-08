package basicseleniumcommands;

import selenium1stprogram.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitle extends CodeForBrowserInitialization {

	public boolean checkInTitleOfPage(String title) {
		String titleOfPage = driver.getTitle(); // returns title of webpage

		if (titleOfPage.equals(title))
			return true;
		else
			return false;
			
	}

	public boolean checkUrlOfCurrentPage(String url) {
		String urlOfCurrentWebPage = driver.getCurrentUrl(); // returns title of webpage

		if (urlOfCurrentWebPage.equals(url))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		browserInit("chrome");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		CurrentUrlAndWebTitle obCheck = new CurrentUrlAndWebTitle();
		System.out.println(obCheck.checkInTitleOfPage("Intagram"));    ///Test 1
		System.out.println(obCheck.checkUrlOfCurrentPage("https://www.instagram.com/"));  ///Test 2
		driver.quit();
	}
}

package selenium1stprogram;

public class BrowserTest extends CodeForBrowserInitialization {

	public static void main(String[] args) {
		browserInit("edge");
		driver.get("https://www.instagram.com/");
	}
}

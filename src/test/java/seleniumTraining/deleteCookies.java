package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteCookies {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
//		delete all cookies
		driver.manage().deleteAllCookies();
//		delete particular cookie
		driver.manage().deleteCookieNamed("");
		driver.close();
	}
}

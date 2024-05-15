package seleniumTraining;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.coforge.com");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.open('https://google.com')");
		driver.quit();
	}
}

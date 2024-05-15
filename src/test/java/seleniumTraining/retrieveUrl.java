package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class retrieveUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Page Url is : " + url);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
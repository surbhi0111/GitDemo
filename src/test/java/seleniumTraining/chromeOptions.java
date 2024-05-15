package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/login");
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("Page Url is : "+url);
		driver.close();
	}
}
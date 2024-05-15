package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
//		maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		minimize window
		driver.manage().window().minimize();
		Thread.sleep(3000);
//		full screen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.close();
	}
}

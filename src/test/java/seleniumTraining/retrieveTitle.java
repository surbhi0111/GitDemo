package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class retrieveTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		String title = driver.getTitle();
		
		System.out.println("Title is : " + title);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
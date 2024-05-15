package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingiFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//get Frame Count
		getFrameCount(driver);
		
		
		//Switch by Index
//		driver.switchTo().frame(0);
//		Thread.sleep(3000);
//		
//		//Switch back to the main window
//		driver.switchTo().defaultContent();
//				
//		//Switch by frame name
//		driver.switchTo().frame("iframe1");
//		Thread.sleep(3000);
//		
//		//Switch back to the main window
//		driver.switchTo().defaultContent();
//		
//		//Switch by frame ID
//		driver.switchTo().frame("IF1");
//		Thread.sleep(3000);
//		
//		//Switch back to the main window
//		driver.switchTo().defaultContent();
		
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		
		//now we can use the switch command
		driver.switchTo().frame(iframeElement);
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		//Switch back to the main window
		driver.switchTo().defaultContent();
		
		driver.quit();

		
	}
	
	public static void getFrameCount(WebDriver driver) {
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
	}
}

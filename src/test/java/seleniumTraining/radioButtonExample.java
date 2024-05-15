package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div//label[@class='custom-control-label']")).click();
		
		Thread.sleep(3000);
		
		
		
		
		
//		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
//		if(checkBox1.isSelected() == false) {
//			System.out.println("Not Selected ");
//			checkBox1.click();
//		}
//		else
//			System.out.println("Selected");
		
		driver.quit();
	}
	
	
}

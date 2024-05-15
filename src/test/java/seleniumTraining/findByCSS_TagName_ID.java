package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCSS_TagName_ID {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("Himanshu.tayal@coforge.com");
		
	}
}

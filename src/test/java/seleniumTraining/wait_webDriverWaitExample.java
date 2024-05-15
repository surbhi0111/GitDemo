package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_webDriverWaitExample {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement username = driver.findElement(By.id("userName"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(username));
		
		username.sendKeys("Himanshu");
	}
}

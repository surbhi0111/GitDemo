package seleniumTraining;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_fluentWaitExample {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement username = driver.findElement(By.id("userName"));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(5));
		wait.pollingEvery(Duration.ofMillis(250));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		
		username.sendKeys("Himanshu");
	}
}

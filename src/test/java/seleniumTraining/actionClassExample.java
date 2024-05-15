package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Actions action = new Actions(driver);
		
		WebElement btnRightClick = driver.findElement(By.id("doubleClickBtn"));
		action.contextClick(btnRightClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
		.build().perform();
		Thread.sleep(3000);
		
		driver.quit();
	}
}

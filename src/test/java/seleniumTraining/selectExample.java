package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		//OLD TYPE OF DROPDOWN
		
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
//		select.selectByIndex(2);
//		select.selectByValue("5");
//		select.selectByVisibleText("White");
//		
//		List<WebElement> options = select.getOptions();
//		
//		WebElement firstOption = select.getFirstSelectedOption();
//		
//		Thread.sleep(3000);
		
		//NEW TYPE OF DROPDOWN
		
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("Group");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}
}	

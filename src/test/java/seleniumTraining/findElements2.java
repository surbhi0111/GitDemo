package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		clickElementGropu(driver, "Forms");
		
	}
	
	public static void clickElementGropu(WebDriver driver, String expElementName) {
		List<WebElement> elementGroup = driver.findElements(By.xpath("//div[@class='element-group']"));
		System.out.println(elementGroup.size());
		for(int i = 1 ; i <= elementGroup.size() ; i++) {
			WebElement elementName = driver.findElement(By.xpath("//div[@class='element-group']["+i+"]//div[@class='header-text']"));
			if(elementName.getText().equalsIgnoreCase(expElementName))
			System.out.println(elementName.getText());
		}
	}
}

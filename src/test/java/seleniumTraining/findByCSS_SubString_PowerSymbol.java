package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCSS_SubString_PowerSymbol {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("input[id^=userN]")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input[id^=userE]")).sendKeys("Himanshu.tayal@coforge.com");
		
	}
}

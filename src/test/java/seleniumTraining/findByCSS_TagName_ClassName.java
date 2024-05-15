package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCSS_TagName_ClassName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("input. mr-sm-2 form-control")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input.mr-sm-2 form-control")).sendKeys("Himanshu.tayal@coforge.com");
		
	}
}

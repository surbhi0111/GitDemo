package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCSS_TagName_ClassName_Attribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
//		driver.findElement(By.cssSelector("input[id=userName]")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[id=userEmail]")).sendKeys("Himanshu.tayal@coforge.com");
		
	}
}

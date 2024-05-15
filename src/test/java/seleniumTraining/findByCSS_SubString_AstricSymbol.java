package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCSS_SubString_AstricSymbol {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("input[id*=me]")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input[id*=mail]")).sendKeys("Himanshu.tayal@coforge.com");
		
	}
}

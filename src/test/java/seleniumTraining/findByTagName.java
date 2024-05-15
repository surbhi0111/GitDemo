package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box/");
		
		List<WebElement> inputTags = driver.findElements(By.tagName("input"));
		System.out.println(inputTags.size());
		for(int i = 0 ; i <= inputTags.size() ; i++) {
			String idName = inputTags.get(i).getAttribute("id");
			if(idName.equalsIgnoreCase("userName"))
				inputTags.get(i).sendKeys("Himanshu");
		}
	}
}

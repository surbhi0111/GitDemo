package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
//		driver.get("https://demoqa.com/text-box");
		
		WebElement userName_TextBox = driver.findElement(By.id("userName"));
		
//		perform click operation
		userName_TextBox.click();
		Thread.sleep(1000);
		
//		send data to input
		userName_TextBox.sendKeys("Himanshu");
		Thread.sleep(1000);
		
		String getTextBoxValue = userName_TextBox.getAttribute("value");
		System.out.println("Value in Text Box is :" + getTextBoxValue);
		
		userName_TextBox.clear();
		Thread.sleep(3000);
		
		String placeHolderValue = userName_TextBox.getAttribute("placeholder");
		System.out.println("Value under placeholder tag is : " +placeHolderValue);
		
		
		String userNameLabel = driver.findElement(By.id("userName-label")).getText();
		System.out.println("Label value is : " + userNameLabel);
		
		driver.close();
		
	}
}

package seleniumTraining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);        
		//Copy the file to a location and use try catch block to handle exception
		try {
			FileUtils.copyFile(screenshot, new File("D:\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

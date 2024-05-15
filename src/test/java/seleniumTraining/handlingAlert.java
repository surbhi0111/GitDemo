package seleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    
	  // This step will result in an alert on screen
	    driver.findElement(By.id("promtButton")).click();
	    
	    Alert simpleAlert = driver.switchTo().alert();
	    
	    Thread.sleep(3000);
	    
	    String alretData = simpleAlert.getText();
	    
	    System.out.println(alretData);
	    simpleAlert.sendKeys("Himanshu");
	    Thread.sleep(2000);
	    simpleAlert.accept();
//	    simpleAlert.dismiss();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	    
//	    Time alert
	   // This step will result in an alert on screen
	   /* WebElement element = driver.findElement(By.id("confirmButton"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	    Alert confirmationAlert = driver.switchTo().alert();
	    String alertText = confirmationAlert.getText();
	    System.out.println("Alert text is " + alertText);
	    confirmationAlert.accept();
	    */
	    
	}
}

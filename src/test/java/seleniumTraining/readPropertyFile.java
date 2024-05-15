package seleniumTraining;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readPropertyFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		FileReader reader=new FileReader("D:\\TestData.properties");
        Properties props=new Properties();
        props.load(reader);
          
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
  
        driver.get(props.getProperty("searchTerm"));
        System.out.println(props.getProperty("userid"));
        Thread.sleep(2000);
        driver.close(); 
	}
}

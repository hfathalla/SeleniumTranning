package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
	
		
		
		WebDriver driver = new ChromeDriver() ;
		
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		
		//driver.findElement(By.name()).click();
		
		//Alert alert = driver.switchTo().alert();
		
		//String text=alert.getText();
		
	}

}

package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_ImplicitlyWaitForElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//imp wait will be applied for all the web elements by defult
		//global wait
		
		
		driver.get("https://app.hubspot.com/login");	
		Thread.sleep(2000);
		

		driver.findElement(By.id("username")).sendKeys("Hendfathalla543@gmail.com");
		
		
		
		
	}

}

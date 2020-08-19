package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Hend");
		driver.findElement(By.id("confirmbtn")).click();
		
		
		Alert alert = driver.switchTo().alert()	;
		String text =alert.getText();
		System.out.println(text);
		alert.accept();
		

		if(text.equals("Hello Hend, Are you sure you want to confirm?")){
			System.out.println(" Correct text ");
			
		}else{
			System.out.println(" Incorrect text ");	
		
		}
	}

}

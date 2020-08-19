package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("Hend");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert()	;
		String text =alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		if(text.equals("Hello Hend, share this practice page and share your knowledge")){
			System.out.println(" Correct text ");
			
		}else{
			System.out.println(" Incorrect text ");	
			
		}
	}

}

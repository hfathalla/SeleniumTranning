package SeleniumMethods;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	Alert alert = driver.switchTo().alert()	;
	String text =alert.getText();
	System.out.println(text);
	alert.accept();
Thread.sleep(5000);

	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();	
	  Alert alert1 = driver.switchTo().alert()	;
		String text1 =alert.getText();
		System.out.println(text1);
		alert.accept();
		Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		 Alert alert2 = driver.switchTo().alert()	;
			String text2 =alert.getText();
			System.out.println(text2);
			alert.accept(); 
		driver.close(); 
		 
	}

}

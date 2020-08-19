package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertHandled13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.partialLinkText("Alert With T")).click();
	
	driver.findElement(By.id("Textbox")).click();
	
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Hend");
	Thread.sleep(3000);
	alert.accept();
	}

}

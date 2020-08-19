package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlareHandled11 {

	public static void main(String[] args) throws InterruptedException {
		//Alert are pop up boxes that you must interact with them
		//Alert boxes take your focus away from the current browsers
		//other parts of the web page can't be accessed until the alert is handled
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
	
		
		driver.findElement(By.id("OKTab")).click();
		Thread.sleep(5000);
		
	Alert alert = driver.switchTo().alert()	;
	String text =alert.getText();
	System.out.println(text);
	alert.accept();
	Thread.sleep(3000);
	driver.quit();
	}

}

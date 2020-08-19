package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement5_5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		
		
	driver.findElement(By.id("yes")).click();
		Thread.sleep(5000);
	 driver.findElement(By.xpath(" //input[@value='Reset']")).click();
		
		
		driver.findElement(By.id("no")).click();
	
		driver.findElement(By.id("buttoncheck")).click();
		
		
	}

}

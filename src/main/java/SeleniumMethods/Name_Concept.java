package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Concept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("No, thanks!")).click();
		Thread.sleep(3000);
		
	WebElement message   =	driver.findElement(By.id("user-message"));
	message.sendKeys("Hend Fathalla");	
	
		driver.findElement(By.xpath(" //button[contains(text(),'Show Message')] ")).click();
		String text =driver.findElement(By.xpath("//span [@id='display']")).getText();
System.out.println(text);	
	
	
	if ( text.equals("Hend Fathalla")) {
		System.out.println("correct text");
	}else{
		System.out.println("incorrect text");
	}
	//driver.close();
	System.out.println("text completed");
	

	
}
}
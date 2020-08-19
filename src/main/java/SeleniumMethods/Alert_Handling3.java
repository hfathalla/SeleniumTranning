package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Handling3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
		
		driver.findElement(By.xpath(" //button[contains(text(),'Click for Prompt Box')]")).click();
		Thread.sleep(5000);
		
	Alert alert = driver.switchTo().alert()	;
	String text =alert.getText();
	System.out.println(text);
	
	if (ElementUtil.getAlertText(driver).equals("Please enter your name")) {
		System.out.println("correct text");
	}else{
		System.out.println("incorrect text");
	}
	driver.close();
	System.out.println("text completed");
	}

}

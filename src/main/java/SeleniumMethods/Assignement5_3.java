package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement5_3 {

	public static void main(String[] args)  {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/payment-gateway/process_purchasetoy.php");
	
		
		WebElement CardNumber = driver.findElement(By.id("card_nmuber"));
		CardNumber.sendKeys("12345678902");
		WebElement ExpirationMonth = driver.findElement(By.id("month"));
		ExpirationMonth.sendKeys("05");
		WebElement ExpirationYear = driver.findElement(By.id("year"));
		ExpirationYear.sendKeys("2018");
		WebElement CvvCode = driver.findElement(By.id("cvv_code"));
		CvvCode.sendKeys("123");
	WebElement ClickOnPay = driver.findElement(By.xpath("//input[@name='submit']"));
	ClickOnPay.click();
		
	Alert alert = driver.switchTo().alert()	;
	String text =alert.getText();
	System.out.println(text);
	alert.accept();
		
	if (text.equals("Check card number is 16 digits!")) {
		System.out.println("Text is correct");
	}else{
		System.out.println("Text is not correct");
	}
	}

}

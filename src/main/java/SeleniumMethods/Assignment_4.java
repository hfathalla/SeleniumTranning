package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		 driver.findElement(By.xpath("//button[text()='Generate Alert Box']")) .click();
		 
		 Thread.sleep(2000);
			getCallAlert(driver); 
		}
	public static void getCallAlert(WebDriver driver){ 
		Alert alert = driver.switchTo().alert()	;
		String text =alert.getText();
		System.out.println(text);
		
		if (ElementUtil.getAlertText(driver).equals("hi, JavaTpoint Testing")) {
			System.out.println("correct text");
		}else{
			System.out.println("incorrect text");
		}
		
		System.out.println("text completed");
}
}
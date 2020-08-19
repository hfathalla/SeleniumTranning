package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement5_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.name("submit"));
		
		JavaScriptUtil.flash(email, driver);
		email.sendKeys("Hendfathalla543@yahoo.com");
		
		JavaScriptUtil.flash(password, driver);
		password.sendKeys("semo123@");
		
		JavaScriptUtil.flash(loginBtn, driver);
		loginBtn.click();
		
		JavaScriptUtil.generateAlert(driver,"Enter your Email address and password correct");
		
		Alert alert = driver.switchTo().alert()	;
		String text =alert.getText();
		System.out.println(text);
		alert.accept();
		
	}

}

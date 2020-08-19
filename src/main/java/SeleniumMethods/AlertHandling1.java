package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		//set browser
		
		
		WebDriver driver = new ChromeDriver() ;
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text=alert.getText();
		
		
		
		if(text.equals("please enter a valid user name")){
			System.out.println("Correct text:"+text);
			
		}else{
			System.out.println("Incorrect text:"+text);	
			
		}
		//alert.accept();//OK
		
		alert.dismiss();//cancel
		driver.quit();
	}

}

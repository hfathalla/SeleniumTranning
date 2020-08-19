package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_AlertHandeling_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		//set browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver() ;
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//locators
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		//to handle alert we will use alert interface
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		//Verification 
		if (text.equals("please enter the valid name")){
			System.out.println("conrrect text :" + text);
		}else{
			System.out.println(" inconrrect text :" + text);
		}
		
		
		
		alert.dismiss();
		
		//alert.accept();
		//driver.quit();
		driver.close();
		System.out.println("Test completed");
	}

}

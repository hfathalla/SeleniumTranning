package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement5_4 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		
	driver.findElement(By.id("uploadfile_0")).sendKeys("/Users/mohannaelhetawy/Desktop/pdf file.rtf");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
driver.findElement(By.id("submitbutton")).click();		
		
		
		
	}

}

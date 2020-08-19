package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_7 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.designmantic.com/");
		
	driver.findElement(By.id("selectservice")).sendKeys("Business Card");
	
	driver.findElement(By.id("company_name")).sendKeys("DesignMantic");
	

	driver.findElement(By.id("details_categories")).sendKeys("Catering");
	
	
	driver.findElement(By.xpath("//span[text()='Show My Designs Free ']")).click( );
	
	
	}

}

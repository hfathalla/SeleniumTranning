package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicitlyWait_1 {

	public static void main(String[] args) {
	
	//it works with webelement and non_webelement	
	//it waits avaliable in webdriverwait class	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
//non_element
WebDriverWait wait = new WebDriverWait(driver,15);		
wait.until(ExpectedConditions.titleContains("HubSpot"));

By email = By.id("username");
wait.until(ExpectedConditions.presenceOfElementLocated(email));
WebElement username=driver.findElement(email);
System.out.println("title is "+driver.getTitle());


	}

}

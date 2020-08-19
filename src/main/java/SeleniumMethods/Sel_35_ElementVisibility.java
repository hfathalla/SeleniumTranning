package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibility {

	public static void main(String[] args) {
		
//is Displayed
//isEnabled
//isSelected		
//element visibility		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://classic.crmpro.com/register/");
		
		WebElement submitElement =driver.findElement(By.id("submitButton"));
		
System.out.println("Befor submit button");
System.out.println(submitElement.isDisplayed());		
System.out.println(submitElement.isEnabled());

System.out.println("line 30 is " +driver.findElement(By.name("agreeTerms")).isSelected());		

driver.findElement(By.name("agreeTerms")).click();

System.out.println("line 34 is " +driver.findElement(By.name("agreeTerms")).isSelected());


System.out.println("After submit button");
System.out.println(submitElement.isDisplayed());		
System.out.println(submitElement.isEnabled());

	}

}

package SeleniumMethods;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		 driver.findElement(By.id("testingDropdown")) .click();
		selectSingleValue(driver,"Database Testing","Performance Testing","Manual Testing","Automation Testing");
			}
				
				
	public static Boolean selectSingleValue(WebDriver driver, String...value ){
		if(value.equals("Database Testing&&Performance Testing&&Manual Testing&&Automation Testing")){
			System.out.println("it is mutliple");
		
		}else{
			System.out.println("is not multiple");
		}
		return true;	
				
					  
		}
}
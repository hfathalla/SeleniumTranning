package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		 driver.findElement(By.id("testingDropdown")) .click();
		selectSingleValue(driver,"Database Testing");
			}
				
		public static void selectSingleValue(WebDriver driver,String value ) { 
		 List<WebElement>dropList =driver.findElements(By.xpath(" //select[@id='testingDropdown']/option"));
				   
				   System.out.println(dropList.size());
				   
				  for (int i = 0; i < dropList.size(); i++) {
			
					  String text = dropList.get(i).getText();  
				System.out.println(text);
				 
				  }
	}

}

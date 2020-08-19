package SeleniumMethods;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.testandquiz.com/selenium/testing.html");
 driver.findElement(By.id("testingDropdown")) .click();
selectSingleValue(driver,"Database Testing");
	}
		
public static void selectSingleValue(WebDriver driver,String value ) { 
 List<WebElement>dropList =driver.findElements(By.xpath(" //option[@id='database']"));
		   
		   System.out.println(dropList.size());
		   
		  for (int i = 0; i < dropList.size(); i++) {
	
			  String text = dropList.get(i).getText();  
		System.out.println(text);
		 
		 
			if(text.equals(value)) {
				dropList.get(i).click();
				System.out.println( " database is selected");
			
			}else{
				System.out.println("database is not selected ");
		}

		
       
	

		  }
	}
}

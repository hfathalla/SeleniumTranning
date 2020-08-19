package SeleniumMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
      driver.findElement(By.xpath("//*[@id='dropdown-class-example']/option[4]")).click();

	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	Select select = new Select(dropdown);  
	System.out.println(select.isMultiple());
	
	WebElement option = select.getFirstSelectedOption();
	String selectoption = option.getText();
	System.out.println(selectoption);

	}

}

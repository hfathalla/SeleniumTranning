package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ImplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		
		System.out.println("title is"+driver.getTitle());

		//this wait tells webdriver to wait if the element is not available immidiatelly
		//and webdriver waits till the element is visible is visible in specific time
		// it will throw nosuchelementexeption
		//Imp wait can be used only elements ==not non_element
		
	}

}

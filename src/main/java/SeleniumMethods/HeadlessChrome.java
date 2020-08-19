package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--headless");
	
	
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}

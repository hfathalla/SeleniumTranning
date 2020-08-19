package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/mohannaelhetawy/Documents/Drivers/geckodriver");
		
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(ff);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}

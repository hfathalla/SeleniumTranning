package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLacotor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
	
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		By username =By.cssSelector("#username");
		ElementUtil.getElement(driver, username).sendKeys("LAStlocator@gmail.com");
		By password =By.cssSelector("#password");
		ElementUtil.getElement(driver, password).sendKeys("qwe1234");
		
		By loginBtn = By.cssSelector("#loginBtn");
}
}
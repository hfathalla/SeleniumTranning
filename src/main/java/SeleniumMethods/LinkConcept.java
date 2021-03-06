package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();//to maximize web page
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		
		
		By signUp =By.linkText("sign up");
		ElementUtil.getElement(driver, signUp).click();
		
	}

}

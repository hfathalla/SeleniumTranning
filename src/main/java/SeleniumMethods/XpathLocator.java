package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Xpath is used to find location of element on the web page using HTML structure(xML)
		//Absolute (/) Relative(//)
		//
		////tagName[@attribute Name='value']
	System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
	
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		WebElement userElement = driver.findElement(By.xpath("//input[@id ='username']"));
userElement.sendKeys("Hfathalla543@gmail.com");
	
WebElement password = driver.findElement(By.xpath("//input[@id ='password']"));
password.sendKeys("123test@");

By username = By.xpath("//input[@id ='username']");
By Password = By.xpath("//input[@id ='password']");

ElementUtil.getElement(driver, username).sendKeys("Hfathalla543@gmail.com");
ElementUtil.getElement(driver, Password).sendKeys("123test@");

	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_20_Dropdown_4 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
		
		
		driver.get("https://www.facebook.com");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
	selectDropdownByIndex(driver, day, 23);	
	selectDropdownByIndex(driver,month, 1);
	selectDropdownByIndex(driver, year, 2017);
	}
	
	/**
	 * Visible Text
	 * @param driver
	 * @param value
	 */
	
	public static void selectDropdownByIndex(WebDriver driver,By locator, int index){
	
		WebElement element =getElement(driver, locator);
		Select select =new Select(element);		
		select.selectByIndex(index);
	}
	/**
	 * Get Element
	 * @param driver
	 * @param locator
	 * @return
	 */
	
	
	
	public static WebElement getElement(WebDriver driver,By locator){
	WebElement element =driver.findElement(locator);
	return element;
	}

}

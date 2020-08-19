package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_13_CssSeelctor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//ChromeOption --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By username = By.cssSelector("#username") ;
		ElementUtil.getElement(driver, username).sendKeys("hfathalla543@gmail.com");
		By password = By.cssSelector("#password");
		ElementUtil.getElement(driver, password).sendKeys("123selim@");
		By loginBut = By.cssSelector("#loginBut");
		
		ElementUtil.getElement(driver,loginBut).click();
		
	//tag name	
		
	}

}

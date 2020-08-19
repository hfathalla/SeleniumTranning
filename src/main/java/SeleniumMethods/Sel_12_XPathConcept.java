package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_XPathConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//ChromeOption --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);	
		
	WebElement userElement =driver.findElement(By.xpath("//input[@id=username]"));	
	userElement.sendKeys("Hfathalla543@gmail.com");	
		
	WebElement pass =driver.findElement(By.xpath("//input[@id=password]"));	
	pass.sendKeys("123ser@");		
		
	WebElement loginBut =driver.findElement(By.xpath("//input[@id=password]"));	
	loginBut.click();
	
	By username = By.xpath("//input[@id=username]");
	By passwrd = By.xpath("//input[@id=password]");
	By LoginBtn =By.xpath("//input[@id=password]");
	
	ElementUtil.getElement(driver, username).sendKeys("Hfathalla543@gmail.com");
    ElementUtil.getElement(driver, passwrd).sendKeys("123ser@");
	ElementUtil.getElement(driver, LoginBtn).click();
	
	}

}

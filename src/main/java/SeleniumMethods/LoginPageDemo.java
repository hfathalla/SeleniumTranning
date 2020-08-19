package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageDemo {

	public static WebDriver driver;
	
	static By email = By.id("username"); 
	static By password =By.xpath("//input[@id='password']");
	static By loginBtn =By.cssSelector("#logninBtn");
	
	public static void main(String[] args) throws InterruptedException {
	String url ="https://app.hubspot.com/login"	;
	driver =ElementUtil.launchBrowser(driver,"cgrome");	
ElementUtil.launchURL(driver, url);
Thread.sleep(5000);

ElementUtil.getElement(driver, email).sendKeys("hfathalla543@gmail.com");
ElementUtil.getElement(driver, password).sendKeys("1232@WER");
ElementUtil.getElement(driver,loginBtn).click();
ElementUtil.quitBrowser(driver);
	}

}

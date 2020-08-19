package SeleniumMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_14_loginPage {
public static WebDriver driver;
	
	static By email = By.id("username");
	static By password = By.xpath("//input[@id=password]");
	static By loginBtn =By.cssSelector("#loginBtn");
	
	
	public static void main(String[] args) throws InterruptedException {
		
driver = ElementUtil.launchBrowser(driver,"chrome");

ElementUtil.launchURL(driver,"https://app.hubspot.com/login" );
Thread.sleep(5000);

ElementUtil.getElement(driver,email).sendKeys("hfathalla543@gmail.com");
ElementUtil.getElement(driver, password).sendKeys("123selim@");
ElementUtil.getElement(driver,loginBtn).click();
ElementUtil.quitBrowser(driver);


	}

}

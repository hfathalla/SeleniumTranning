package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_08_IDConcept {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();//ChromeOption --maximize
driver.manage().deleteAllCookies();
driver.get("https://app.hubspot.com/login");
Thread.sleep(5000);

//ID
//ID is a locator in DOM(HTML)id is unique

//first user
WebElement userElment = driver.findElement(By.id("username"));
userElment.sendKeys("hfathalla543@gmail.com");
WebElement userPass =driver.findElement(By.id("password"));
userPass.sendKeys("1234sde@");
WebElement loginBtn =driver.findElement(By.id("loginBtn"));
loginBtn.click();

//Second usage
driver.findElement(By.id("username")).sendKeys("hfathalla543@gmail.com");
driver.findElement(By.id("password")).sendKeys("1234sde@");

//third usage
By username = By.id("username");
By password =By.id("password");
WebElement usElement = driver.findElement(username);
userElment.sendKeys("hfathalla543@gmail.com");

//Fourth usage 

ElementUtil.getElement(driver,username).sendKeys("hfathalla543@gmail.com");
ElementUtil.getElement(driver,password).sendKeys("1234sde@");

	}

}

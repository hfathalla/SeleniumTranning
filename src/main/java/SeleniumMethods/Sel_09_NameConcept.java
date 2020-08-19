package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/login");
Thread.sleep(3000);

//First Usage
WebElement userElemnt =driver.findElement(By.name("username"));
userElemnt.sendKeys("Hfathalla543@gmail.com");

//second usage
driver.findElement(By.name("username")).sendKeys("Hfathalla543@gmail.com");

//Third usage
By username = By.name("username");
By pass = By.name("password");
WebElement element =driver.findElement(username);
element.sendKeys("Hfathalla543@gmail.com");

//fourth usage
ElementUtil.getElement(driver, username).sendKeys("Hfathalla543@gmail.com");
ElementUtil.getElement(driver, pass).sendKeys("123ewd@");

	}

}

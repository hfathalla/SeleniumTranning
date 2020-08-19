package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	https://app.hubspot.com/login
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//ChromeOption --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
	//	form-control private-form__control login-email
	
	By username =By.className("login-email");
	ElementUtil.getElement(driver, username)	.sendKeys("hfathalla543@gmail.com");
	
//	class="form-control private-form__control login-password m-bottom-3"
	
	
	
	
	
	}

}

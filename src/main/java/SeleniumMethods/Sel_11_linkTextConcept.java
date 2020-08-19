package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_linkTextConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//ChromeOption --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
	By signUp =	By.partialLinkText("sign up");
//	By signUpPar = By.partialLinkText("Privacy");
	ElementUtil.getElement(driver, signUp).click();
		
		
		
		
		
	}

}

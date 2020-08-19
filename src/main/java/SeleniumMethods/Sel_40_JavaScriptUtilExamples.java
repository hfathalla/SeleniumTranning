package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_40_JavaScriptUtilExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://app.hubspot.com/login");
		driver.get("https://darksky.net/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
    //  System.out.println(driver.getTitle());

//get title with JS
String title = JavaScriptUtil.getTitleByJS(driver);

System.out.println(title);

//click with JS
//WebElement signUpLink = driver.findElement(By.linkText("sign up"));
//JavaScriptUtil.clickElementByJS(signUpLink, driver);
//Thread.sleep(5000);

//refresh with JS
//JavaScriptUtil.refreshBrowserByJS(driver);
//generate alert
//JavaScriptUtil.generateAlert(driver,"this page is sign up page");   


//send key method
//WebElement username = driver.findElement(By.id("username"));
//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "hendfathalla543@yahoo.com");
//JavaScriptUtil.drawBorder(username, driver);

//flash method with JS
//WebElement username = driver.findElement(By.id("username"));
//WebElement password = driver.findElement(By.id("password"));
//WebElement loginButton = driver.findElement(By.id("loginBut"));
//
//JavaScriptUtil.flash(username, driver);
//username.sendKeys("hendfathalla543@yahoo.com");
//
//JavaScriptUtil.flash(password, driver);
//password.sendKeys("semo123");
//
//JavaScriptUtil.flash(loginButton, driver);
//loginButton.click();



//System.out.println(JavaScriptUtil.getPageInnerText(driver));

//System.out.println(JavaScriptUtil.getBrowserInfo(driver));

//JavaScriptUtil.scrollPageDown(driver);

//JavaScriptUtil.specificScrollPageDown(driver);

WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
JavaScriptUtil.scrollIntoView(privacy, driver);
JavaScriptUtil.clickElementByJS(privacy, driver);


	}

}

package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_42_LaunchBrowser {
public static WebDriver driver;
	public static void main(String[] args) {
	
     String browser = "chrome";
     if (browser.equalsIgnoreCase("chrome")){
    	WebDriverManager.chromedriver().setup(); 
    	driver= new ChromeDriver();
     }else if(browser.equals("firefox")){
    	 WebDriverManager.firefoxdriver().setup();
    	 driver =new FirefoxDriver();

    	 }else if(browser.equals("IE")){
    	 	WebDriverManager.iedriver().setup();
    	 	driver =new InternetExplorerDriver();
    	 	
    	 }else if (browser.equals("opera")){
    	 WebDriverManager.operadriver().setup();
    	 driver = new OperaDriver();
    	 }else{
    	 	System.out.println("no defined browser");
    	 
    	 }
    	
    	driver.get("https://www.amazon.com");
    	
    	
     
     
     
     
     
     
     
	}

}

package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.Identified.Narrowable;

public class LaunchBrowserConcept {
public static WebDriver driver;

	public static void main(String[] args) {
		
     String browser ="chrome";

if (browser.equals("chrome")){
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	
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

driver.get("https://learnsdet.com/");

   
	}

}

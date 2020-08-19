package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_28_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
	//thread sleep is not part of the selenium == commom method in java	
	//it is a static wait
	//it is used to slow down or thread on a web page
		
	Thread.sleep(5000);	
	System.out.println("title is"+driver.getTitle());	
	}

}

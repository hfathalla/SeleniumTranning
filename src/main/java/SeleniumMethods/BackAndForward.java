package SeleniumMethods;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForward {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
	 WebDriverManager.chromedriver().setup();
	  
	     
	     WebDriver driver =new ChromeDriver();
	     
	  
	     
	     driver.get("https://www.google.com");//google
		
         driver.navigate().to("https://www.amazon.com");//amazon
        Thread.sleep(2000);//Ms ==2 second
         
         driver.navigate().back();//google
         Thread.sleep(2000);
         
         driver.navigate().forward();//amazon
         Thread.sleep(2000);
         
         driver.navigate().back();//google
         Thread.sleep(2000);
         
         driver.navigate().back();//amazon
         
         driver.navigate().refresh();
         
        driver.quit(); 
       
      
        
	}

}

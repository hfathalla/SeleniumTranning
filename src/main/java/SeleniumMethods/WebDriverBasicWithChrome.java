package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicWithChrome {
	
	

	public static void main(String[] args) {
	//Set property	

		System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		//set browser
		
		
		WebDriver driver = new ChromeDriver() ;
		
		//launch browser
		driver.get("https://siliconelabs.com/");
		
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		if(title.equals("Best Certified SEDT Training - Siliconelabs")){
			System.out.println("Title is corect");
		}else{
			System.out.println("Title is not corect");	
		}
		
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	if(url.equals("https://siliconelabs.com/")){
		System.out.println("url is corect");
	}else{
		System.out.println("url is not corect");
	}
	
	//driver.close();	//close current browser
	driver.quit(); //closes all browsers
		
		
	}

}

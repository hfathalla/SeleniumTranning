package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_12_DropdownWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/mohannaelhetawy/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
	List<WebElement>dayList	 = driver.findElements(By.xpath("//select[@id='day']/option"));
	
	System.out.println(dayList.size());
	
	for (int i = 0; i <dayList.size(); i++) {
String text	=dayList.get(i).getText();
System.out.println(text);
if (text.equals("9")) {
dayList.get(i).click();	
break;
         }
	  }
	}

}
